package Lesson_5;

public abstract class Animals {
    private String name;
    private String color;
    private int age;
    private int lenghtRun;
    private int lenghtJump;
    private int lenghtSwim;

    Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getName() + ", " + getColor() + ", " + getAge() + " лет.";
    }

    abstract boolean run(int lenghtRun);

    abstract boolean jump(float lenghtJump);

    abstract boolean swim(int lenghtSwim);
}
