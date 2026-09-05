import java.util.Scanner;

class InventoryBalancer {

    static void analyzeInventory(int[] a, int[] b) {

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < a.length; i++) {
            totalA += a[i];
            totalB += b[i];
        }

        String status = (totalA == totalB)
                ? "Balanced"
                : "Not Balanced";

        int max = a[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                section = "Section A";
                index = i;
            }

            if (b[i] > max) {
                max = b[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + max
                + " (" + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        analyzeInventory(a, b);
    }
}