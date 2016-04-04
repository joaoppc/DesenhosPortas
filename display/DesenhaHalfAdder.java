package desagil.display;

import java.awt.Color;
import java.awt.Graphics;

public class DesenhaHalfAdder extends DesenhaPortas{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	
		g.setColor(Color.GREEN);
		g.drawLine(400,100,431,100);
		g.drawLine(400,125,431,125);
		g.drawArc(402, 95, 35, 35, 90, -180);
		g.drawArc(390, 95, 35, 35, 90, -180);
		g.drawLine(425,95,450,95);
		g.drawLine(425,130,450,130);
		g.drawArc(425, 95, 50, 35, 90, -90);
		g.drawArc(425, 95, 50, 35, 270, 90);
		g.drawLine(475,112,500,112);
		
		
		g.drawLine(410,150,425,150);
		g.drawLine(410,100,410,150);
		g.drawLine(405,175,425,175);
		g.drawLine(405,125,405,175);
		g.drawLine(425,145,425,180);
		g.drawLine(425,145,450,145);
		g.drawLine(425,180,450,180);
		g.drawArc(425, 145, 50, 35, 90, -90);
		g.drawArc(425, 145, 50, 35, 270, 90);
		g.drawLine(475,162,500,162);
		g.drawArc(500,152, 20, 20, 0, 360);
		
	
	}

}
