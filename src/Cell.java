import javax.swing.*;
import java.awt.*;

public class Cell extends JFrame {

        public static void paint(Graphics g, int i, int j, int size, Point p) {
        
                if (i < p.x && p.x <= i + size && j < p.y && p.y <= j + size) {
                        g.setColor(Color.GRAY);
                } else {
                        g.setColor(Color.WHITE);
                }
                g.fillRect(i, j, size, size);
                g.setColor(Color.BLACK);
                g.drawRect(i, j, size, size);
        }

}