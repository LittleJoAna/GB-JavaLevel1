package Lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food < n) return false;
        else {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    void addFood (int food) {
        this.food += food;
    }
}
