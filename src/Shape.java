import java.awt.Graphics;

public abstract class Shape {
    private int x;
    private int y;

    public Shape() {
        super();
    }

    public Shape(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract Shape clone();

    public abstract void getState(Graphics g);
}
