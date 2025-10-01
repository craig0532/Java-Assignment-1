package com.custom.exception;


//Custom exception class
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

public class MyException {
 public static void main(String[] args) {
     try {
         checkNumber(14);   // Test with a negative number
         checkNumber(-8);    // Test with a valid number
     } catch (CustomException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }

 // Method that throws the custom exception
 static void checkNumber(int number) throws CustomException {
     if (number < 0) {
         throw new CustomException("Number cannot be negative!");
     } else {
         System.out.println("Valid number: " + number);
     }
 }
}
