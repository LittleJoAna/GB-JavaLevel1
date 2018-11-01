package Lesson_5;

public class Dogs extends Animals {

    Dogs(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    boolean run(int lenghtRun) {
        if (lenghtRun <= 500) {
            return true;
        }
        return false;
    }

    @Override
    boolean jump(float lenghtJump) {
        if (lenghtJump <= 0.5) {
            return true;
        }
        return false;
    }

    @Override
    boolean swim(int lenghtSwim) {
        if (lenghtSwim <= 10) {
            return true;
        }
        return false;
    }


}
