package jb_challenges;

public class C3_ReverseString {

    public static void execute() {
        System.out.println("Given: \t\tMURDER");
        System.out.printf("Reversed:\t%s%n", reverseString("MURDER"));
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i > -1 ; i--) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }
}
