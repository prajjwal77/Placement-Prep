import java.util.Stack;


public class InfixToPrefix {
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
     // Function to convert infix expression to prefix
     public static String convertInfixToPrefix(String infix) {
          // Reverse the infix expression
          StringBuilder reversedInfix = new StringBuilder(infix).reverse();
          String[] tokens = reversedInfix.toString().split(" ");
          Stack<Character> stack = new Stack<>();
          StringBuilder prefix = new StringBuilder();

          for (String token : tokens) {
               char ch = token.charAt(0);
               if (Character.isLetterOrDigit(ch)) {
                    prefix.append(token).append(" ");
               } else if (ch == ')') {
                    stack.push(ch);
               } else if (ch == '(') {
                    while (!stack.isEmpty() && stack.peek() != ')') {
                         prefix.append(stack.pop()).append(" ");
                    }
                    stack.pop(); // Pop the ')'
               } else { // Operator
                    while (!stack.isEmpty() && precedence(ch) < precedence(stack.peek())) {
                         prefix.append(stack.pop()).append(" ");
                    }
                    stack.push(ch);
               }
          }

          while (!stack.isEmpty()) {
               prefix.append(stack.pop()).append(" ");
          }

          // Reverse the result to get the final prefix expression
          return prefix.reverse().toString().trim();
     }
     public static void main(String[] args) {
          // Example infix expression
          String infix = "A + B * C - D / E";
          
          // Convert infix to prefix
          String prefix = convertInfixToPrefix(infix);
          
          // Print the result
          System.out.println("Infix: " + infix);
          System.out.println("Prefix: " + prefix);
     }
}
