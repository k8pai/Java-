// Program to print whether number is pallindrome or not.

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originalNum = n;
        int revNumber = 0;
        // while loop
        while (n != 0) {
            int rem = n % 10;
            revNumber = (revNumber * 10) + rem;
            n /= 10;
        }
        System.out.println("Number : " + revNumber);
        if (originalNum == revNumber) {
            System.out.println("It is a Pallindrome Number");
        } else {
            System.out.println("It is not a Pallindrome Number");
        }
        in.close();
    }
}
