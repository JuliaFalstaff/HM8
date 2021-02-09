package com.company;

public interface Obstacable {

    //Общий интерфейс для препятствий
    boolean successOfRun(Actionable actionable);
    boolean successOfJump(Actionable actionable);

}
