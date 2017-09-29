package map;

import java.util.List;

import item.Item;

public class InteractableObject {

	List<Integer> xyCoordinateList;
	String name;
	Item item;
	boolean isItem = false;
	
	public List<Integer> getXYCoordinateList(){return this.xyCoordinateList;}
	public String getName(){return this.name;}
	public boolean getisItem(){return this.isItem;}
	public Item getItem(){return this.item;}	
	
	public void setXYCoordinateList(List<Integer> xyCoordinateListIn){this.xyCoordinateList = xyCoordinateListIn;}
	public void setName(String nameIn){this.name = nameIn;}
	public void setItem(Item itemIn){this.item = itemIn; this.isItem = true;}
	
	
	
}

