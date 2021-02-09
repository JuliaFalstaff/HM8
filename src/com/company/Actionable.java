package com.company;

public interface Actionable {

    //Интерфейс участвующих
    void run();
    void jump();
    int getPowerOfHeight();
    int getPowerOfLength();
    String getName();
    boolean setOnDistance(boolean onDistance);
    boolean getOnDistance();


}
