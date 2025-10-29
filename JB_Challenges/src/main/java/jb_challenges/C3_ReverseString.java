package jb_challenges;

public class C3_ReverseString {

    public static void execute() {
        System.out.println("Given: \t\tMURDER");
        System.out.printf("Reversed:\t%s%n", reverseString("MURDER"));
    }

    public static String reverseString(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i > -1 ; i--) {
            if (i == text.length()) {
                reversedText = reversedText + text.substring(i);
            } else {
                reversedText = reversedText + text.substring(i, i + 1);
            }

        }

        return reversedText;
    }
}
