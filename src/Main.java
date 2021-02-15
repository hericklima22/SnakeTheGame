import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	
	public static JFrame frame = new JFrame();
	
	public Main(int dificuldade) {
		
		
		PainelGame painel = new PainelGame();
		
		switch(dificuldade) {
		case (1):
			painel.setDificuldade(50);
			break;
		case (2):
			painel.setDificuldade(15);
			break;
		case (3):
			painel.setDificuldade(1);
			break;
		default:
			break;
		}
			frame.add(painel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Snake");
			
			frame.pack();
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
	}
}
