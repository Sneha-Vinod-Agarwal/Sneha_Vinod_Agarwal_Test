package mypackage;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int blockStart = 1;  
        int blockEnd = 2;   
        int totalOdds = 1;   
        while (a > blockEnd) {
            totalOdds += 2;      
            blockStart = blockEnd + 1;
            blockEnd = blockEnd + 2;         }
        for (int i = 0; i < totalOdds; i++) {
            System.out.print(2 * i + 1);
            if (i < totalOdds - 1) {
                System.out.print(", ");
            }
        }
    }
}





