package com.wileyphillips.oopchallenge;

public class Patient {
    private LeftEye leftEye;
    private RightEye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(LeftEye leftEye, RightEye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
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
