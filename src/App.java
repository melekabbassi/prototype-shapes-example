import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class App extends Canvas {

    public void paint(Graphics g) {  
        
        Shape shapes[] = new Shape[2];
        
        Rectangle r1 = new Rectangle(200, 100);
        Rectangle r2 = (Rectangle) r1.clone();
        r2.setHeight(200);
        r2.setWidth(200);
        Rectangle r3 = (Rectangle) r1.clone();
        r3.setHeight(300);
        r3.setWidth(300);
        Rectangle r4 = (Rectangle) r1.clone();
        r4.setHeight(400);
        r4.setWidth(400);

        Circle c1 = new Circle(100);
        shapes[0] = r1;
        shapes[1] = c1;
        Circle c2 = (Circle) c1.clone();
        c2.setRadius(200);
        Circle c3 = (Circle) c1.clone();
        c3.setRadius(300);
        Circle c4 = (Circle) c1.clone();
        c4.setRadius(400);

        // draw the original shapes
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].getState(g);
        }
    }

    public static void main(String[] args) throws Exception {
        App app=new App();  
        JFrame f=new JFrame();  
        f.add(app);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }
}
