package _240418_LOAL_Stack;

public class Stack {

    // there are all values stored
    private int[] values;

    // current position in stack - starts with 0 means empty
    private int topOfStack = 0;

    public Stack(int sizeOfStack) {
        values = new int[sizeOfStack];
    }

    public boolean isFull(){
        return values.length == topOfStack;
    }

    public boolean isEmpty(){
        return topOfStack == 0;
    }

    // add an element on top of the stack - if possible!
    public void push(int element){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        values[topOfStack++] = element;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        return values[--topOfStack];
    }

    // your turn: implement toString
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < topOfStack; i++){
            sb.append(values[i] + ((i == topOfStack-1) ? "" : ","));
        }
        sb.append("]");

        return sb.toString();
    }
}
