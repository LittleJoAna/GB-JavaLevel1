package Lesson_5;

import java.util.Random;

public class Birds extends Animals {
    private Random random = new Random();
    private float randJump;
    private int randRun;

    Birds(String name, String color, int age) {
        super(name, color, age);
        randJump = random.nextFloat() * 0.2f;
        randRun = 3 + random.nextInt(2);
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
        fly();
        return false;
    }

    void fly() {
        System.out.println("Птица перелетелa!");
    }
}
