package borsos_ciez_chlebicki;


/**
 * @author David Ciez
 * @version 16-12-2014
 */
public class Model {

	private Boolean[][] tiles;
	
	
	public Model(){
		
		this.tiles = new Boolean[5][5];
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				this.tiles[i][j] = Boolean.FALSE;
			}
		}
	}
	
	
	/**
	 * Inverts the pressed Button and its neighbour's Boolean-state(true/false).
	 * @param i the rows in the tiles-array.
	 * @param j the columns in the tiles-array.
	 */
	public void invert(int i, int j){
		
		//mid tile
		if(this.tiles[i][j] == Boolean.FALSE){
			this.tiles[i][j] = Boolean.TRUE;
		}else{
			this.tiles[i][j] = Boolean.FALSE;
		}
		
		
		//left tile
		try{
			if(this.tiles[i][j-1] == Boolean.FALSE){
				this.tiles[i][j-1] = Boolean.TRUE;
			}else{
				this.tiles[i][j-1] = Boolean.FALSE;
			}
		}catch(IndexOutOfBoundsException e){
			//reaction
		}
		

		//right tile
		try{
			if(this.tiles[i][j+1] == Boolean.FALSE){
				this.tiles[i][j+1] = Boolean.TRUE;
			}else{
				this.tiles[i][j+1] = Boolean.FALSE;
			}
		}catch(IndexOutOfBoundsException e){
			//reaction
		}
		

		//upper tile
		try{
			if(this.tiles[i-1][j] == Boolean.FALSE){
				this.tiles[i-1][j] = Boolean.TRUE;
			}else{
				this.tiles[i-1][j] = Boolean.FALSE;
			}
		}catch(IndexOutOfBoundsException e){
			//reaction
		}
		

		//lower tile
		try{
			if(this.tiles[i+1][j] == Boolean.FALSE){
				this.tiles[i+1][j] = Boolean.TRUE;
			}else{
				this.tiles[i+1][j] = Boolean.FALSE;
			}
		}catch(IndexOutOfBoundsException e){
			//reaction
		}

	}
	
	/**
	 * This method sets the tiles in the right order, in case of a new game.
	 */
	public void setUpTiles(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				this.tiles[i][j] = Boolean.FALSE;
			}
		}
		this.tiles[1][1] = Boolean.TRUE;
		this.tiles[1][2] = Boolean.TRUE;
		this.tiles[1][3] = Boolean.TRUE;
		this.tiles[2][1] = Boolean.TRUE;
		this.tiles[2][3] = Boolean.TRUE;
		this.tiles[3][1] = Boolean.TRUE;
		this.tiles[3][2] = Boolean.TRUE;
		this.tiles[3][3] = Boolean.TRUE;
	}
	
	/**
	 * This method checks the tiles array, if there're still lights on.
	 */
	public void pruefen(){
		a:for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(this.tiles[i][j] == Boolean.FALSE){
					break a;
				}
			}
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				this.tiles[i][j] = Boolean.FALSE;
			}
		}
		//"drawing" a smiley
		this.tiles[1][1] = Boolean.TRUE;
		this.tiles[1][3] = Boolean.TRUE;
		this.tiles[3][0] = Boolean.TRUE;
		this.tiles[4][1] = Boolean.TRUE;
		this.tiles[4][2] = Boolean.TRUE;
		this.tiles[4][3] = Boolean.TRUE;
		this.tiles[3][4] = Boolean.TRUE;
	}
	
	/**
	 * @return Returns the whole tiles-array.
	 */
	public Boolean[][] getTiles(){
		return this.tiles;
	}
	
}
