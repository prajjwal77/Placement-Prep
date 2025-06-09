import java.util.Stack;

// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class:
class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
     // The main stack to store all elements
    public MinStack() {
        stack = new Stack<>();// Initialize the main stack
        minStack = new Stack<>();// Initialize the minStack to keep track of minimum elements
    }
     // Push element val onto the stack.
    public void push(int val) {
        stack.push(val);
        // If minStack is empty or new val is smaller or equal, push to minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Removes the element on the top of the stack.
    public void pop() {
        if (stack.isEmpty()) return;
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }
    // Get the top element of the stack.
    public int top() {
        return stack.peek();
    }

     // Retrieve the minimum element in the stack.
    public int getMin() {
        return minStack.peek();
    }

    //print all minstack element
    public void printStack() {
        System.out.println("Main Stack: " + stack);
        System.out.println("Min Stack: " + minStack);
    }

    public static void main(String[] args) {
            MinStack minStack = new MinStack();
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);
            System.out.println(minStack.getMin()); // Returns -3
            minStack.pop();
            System.out.println(minStack.top());    // Returns 0
            System.out.println(minStack.getMin()); // Returns -2

            minStack.printStack(); // Print the contents of both stacks
            
    }
}
