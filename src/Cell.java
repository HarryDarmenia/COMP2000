import javax.swing.*;
import java.awt.*;

public class Cell extends JFrame {
 
	public static void paint(Graphics g, int i, int j, int size) {
        g.setColor(Color.WHITE);
        g.fillRect(i, j, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(i, j, size, size);
	}

}