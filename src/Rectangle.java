import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height);
    }

    @Override
    public void getState(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(200, 50, width, height);
    }
    
}
