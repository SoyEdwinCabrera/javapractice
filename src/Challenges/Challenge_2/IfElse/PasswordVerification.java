package Challenge_2.IfElse;

import java.util.Scanner;

public class PasswordVerification {
    private int password = 123456;

    Scanner sc = new Scanner(System.in);
    public void verifyPassword() {
        System.out.println("Enter the password: ");
        int inputPassword = sc.nextInt();

        if (inputPassword == password) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
