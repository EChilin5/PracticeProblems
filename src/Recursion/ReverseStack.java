package Recursion;

import java.util.Stack;

public class ReverseStack {

    public static Stack<Integer>  revStack(Stack<Integer> stack){
        Stack<Integer> res = new Stack<>();
        return rev(stack, res);
    }

    public static Stack<Integer> rev(Stack<Integer> stack, Stack<Integer> res){
        if(stack.empty()){
            return res;
        }
        res.add(stack.pop());
        return rev(stack, res);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        Stack<Integer> res = revStack(stack);
        while(!res.empty()){
            System.out.println(res.pop());
        }

    }
}
