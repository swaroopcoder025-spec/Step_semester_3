import java.util.*;

class Palindrome {

    static boolean iterative(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    static boolean recursive(String s, int i, int j) {

        if (i >= j)
            return true;

        if (s.charAt(i) != s.charAt(j))
            return false;

        return recursive(s, i + 1, j - 1);
    }

    static boolean arrayReverse(String s) {

        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++)
            b[i] = a[a.length - 1 - i];

        return s.equals(new String(b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        System.out.println("Iterative: " +
                (iterative(s) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
                (recursive(s, 0, s.length() - 1)
                        ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
                (arrayReverse(s) ? "Palindrome" : "Not Palindrome"));
    }
}