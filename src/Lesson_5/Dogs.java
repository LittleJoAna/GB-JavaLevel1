package Lesson_5;

import java.util.Random;

public class Dogs extends Animals {
    private Random random = new Random();
    private float randJump;
    private int randRun;
    private int randSwim;

    Dogs(String name, String color, int age) {
        super(name, color, age);
        randJump = random.nextFloat() * 0.5f;
        randRun = 300 + random.nextInt(200);
        randSwim = random.nextInt(10);
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
