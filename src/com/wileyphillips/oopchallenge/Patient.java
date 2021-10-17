package com.wileyphillips.oopchallenge;

public class Patient {
    //Takes the other classes as attributes.
    private String name;
    private int age;
    private LeftEye leftEye;
    private RightEye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, LeftEye leftEye, RightEye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LeftEye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(LeftEye leftEye) {
        this.leftEye = leftEye;
    }

    public RightEye getRightEye() {
        return rightEye;
    }

    public void setRightEye(RightEye rightEye) {
        this.rightEye = rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
