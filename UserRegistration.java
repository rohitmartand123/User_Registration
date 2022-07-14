package com.bridgelabz.regex;
import java.util.Scanner;
/*
 *Author: Rohit
 *As a user need to enter valid first name
 */
public class UserRegistration {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input first name
        System.out.println("Enter first name");
        String firstName = sc.next();
        //calling checkFirstName method
        checkFirstName(firstName);

        //input last name
        System.out.println("Enter last name");
        String lastName = sc.next();
        //calling check last name method
        checkLastName(lastName);

        //input email
        System.out.println("Enter email");
        String email = sc.next();
        //calling checkemail method
        checkEmail(email);

        //input mobile number
        System.out.println("Enter mobile number");
        String mobileNumber = sc.next();
        //calling checkMobileNumber method
        checkMobileNumber(mobileNumber);
    }

    /*
     *Entered pattern for first name
     *Check the first name is valid or not
     */
    public static void checkFirstName(String firstName){
        boolean isFirstName = firstName.matches("^[A-Z]{1}[a-z]{2,}$");

        if(isFirstName){
            System.out.println(firstName + " " + "is valid first name");
        }
        else{
            System.out.println(firstName + " " + "is not valid first name");
        }
    }

    /*
     *Entered pattern for last name
     * And Check last name is valid or not
     */
    public static void checkLastName(String lastName){
        boolean isLastName = lastName.matches("^[A-Z]{1}[a-z]{2,}$");

        if(isLastName){
            System.out.println(lastName + " " + "is valid last name");
        }
        else{
            System.out.println(lastName + " " + "is not valid last name");
        }
    }

    /*
     *Entered pattern for email
     * Check email is valid or not
     */
    public static void checkEmail(String email){
        boolean isEmail = email.matches("^[a-zA-z]+[.][a-zA-Z0-9]*@[a-z]{2}[.][a-z]{2}[.][a-z]*");

        if(isEmail){
            System.out.println(email + " " + "is valid email");
        }
        else{
            System.out.println(email + " " + "is not valid email");
        }
    }

    /*
     *Entered pattern for mobile number
     * Check mobile number is valid or not
     */
    public static void checkMobileNumber(String mobileNumber){
        boolean isMobileNumber = mobileNumber.matches("^(91)?\\s{0,2}[0-9]{10}$");

        if(isMobileNumber){
            System.out.println(mobileNumber + " " + "is valid mobile number");
        }
        else{
            System.out.println(mobileNumber + " " + "is not valid mobile number");
        }
    }
}
