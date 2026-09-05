import java.util.*;

class FirstNonRepeating {

    static char findFirstNonRepeatingChar(String s) {

        int[] frequency = new int[256];

        for (int i = 0; i < s.length(); i++)
            frequency[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++) {

            if (frequency[s.charAt(i)] == 1)
                return s.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        char result = findFirstNonRepeatingChar(s);

        if (result == '\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println(
                    "First Non-Repeating Character: '" +
                    result + "'");
    }
}