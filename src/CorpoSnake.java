import java.awt.Color;
import java.awt.Graphics;

public class CorpoSnake {
	
	private int x, y, altura, largura;

	public CorpoSnake(int x, int y, int tamanhoCauda) {
		this.x = x;
		this.y = y;
		altura = tamanhoCauda;
		largura = tamanhoCauda;
	}
	
	public void tick() {
		
	}
	
	public void draw(Graphics g) {
			g.setColor(Color.BLACK);
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
