package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int  appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    boolean eat(Plate p)  {
        if (p.getFood() < appetite) return false;
        if (p.decreaseFood(appetite)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return name + ", сытость: " + satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
