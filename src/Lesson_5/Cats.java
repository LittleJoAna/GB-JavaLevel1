package Lesson_5;

import java.util.Random;

public class Cats extends Animals {
    private Random random = new Random();
    private float randJump;
    private float randRun;

    Cats(String name, String color, int age) {
        super(name, color, age);
        randJump = random.nextFloat() * 2;
        randRun = 150 + random.nextInt(50);
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
        return false;
    }
}
