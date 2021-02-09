package com.company;

public class Wall implements Obstacable{
    private int height;

    public Wall(int height){
        this.height = height;
    }


    @Override
    public boolean successOfRun(Actionable actionable) {
         return false;
    }

    //Проверка насколько успешно участник прошел препятствие. Если нет, то заменяем onDistance на false для дальнейшей дисквалификации
    @Override
    public boolean successOfJump(Actionable actionable) {
        if (actionable.getPowerOfHeight() >= height){
            System.out.println("Участник " + actionable.getName() + " успешно перепрыгнул стену высотой " + height);
            return true;
        } else {
            actionable.setOnDistance(false);
            System.out.println("Участник " + actionable.getName() + " не смог перепрыгнуть стену высотой " + height);
            return false;
        }
    }


}

