import java.io.*;
import java.util.*;

class Stack1{
    static void S_push(Stack<Integer> stack){

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void S_pop(Stack<Integer> stack){
        System.out.println("Pop OPeration");

        for (int i = 0; i < 5; i++) {
            Integer a = (Integer) stack.pop();
            System.out.println(a);
        }
    }

    static void S_peek(Stack<Integer> stack){
        Integer ele = (Integer) stack.peek();
        System.out.println("Top Element in Stack is : " +ele);
    }

    static void S_search(Stack<Integer> stack, int element){
        Integer posi = (Integer) stack.search(element);

        if(posi == -1){
            System.out.println("Element not Found !");
        }
        else{
            System.out.println("Element Found At Position : " +posi);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        S_push(stack);
        S_pop(stack);
        S_push(stack);
        S_peek(stack);
        S_search(stack, 3);
    }
}