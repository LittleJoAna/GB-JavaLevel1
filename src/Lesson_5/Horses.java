package Lesson_5;

import java.util.Random;

public class Horses extends Animals {
    private Random random = new Random();
    private float randJump;
    private int randRun;
    private int randSwim;

    Horses(String name, String color, int age) {
        super(name, color, age);
        randJump = 1 + random.nextFloat() * 2;
        randRun = 1200 + random.nextInt(300);
        randSwim = 70 + random.nextInt(30);
    }

    @Override
    boolean run(int lenghtRun) {
        if (lenghtRun <= randRun) {
            return true;
        }
        return false;
    }

    @Override
    boolean jump(float lenghtJump) {
        if (lenghtJump <= randJump) {
            return true;
        }
        return false;
    }

    @Override
    boolean swim(int lenghtSwim) {
        if (lenghtSwim <= randSwim) {
            return true;
        }
        return false;
    }
}
