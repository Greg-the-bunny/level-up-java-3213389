package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        return password.length() >= 6
            && password.matches(".*\\d.*")
            && password.matches(".*[a-z].*")
            && password.matches(".*[A-Z].*");

    //     if (password.length() < 0) {
    //         return false;
    //     };
    //     boolean hasLowecaseLetter = false;
    //     boolean hasUppercaseLetter = false;
    //     boolean hasNumber = false;

    //     for (int i = 0; i < password.length() || !hasLowecaseLetter && 
    //     !hasUppercaseLetter && !hasNumber; i++) {
    //     char current = password.charAt(i);
    //     if (Character.isDigit(current)) {
    //         hasNumber = true;
    //     } else if (Character.isUpperCase(current)) {
    //         hasUppercaseLetter = true;
    //     } else if (Character.isLowerCase(current)) {
    //         hasLowecaseLetter = true;
    //     }
    // }
    // return hasNumber && hasLowecaseLetter && hasUppercaseLetter;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
