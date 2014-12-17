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
	 * @return Returns the whole tiles-array.
	 */
	public Boolean[][] getTiles(){
		return this.tiles;
	}
	
}
