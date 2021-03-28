package model;

/**
 * 
 * @author manue
 * Schnake-Klassengerüst mit move-Methoden
 */
public class Snake {
	
	private boolean hindered=true;
	private int length;
	private int xPos;
	private int yPos;
	/**
	 * 
	 * @param yPos =übergabe der xPos
	 * @param xPos =übergabe der yPos
	 */
	public Snake(int yPos, int xPos) {
		this.xPos=xPos;
		this.yPos=yPos;
		this.length=0;
	}
	/**
	 * Methoden für move-up-down-left-right
	 * Annahme fürs testen ist ein 1920*1080 Fenster
	 * @return ob sich das objekt am rand befindent (boolean)
	 */
	public boolean moveUp() {
		if (xPos > 0) {
			xPos-=5;
			hindered=false;
		} else {
			hindered=true;
		}
		return hindered;
	}
	
	public boolean moveDown() {
		if (xPos < 1080) {
			xPos+=5;
			hindered=false;
		} else {
			hindered=true;
		}
		return hindered;
	}
	
	public boolean moveLeft() {
		if (yPos > 0) {
			yPos-=5;
			hindered=false;
		} else {
			hindered=true;
		}
		return hindered;
	}
	
	public boolean moveRight() {
		if (yPos < 1920) {
			yPos+=5;
			hindered=false;
		} else {
			hindered=true;
		}
		return hindered;
	}
	/**
	 * getter für x und y pos.
	 * @return der positionen (INT)
	 */
	public int getXPos() {
		return this.xPos;
	}
	public int getYPos() {
		return this.yPos;
	}
}
