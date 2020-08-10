
import java.awt.*;


class Grid{
    
    Rectangle[][] rectt = new Rectangle[20][20];
    
    public Grid(){ 
        for (int i = 0; i < rectt.length; i ++) {
            for (int j = 0; j < rectt[i].length; j ++) {
                rectt[i][j]= new Rectangle();
                rectt[i][j].setBounds(10+35*i,10+35*j,35,35);
            }
        }
    }
    
    
    public void paint(Graphics g, Point mousePos){
        for (int i = 0; i < rectt.length; i ++) {
            for (int j = 0; j < rectt[i].length; j ++) {
                
                
                if(mousePos!=null && rectt[i][j].contains(mousePos)){
                    g.setColor(Color.GRAY);
                }else{
                    g.setColor(Color.WHITE);
                }
                g.fillRect(rectt[i][j].x, rectt[i][j].y, 35, 35);
                g.setColor(Color.BLACK);
                g.drawRect(rectt[i][j].x, rectt[i][j].y, 35, 35);
                
            }
        }
    }
    
    
}


