package com.company;

public class Robot implements Actionable {
    private String name;
    private int powerOfHeight;
    private int powerOfLength;
    boolean onDistance;

    public Robot(String name, int powerOfHeight, int powerOfLength, boolean onDistance) {
        this.name = name;
        this.powerOfHeight = powerOfHeight;
        this.powerOfLength = powerOfLength;
        this.onDistance = true;
    }



    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгает");
    }

    @Override
    public int getPowerOfHeight() {
        return powerOfHeight;
    }

    @Override
    public int getPowerOfLength() {
        return powerOfLength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean setOnDistance(boolean onDistance) {
        return this.onDistance = onDistance;
    }

    @Override
    public boolean getOnDistance() {
        return onDistance;
    }


}
