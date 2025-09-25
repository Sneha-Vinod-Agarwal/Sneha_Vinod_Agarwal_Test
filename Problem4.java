package mypackage;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter " + n + " numbers:");
        String[] parts = sc.nextLine().split(",");
        if (parts.length != n) {
            System.out.println("Error: You must enter exactly " + n + " numbers");
            return;
        }
        int[] counts = new int[10]; // counts[1] to counts[9]
        for (String numStr : parts) {
            int num = Integer.parseInt(numStr.trim());
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) counts[i]++;
            }
        }
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.println("}");
    }
}
