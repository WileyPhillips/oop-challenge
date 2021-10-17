package com.wileyphillips.oopchallenge;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Patient has the attributes found in the example.
        Patient patient = new Patient("Tom", 25, new LeftEye("Short sighted", "Blue"), new RightEye("Normal", "Blue"), new Heart("Normal", 65), new Stomach("PUD"), new Skin("Burned"));
        System.out.println("Name: " + patient.getName() + "\nAge: " + patient.getAge());
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        while (true) {
            String number = options();

            //Still not sure of a proper solution, so I will be brute forcing it for the moment.
            if (number.equals("1")){
                System.out.println("Name: Left Eye\nMedical Condition: " + patient.getLeftEye().getMedicalCondition() + "\nColor: " + patient.getLeftEye().getColor() + "\n    1. Close the Eye");
                userChoice = scanner.next();
                if (userChoice.equals("1")) {
                    System.out.println("Left Eye Closed");
                }
            } else if (number.equals("2")) {
                System.out.println("Name: Right Eye\nMedical Condition: " + patient.getRightEye().getMedicalCondition() + "\nColor: " + patient.getRightEye().getColor() + "\n    1. Close the Eye");
                userChoice = scanner.next();
                if (userChoice.equals("1")) {
                    System.out.println("Right Eye Closed");
                }
            } else if (number.equals("3")) {
                System.out.println("Name: Heart\nMedical Condition: " + patient.getHeart().getMedicalCondition() + "\nHeart Rate: " + patient.getHeart().getHeartRate() + "\n    1. Change the heart rate");
                userChoice = scanner.next();
                if (userChoice.equals("1")) {
                    System.out.println("Enter the new heart rate:");
                    patient.getHeart().setHeartRate(Integer.parseInt(scanner.next()));
                    System.out.println("Heart rate changed to: " + patient.getHeart().getHeartRate());
                }
            } else if (number.equals("4")) {
                System.out.println("Name: Stomach\nMedical Condition: " + patient.getStomach().getMedicalCondition() + "\nNeed to be fed\n    1. Digest");
                userChoice = scanner.next();
                if (userChoice.equals("1")) {
                    System.out.println("Digesting begin...");
                }
            } else if (number.equals("5")) {
                System.out.println("Name: Skin\nMedical Condition: " + patient.getSkin().getMedicalCondition());
            } else {
                System.exit(0);
            }
        }

    }
//    public static void chooseLeft() {
//        System.out.println("Name: Left Eye\nMedical Condition: "+ patient.);
//    }
    public static String options () {
        //only valid user inputs
        String[] numOptions = {"1","2","3","4","5","6"};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("    1. Left Eye \n    2. Right Eye\n    3. Heart \n    4. Stomach \n    5. Skin \n    6. Quit");
            String choice = scanner.next();
            for (String number: numOptions) {
                //checks if the user put a valid input and returns it if they did.
                if (number.equals(choice)) {
                    return number;
                }
            }
        }
    }
}
