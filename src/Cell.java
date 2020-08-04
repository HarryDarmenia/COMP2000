import javax.swing.*;
import java.awt.*;

public class Cell extends JFrame {
 
	public static void paint(Graphics g, int i, int j, int size) { 
        Point p = MouseInfo.getPointerInfo().getLocation();
        int x = p.x;
        int y = p.y;
        if(i<x && x<=i+size && j<y && y<=j+size){
                g.setColor(Color.GRAY);
        }else{
                g.setColor(Color.WHITE);
        }
        g.fillRect(i, j, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(i, j, size, size);
	}

}