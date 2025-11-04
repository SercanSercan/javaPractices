import jb_challenges.C1_FizzBuzz;
import jb_challenges.C2_TwoSum;
import jb_challenges.C3_ReverseString;
import jb_challenges.C4_Stack;

public class Main {
    public static void main(String[] args) {
        // C1_FizzBuzz fizzBuzz = new C1_FizzBuzz();
        // fizzBuzz.execute();

        // C2_TwoSum twoSum = new C2_TwoSum();
        // twoSum.execute();

        // C3_ReverseString reverseString = new C3_ReverseString();
        // reverseString.execute();

        C4_Stack<Integer> stack = new C4_Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());
        int item = stack.pop();
        System.out.printf("Popped item %s", item);
        System.out.println();
        System.out.println(stack.toString());
        int lastItem = stack.peek();
        System.out.printf("Current last item is %s", lastItem);
    }
}
