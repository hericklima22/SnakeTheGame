import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class PainelGame extends JPanel implements Runnable, KeyListener {
	
	private static int SNAKE;
	
	private static final long serialVersionUID = 1L;
	
	private int DIFICULDADE;

	private static final int LARGURA = 600, ALTURA = 600;
	
	static Thread thread;
	
	private boolean running;
	
	private int vezesSimples = 1;
	
	private CorpoSnake b;
	private final ArrayList<CorpoSnake> snake;
	
	private ComidaSimples comidaSimples;
	private ComidaBomba comidaBomba;
	private final ArrayList<ComidaSimples> comidas;
	private final ArrayList<ComidaBomba> comidab;
	
	private final Random r;
	
	private int x = 10;
	private int y = 10;
	private int tamanho = 5;
		
	private int ticks = 0;
	
	private boolean direita = true;
	private boolean esquerda = false;
	private boolean cima = false;
	private boolean baixo = false;
	
	private boolean bombaGerada;
	
	private int pontos = 0, bufferPontos = 0;
	
	public int getDificuldade() {
		return DIFICULDADE;
	}

	public void setDificuldade(int DIFICULDADE) {
		this.DIFICULDADE = DIFICULDADE;
	}

	public int getPontos() {
		return pontos;
	}
	
	public PainelGame() {
		setFocusable(true);
		
		setPreferredSize(new Dimension(LARGURA, ALTURA));
		addKeyListener(this);
		
		snake = new ArrayList<CorpoSnake>();
		comidas = new ArrayList<ComidaSimples>();
		comidab = new ArrayList<ComidaBomba>();
		
		r = new Random();
		
		start();
	}
	
	public void start() {
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void stop() {
		new gameOver();
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tick() {
		
		int tamanhoAnterior = tamanho;
		bufferPontos = pontos;
		
		if(snake.isEmpty()) {
			b = new CorpoSnake(x, y, 10);
			snake.remove(b);
		}

		ticks++;
		
		//dificuldade
		if(ticks > 200000) {
			if(direita) x++;
			
			if(esquerda) x--;
			
			if(cima) y--;
			
			if(baixo) y++;
			
			ticks = 0;
			
			b = new CorpoSnake(x, y, 10);
			if(tamanhoAnterior > tamanho) {
				snake.remove(0);
			}
			else {
				snake.add(b);
			}
			
			
			if(snake.size() > tamanhoAnterior) {
				snake.remove(0);
			}
			
                    try {
                        Thread.sleep(DIFICULDADE);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PainelGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
		
		if(vezesSimples % 3 == 0) {
			//gerador de comida BOMBA
			if(comidab.isEmpty()) {
				int x = r.nextInt(59);
				int y = r.nextInt(59);
				
				comidaBomba = new ComidaBomba(x, y, 10);
				comidab.add(comidaBomba);
			}
			
			bombaGerada = true;
		}
			
		//comeu a comida BOMBA
		for(int i = 0; i < comidab.size(); i++) {
			if(x == comidab.get(i).getX() && y == comidab.get(i).getY()) {
				comidab.remove(i);
				stop();
				
			}			
		}
		
		//gerador de comida SIMPLES
		if(comidas.isEmpty()) {
			int x = r.nextInt(59);
			int y = r.nextInt(59);
				
			comidaSimples = new ComidaSimples(x, y, 10);
			comidas.add(comidaSimples);
		}
			
		//comeu a comida SIMPLES
		for(int i = 0; i < comidas.size(); i++) {
			if(x == comidas.get(i).getX() && y == comidas.get(i).getY()) {
				if(bombaGerada) {
					comidab.remove(i);
				}
				bombaGerada = false;
				tamanho++;
				comidas.remove(i);
				i++;
				vezesSimples++;
				pontos += 10;
				
			}
		}
		
			//colisao da propria cobra
	for(int i = 0; i < snake.size(); i++) {
		if(x == snake.get(i).getX() && y == snake.get(i).getY()) {
			if(i != snake.size() - 1) {
				System.out.println("Game Over");
					stop();
			}
		}
	}
	//colisao de borda
	if(x < 0 || x > 59 || y < 0 || y > 59) {
		System.out.println("Game Over");
		stop();
	}	
}
	
        @Override
	public void paint(Graphics g) {
		
		g.clearRect(0, 0, LARGURA, ALTURA);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, LARGURA, ALTURA);
		
		for(int i = 0; i < LARGURA/10; i++) {
			g.drawLine(i * 10, 0, i * 10, ALTURA);
		}
		
		for(int i = 0; i < ALTURA/10; i++) {
			g.drawLine(0, i * 10, ALTURA, i * 10);
		}
		
		for(int i = 0; i < snake.size(); i++) {
			snake.get(i).draw(g);
		}
		
		//gerador de comida SIMPLES
		for(int i = 0; i < comidas.size(); i++) {
			comidas.get(i).draw(g);
		}
		
		//gerador de comida BOMBA
		for(int i = 0; i < comidab.size(); i++) {
			comidab.get(i).draw(g);
		}
	}

	@Override
	public void run() {
		while(running) {	
				tick();
				repaint();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT && !esquerda) {
			direita = true;
			cima = false;
			baixo = false;
		}
		
		if(key == KeyEvent.VK_LEFT && !direita) {
			esquerda = true;
			cima = false;
			baixo = false;
		}
		
		if(key == KeyEvent.VK_UP && !baixo) {
			direita = false;
			cima = true;
			esquerda = false;
		}
		
		if(key == KeyEvent.VK_DOWN && !cima) {
			direita = false;
			esquerda = false;
			baixo = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
