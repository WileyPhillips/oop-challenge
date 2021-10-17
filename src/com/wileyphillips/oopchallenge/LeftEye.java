package com.wileyphillips.oopchallenge;

public class LeftEye extends Skin {
    //Same attributes as skin minus also has one for color.
    private String color;

    public LeftEye(String medicalCondition, String color) {
        super(medicalCondition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
