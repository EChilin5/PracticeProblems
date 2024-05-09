package Recursion;

import java.util.Stack;

public class StackSort {

    // use stacks to keep a record of the value one that will keep
    // the largest to smallest
    // -3, 14, 18, -5, 30
    // result = > 30, 18, 14, -3, -5

    public static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> res = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        return sort(res, stack, stack2);
    }

    public static Stack<Integer> sort(Stack<Integer> res, Stack<Integer> stack, Stack<Integer> stack2){
        if(stack.isEmpty() && stack2.isEmpty()){
            return res;
        }

      //  int minValue = min(stack, stack2);

        return res ;
    }



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-3);
        stack.add(14);
        stack.add(18);
        stack.add(-5);
        stack.add(30);

    }
}
