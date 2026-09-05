import java.util.*;

class ReverseName {

    static String reverseCustomerName(String customerName) {

        String reversed = "";

        for (int i = customerName.length() - 1;
             i >= 0; i--) {

            reversed += customerName.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        String reverse = reverseCustomerName(name);

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverse);
    }
}