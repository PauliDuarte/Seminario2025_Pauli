package src.main.Factory;

public class Robot extends Enemy {
    public Robot(int x, int y) {
        super(x, y, "ROBOT");
    }
    @Override
    public void comportarse() {
        System.out.println("Robot se comporta de forma muy simple.");
    }
} 