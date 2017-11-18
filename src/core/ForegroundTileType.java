package core;

import java.awt.image.BufferedImage;

public class ForegroundTileType extends TileType{
	private Reaction reaction;
	private boolean collideable;
	public ForegroundTileType(BufferedImage img, Reaction reaction, boolean collideable){
		super(img);
		this.reaction = reaction;
		this.collideable = collideable;
	}
	public Reaction getReaction(){
		return reaction;
	}
	public boolean isCollideable(){
		return collideable;
	}
}
