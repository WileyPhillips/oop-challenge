package com.wileyphillips.oopchallenge;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Patient has the attributes found in the example.
        Patient patient = new Patient("Tom", 25, new LeftEye("Short sighted", "Blue"), new RightEye("Normal", "Blue"), new Heart("Normal", 65), new Stomach("PUD"), new Skin("Burned"));
        System.out.println("Name: " + patient.getName() + "\nAge: " + patient.getAge());
        options();
    }
//    public static void chooseLeft() {
//        System.out.println("Name: Left Eye\nMedical Condition: "+ patient.);
//    }
    public static void options () {
        String[] numOptions = {"1","2","3","4","5","6"};
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        while (! found) {
            System.out.println("1. Left Eye \r\n2. Right Eye\r\n3. Heart \r\n4. Stomach \r\n5. Skin \r\n6. Quit");
            String choice = scanner.next();
            System.out.println(choice);
            for (String number: numOptions) {
                if (number.equals(choice)) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println("Found");
    }
}
