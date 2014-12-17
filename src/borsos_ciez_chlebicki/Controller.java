package borsos_ciez_chlebicki;


import java.awt.event.*;

/**
 * @author Dominik Chlebicki
 * @version 16-12-2014
 *
 */
public class Controller implements ActionListener{
	private View v;
	private Model m;
	
	public Controller(){
		this.m = new Model();
		this.v = new View(this, this.m);
	}

	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(e.getSource() == v.getButtons(i, j)){		//Listener für das Button-Array 
					System.out.println("Button: "+i+"-"+j);
					
					m.invert(i, j);
					v.updateTiles(m.getTiles());
				}
				if(e.getSource() == v.newGame){ 				//Button zum neustarten des Spiels
				//	m.newGame();
				} 
			}
		}
	}
}
