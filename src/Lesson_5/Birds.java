package Lesson_5;

public class Birds extends Animals {
    Birds(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    boolean run(int lenghtRun) {
        if (lenghtRun <= 5) {
            return true;
        }
        return false;
    }

    @Override
    boolean jump(float lenghtJump) {
        if (lenghtJump <= 0.2) {
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
