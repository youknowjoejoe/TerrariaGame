package core;

import java.util.ArrayList;
import java.util.List;

public class World {
	private List<Entity> entities;
	private ForegroundTileType[] ftypes;
	private TileType[] btypes;
	private int[][] ftiles;
	private int[][] btiles;
	
	public World(ForegroundTileType[] ftypes, TileType[] btypes, int[][] ftiles, int[][] btiles){
		this.entities = new ArrayList<Entity>();
		this.ftypes = ftypes;
		this.btypes = btypes;
		this.ftiles = ftiles;
		this.btiles = btiles;
	}
}
