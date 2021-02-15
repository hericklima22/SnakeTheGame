import javax.swing.JFrame;

public class MainFrame {
	
	public static JFrame frame = new JFrame();
	
	public MainFrame(int dificuldade) {
		
		
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
