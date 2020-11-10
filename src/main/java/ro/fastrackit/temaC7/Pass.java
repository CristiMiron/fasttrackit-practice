package ro.fastrackit.temaC7;

import java.util.Scanner;

public class Pass {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Create a Scanner

            System.out.print("Enter a password: ");
            String password = input.nextLine();

            System.out.println(
                    (isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
        }

        public static boolean isValidPassword(String password) {
            final int lengthPass = 12;
            final int numberOfDigits = 3;

            boolean validPassword = isLengthValid(password, lengthPass) &
                            isOnlyLettersAndDigits(password) & isUppercase(password) & isLowercase(password) &
                            hasNDigits(password, numberOfDigits);

            return validPassword;
        }

        public static boolean isLengthValid(String password, int validLength) {
            for(int i =0; i < password.length();i++) {
                if (password.length() < validLength) {
                    System.out.println("The password is too short.");
                    return false;
                }
            }
            return true;
        }


        public static boolean isOnlyLettersAndDigits(String password) {
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    System.out.println("The password must have only letters and digits.");
                    return false;
                }
            }
            return true;
        }

        public static boolean isUppercase(String password) {
            for (int i= 0; i < password.length();i++){
                if (!Character.isUpperCase(password.charAt(i))) {
                    System.out.println("The password must contains uppercase.");
                    return false;
                }
            }
            return true;
        }

    public static boolean isLowercase(String password) {
        for (int i= 0; i < password.length();i++){
            if (!Character.isLowerCase(password.charAt(i))) {
                System.out.println("The password must contains lowercase.");
                return false;
            }
        }
        return true;
    }


        public static boolean hasNDigits(String password, int n) {
            int numberOfDigits = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    numberOfDigits++;
                }
                if (numberOfDigits >= n) {
                    return true;
                }
            }
            System.out.println("The password must contains minimum 3 digits.");
            return false;
        }
    }

