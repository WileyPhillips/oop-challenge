package com.wileyphillips.oopchallenge;

public class Heart extends Skin {
    private int heartRate;

    public Heart(String medicalCondition, int heartRate) {
        super(medicalCondition);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
