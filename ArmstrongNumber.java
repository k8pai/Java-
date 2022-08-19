// Program to print whether number is  Armstrong Number or not.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originalNum = n;

        int cube = 0, result = 0;

        while (n != 0) {
            int rem = n % 10;
            cube = (int) Math.pow(rem, 3);
            result += cube;
            n /= 10;
        }
        System.out.println("Number : " + result);
        if (result == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
