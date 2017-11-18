package core;

import java.awt.image.BufferedImage;

public class TileType {
	private BufferedImage img;
	public TileType(BufferedImage img){
		this.img = img;
	}
	public BufferedImage getImg(){
		return img;
	}
}
