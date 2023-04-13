import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(radius);
    }

    @Override
    public void getState(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(10, 50, radius, radius);
    }
    
}
