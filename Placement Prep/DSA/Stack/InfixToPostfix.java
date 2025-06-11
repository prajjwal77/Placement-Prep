
import java.util.Stack;


public class InfixToPostfix {
     // Function to return precedence of operators
     private static int precedence(char operator) {
          switch (operator) {
               case '+':
               case '-':
                    return 1;
               case '*':
               case '/':
                    return 2;
               case '^':
                    return 3;
               default:
                    return -1; // Invalid operator
          }
     }
     public static String convertInfixToPostfix(String infix) {
          StringBuilder postfix = new StringBuilder();
          Stack<Character> stack = new Stack<>();
          String[] tokens = infix.split(" ");

          for (String token : tokens) {
               char ch = token.charAt(0);
               if (Character.isLetterOrDigit(ch)) {
                    postfix.append(token).append(" ");
               } else if (ch == '(') {
                    stack.push(ch);
               } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                         postfix.append(stack.pop()).append(" ");
                    }
                    stack.pop(); // Pop the '('
               } else { // Operator
                    while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                         postfix.append(stack.pop()).append(" ");
                    }
                    stack.push(ch);
               }
          }

          while (!stack.isEmpty()) {
               postfix.append(stack.pop()).append(" ");
          }

          return postfix.toString().trim();
     }

     public static void main(String[] args) {
          // Convert infix expression to postfix using stack
          String infix = "A + B * C - D / E";
          String postfix = convertInfixToPostfix(infix);
          System.out.println("Infix: " + infix);
          System.out.println("Postfix: " + postfix);
     }
}
