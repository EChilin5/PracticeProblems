package Recursion;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> res = new Stack<>();
        res.add(30);
        res.add(-5);
        res.add(18);
        res.add(4);
        res.add(-3);
        sortStack(res);

        while (!res.isEmpty()){
            System.out.println(res.pop());
        }
    }

//    public static Stack<Integer> sortStack(Stack<Integer> og){
//        Stack<Integer> result = new Stack<>();
//        Stack<Integer> dummy = new Stack<>();
//        return sort(og, result, dummy);
//    }

//    public static Stack<Integer> sort(Stack<Integer> og, Stack<Integer> result, Stack<Integer> dummy ){
//        if(og.isEmpty() && dummy.isEmpty()){
//            return result;
//        }
//        int prev = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        while(!og.isEmpty()){
//            int temp = og.peek();
//            if(min > temp && prev != min){
//                min = temp;
//            }
//            if(prev != temp){
//                dummy.add(temp);
//            }
//
//        }
//        result.add(min);
//        System.out.println();
//        prev = min;
//        min = Integer.MAX_VALUE;
//        while(!dummy.isEmpty() && prev != min){
//            int temp = dummy.peek();
//            if(min > temp){
//                min = temp;
//            }
//            og.add(temp);
//        }
//        result.add(min);
//
//        return sort(og,result, dummy);
//    }

    public static void sortStack(Stack<Integer> stack){
        // check if stack is Empty
        if(!stack.isEmpty()){
            // remove element from the stack
            int x = stack.pop();
            // sort the stack after removing the item
            sortStack(stack);
            // sort and the specific value into the stack
            sortInsert(stack, x);
        }
    }


    public static void sortInsert(Stack<Integer> s, int x){
        //  base case if item is empty
        // x > current value // check if stack is empty
        //
        if(s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }

        // greater than top rem the element
        int temp = s.pop();
        sortInsert(s,x);

        s.push(temp);
    }

}
