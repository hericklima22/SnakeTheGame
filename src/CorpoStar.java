import java.awt.Color;
import java.awt.Graphics;

public class CorpoStar {
	
	private int x, y, altura, largura;

	public CorpoStar(int x, int y, int tamanhoCauda) {
		this.x = x;
		this.y = y;
		altura = tamanhoCauda;
		largura = tamanhoCauda;
	}
	
	public void tick() {
		
	}
	
	public void draw(Graphics g) {
			g.setColor(Color.YELLOW);
			g.fillRect(x * largura, y * altura, largura, altura);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
