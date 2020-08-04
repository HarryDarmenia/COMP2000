import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {

	public static void paint(Graphics g, int size) {
        for (int i = 10; i < 710; i += size) {
            for (int j = 10; j < 710; j += size) {
                Cell.paint(g, i, j, size);
            }
        }
    }
}
