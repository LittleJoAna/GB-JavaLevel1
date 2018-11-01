package Lesson_5;

public class Horses extends Animals {
    Horses(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    boolean run(int lenghtRun) {
        if (lenghtRun <= 1500) {
            return true;
        }
        return false;
    }

    @Override
    boolean jump(float lenghtJump) {
        if (lenghtJump <= 3) {
            return true;
        }
        return false;
    }

    @Override
    boolean swim(int lenghtSwim) {
        if (lenghtSwim <= 100) {
            return true;
        }
        return false;
    }
}
