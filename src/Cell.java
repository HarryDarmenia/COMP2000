import javax.swing.*;
import java.awt.*;

public class Cell extends JFrame {
 
	public static void paint(Graphics g, int i, int j, int size) { 
        Point p = MouseInfo.getPointerInfo().getLocation();
        int x = p.x;
        int y = p.y;
        if(i<x-5 && x-5 <=i+size && j+size <y+5 && y+5<=j+2*size){
                g.setColor(Color.GRAY);
        }else{
                g.setColor(Color.WHITE);
        }
        g.fillRect(i, j, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(i, j, size, size);
	}

}