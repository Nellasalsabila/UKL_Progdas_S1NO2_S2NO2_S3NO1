package vscode;

import java.util.Scanner;

public class primaulng {
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah bilangan : ");
        Scanner in = new Scanner(System.in);
        int bilangan = in.nextInt();

        if (isPrime(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i  = 2; i <= (num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
    
        return true;
    }
}
