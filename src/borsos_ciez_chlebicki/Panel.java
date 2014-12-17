package borsos_ciez_chlebicki;


import java.awt.*;

import javax.swing.*;

/**
 * @author David Ciez
 * @version 16-12-2014
 *
 */
public class Panel extends JPanel{
	
	private JButton[][] buttons;
	private Controller c;
	
	public Panel(Controller c){
		this.c = c;
		this.setLayout(new GridLayout(5,5));
		this.buttons = new JButton[5][5];
		
		//Filling the array
		for(int i = 0; i < 5; i++){ //rows
			for(int j = 0; j < 5; j++){ //columns
				buttons[i][j] = new JButton("O");
				buttons[i][j].addActionListener(this.c);
				this.add(buttons[i][j]);
			}
		}
		
		
	}
	
	/**
	 * @param i the row in the buttons-array.
	 * @param j the columns in the buttons-array.
	 * @return Returns a specific button from the button-array.
	 */
	public JButton getButtons(int i, int j){
		return this.buttons[i][j];
	}
	
	/**
	 * Updates the button Text depending on the tiles-state(true/false).
	 * @param tiles the whole tiles-array.
	 */
	public void setTiles(Boolean[][] tiles){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(tiles[i][j] == Boolean.TRUE){
					buttons[i][j].setText("X");
				}else{
					buttons[i][j].setText("O");
				}
				
			}
		}
	}
}
