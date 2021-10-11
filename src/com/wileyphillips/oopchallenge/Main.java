package com.wileyphillips.oopchallenge;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        options();
    }
    public static void options () {
        String[] numOptions = {"1","2","3","4","5","6"};
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        while (! found) {
            System.out.println("1. Left Eye \r\n2. Right Eye\r\n3. Heart \r\n4. Stomach \r\n5. Skin \r\n6. Quit");
            String choice = scanner.next();
            System.out.println(choice);
            for (int i=0; i<numOptions.length; i++) {
                if (numOptions[i].equals(choice)) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println("Found");
    }
}
