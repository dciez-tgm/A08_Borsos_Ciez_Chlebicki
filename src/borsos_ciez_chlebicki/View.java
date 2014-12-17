package borsos_ciez_chlebicki;


import java.awt.*;

import javax.swing.*;

/**
 * @author Robert Borsos
 * @version 16-12-2014
 * 
 */
public class View extends JFrame{

	private Controller c;
	private Model m;
	private Panel p;
	

	public View(Controller c, Model m){
		this.c = c;
		this.m = m;
		this.p = new Panel(this.c);
				
		this.setSize(500, 500);
		this.setLayout(new GridLayout(1, 1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(p);
		
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
}
