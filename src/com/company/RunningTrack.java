package com.company;

public class RunningTrack implements Obstacable{
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    //Проверка насколько успешно участник прошел препятствие. Если нет, то заменяем onDistance на false для дальнейшей дисквалификации
    @Override
    public boolean successOfRun(Actionable actionable) {
        if (actionable.getPowerOfLength() >= length){
            System.out.println("Участник " + actionable.getName() + " успешно пробежал дистанцию длиной " + length);
            return true;
        } else {
            actionable.setOnDistance(false);
            System.out.println("Участник " + actionable.getName() + " не смог пробежать дистанцию длиной " + length);
            return false;
        }

    }

    @Override
    public boolean successOfJump(Actionable actionable) {
        return false;
    }


}
