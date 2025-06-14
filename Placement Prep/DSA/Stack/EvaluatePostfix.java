import java.util.Stack;

public class EvaluatePostfix {
     public static int evaluatePostfix(String postfix) {
          String[] tokens = postfix.split(" ");
          Stack<Integer> stack = new Stack<>();
     
          for (String token : tokens) {
               if (isOperator(token)) {
                    int b = stack.pop();
                    int a = stack.pop();
                    int result = applyOperator(a, b, token);
                    stack.push(result);
               } else {
                    stack.push(Integer.parseInt(token));
               }
          }
     
          return stack.pop();
     }
     private static boolean isOperator(String token) {
          return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
     }
     private static int applyOperator(int a, int b, String operator) {
          switch (operator) {
               case "+":
                    return a + b;
               case "-":
                    return a - b;
               case "*":
                    return a * b;
               case "/":
                    return a / b;
               default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
          }
     }
     public static void main(String[] args) {
            String postfix = "23 34 + 45 56 + *";
            int result = evaluatePostfix(postfix);
            System.out.println("Result: " + result);
     }
}
