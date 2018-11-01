package Lesson_5;

public class Cats extends Animals {
    Cats(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    boolean run(int lenghtRun) {
        if (lenghtRun <= 200) {
            return true;
        }
        return false;
    }

    @Override
    boolean jump(float lenghtJump) {
        if (lenghtJump <= 2.0) {
            return true;
        }
        return false;
    }

    @Override
    boolean swim(int lenghtSwim) {
        return false;
    }
}
