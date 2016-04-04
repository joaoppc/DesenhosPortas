package desagil.display;
import java.awt.Color;
import javax.swing.JFrame;


public class Screen {
	public static void main(String[] args )
	{
		JFrame frame = new JFrame("teste portas lógicas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DesenhaAnd desenhaAnd = new DesenhaAnd();
		desenhaAnd.setBackground(Color.WHITE);
		frame.add(desenhaAnd);
		frame.setSize(600, 300);
		frame.setVisible(true);
	}

}
