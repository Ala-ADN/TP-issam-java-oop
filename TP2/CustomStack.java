package TP2;

public class CustomStack{
    private int size;
    private Object[] stack;
    private int top;
    public CustomStack(int size) {
        this.size = size;
        this.stack = new Object[size];
        this.top = -1;
    }
    public void AddElement(Object element) {
        if (top == size - 1) {
            throw new IllegalArgumentException("Stack is full");
        }
        top++;
        stack[top] = element;
        System.out.println("Element added successfully");
    }
    public void RemoveElement() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        top--;
        System.out.println("Element removed successfully");
    }
    public Object LastInStack() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return stack[top];
    }
    public boolean StackIsEmpty() {
        return top == -1;
    }
    public boolean StackIsFull() {
        return top == size - 1;
    }
    
    public static void main(String[] args) {
        CustomStack num_stack = new CustomStack(5);
        num_stack.AddElement(1);
        num_stack.AddElement(2);
        num_stack.AddElement(5);
        num_stack.AddElement(35);
        num_stack.AddElement(999999999);
        System.out.println("num_stack is full: " + num_stack.StackIsFull());
        System.out.println("num_stack top: " + num_stack.LastInStack());
        num_stack.RemoveElement();
        System.out.println("num_stack top: " + num_stack.LastInStack());

        CustomStack char_stack = new CustomStack(10);
        char_stack.AddElement('a');
        char_stack.AddElement('$');
        System.out.println("char_stack is full: " + char_stack.StackIsFull());
        System.out.println("char_stack top: " + char_stack.LastInStack());
        char_stack.RemoveElement();
        char_stack.RemoveElement();
        System.out.println("char_stack is empty: " + char_stack.StackIsEmpty());

    }
}

