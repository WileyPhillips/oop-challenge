package com.wileyphillips.oopchallenge;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Patient has the attributes found in the example.
        Patient patient = new Patient("Tom", 25, new LeftEye("Short sighted", "Blue"), new RightEye("Normal", "Blue"), new Heart("Normal", 65), new Stomach("PUD"), new Skin("Burned"));
        System.out.println("Name: " + patient.getName() + "\nAge: " + patient.getAge());
        while (true) {
            String number = options();
            System.out.println(number);
            //Still not sure of a proper solution, so I will be brute forcing it for the moment.
            if (number.equals("1")){
                System.out.println("Name: Left Eye\nMedical Condition: " + patient.getLeftEye().getMedicalCondition() + "\nColor: " + patient.getLeftEye().getColor());
            } else if (number.equals("2")) {
                System.out.println("Name: Right Eye\nMedical Condition: " + patient.getRightEye().getMedicalCondition() + "\nColor: " + patient.getRightEye().getColor());
            }
        }

    }
//    public static void chooseLeft() {
//        System.out.println("Name: Left Eye\nMedical Condition: "+ patient.);
//    }
    public static String options () {
        String[] numOptions = {"1","2","3","4","5","6"};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Left Eye \r\n2. Right Eye\r\n3. Heart \r\n4. Stomach \r\n5. Skin \r\n6. Quit");
            String choice = scanner.next();
            for (String number: numOptions) {
                if (number.equals(choice)) {
                    return number;
                }
            }
        }
    }
}
