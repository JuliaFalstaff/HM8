package com.company;

public class Main {

    public static void main(String[] args) {
        // массив участвующих
        Actionable[] actionables = new Actionable[3];
        actionables[0] = new Cat("Гарфилд", 40, 50, true);
        actionables[1] = new Human("Джон Траволта", 20, 250, true);
        actionables[2] = new Robot("Валли", 30, 450, true);

        //массив препятствий
        Obstacable[] obstacables = new Obstacable[4];
        obstacables[0] = new Wall(10);
        obstacables[1] = new Wall(30);
        obstacables[2] = new RunningTrack(300);
        obstacables[3] = new RunningTrack(400);


        //цикл для прохождения участниками препятствий и дальнейшей дисквалификации того, кто не прошел препятствие (дальше по списку он препятствий не идет)
        for (Actionable actionable : actionables) {
            actionable.getOnDistance();
            for (Obstacable obstacable : obstacables) {
                if (actionable.getOnDistance()){
                        obstacable.successOfRun(actionable);
                        obstacable.successOfJump(actionable);
                  } else {
                         break;
                }
            }
        }
    }
}






//        for (Obstacable obstacable : obstacables) {
//            for (Actionable actionable : actionables) {
//                obstacable.successOfRun(actionable);
//                obstacable.successOfJump(actionable);
//                }
//
//            }
//
//        }


//        for (int i = 0; i < actionables.length; i++) {
//            for (int j = 0; j < obstacables.length; j++) {
//                obstacables[j].successOfRun(actionables[i]);
//                obstacables[j].successOfJump(actionables[i]);
//
//            }
//        }









