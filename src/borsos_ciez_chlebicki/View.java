package borsos_ciez_chlebicki;


import java.awt.*;

import javax.swing.*;

/**
 * @author Robert Borsos, Dominik Chlebicki
 * @version 16-12-2014
 * 
 */
public class View extends JFrame{

	private Controller c;
	private Model m;
	private Panel p;
	private JButton newGame;
	private Container northMenu;
	private JLabel gameStats;
	
	public View(Controller c, Model m){
		this.c = c;
		this.m = m;
		this.p = new Panel(this.c);
		
		//Hier ist ein Bug
		this.northMenu = new Container();
		this.newGame = new JButton("Start New Game");
		this.gameStats = new JLabel("Clicks: " + "NOT IMPLEMENTED YET");
		this.northMenu.setLayout(new FlowLayout()); 	//North Menu mit Button für Neustart und Statistik
		this.northMenu.add(getNewGame());				
		this.northMenu.add(gameStats);
		this.setLayout(new BorderLayout());				//Layout des ganzen Frames setzen.
		this.add(p, BorderLayout.CENTER);
		this.add(northMenu, BorderLayout.NORTH);
		
		this.setTitle("Lights Out by Borsos, Ciez, Chlebicki");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	
	/**
	 * @param i the rows in the buttons-array.
	 * @param j the columns in the buttons-array.
	 * @return Returns a specific button in the buttons-array through the Panel-class.
	 */
	public JButton getButtons(int i, int j){
		return this.p.getButtons(i, j); 
	}
	
	
	/**
	 * Calls the setTiles method from the Panel, to update the button text after it's clicked.
	 * @param tiles the whole tiles-array.
	 */
	public void updateTiles(Boolean[][] tiles){
		p.setTiles(tiles);
	}


	public JButton getNewGame() {
		return newGame;
	}


	public void setNewGame(JButton newGame) {
		this.newGame = newGame;
	}
}
