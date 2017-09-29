package player;

import java.util.ArrayList;
import java.util.List;

import item.Bullet;
import item.Item;

public class NPC {

	Character icon = 'Q';
	Character replacedChar;
	Character lastMoved;
	String npcType;
	int Xcoord;
	int Ycoord;
	int health;
	List<Item> itemList= new ArrayList<Item>();
	List<Bullet> bulletList = new ArrayList<Bullet>();
	
	public void setIcon(Character iconIn){this.icon = iconIn;}
	public void setReplacedChar(Character replacedCharIn){this.replacedChar = replacedCharIn;}
	public void setLastMoved(Character lastMovedIn){this.lastMoved = lastMovedIn;}
	public void setNPCType(String npcTypeIn){this.npcType = npcTypeIn;}
	public void setXCoord(int xCoordIn){this.Xcoord = xCoordIn;}
	public void setYCoord(int yCoordIn){this.Ycoord = yCoordIn;}
	public void setHealth(int heathIn){this.health = heathIn;}
	public void setItemList(List<Item> itemListIn){this.itemList = itemListIn;}
	public void setBulletList(List<Bullet> bulletListIn){this.bulletList = bulletListIn;}
	
	public Character getIcon(){return this.icon;}
	public Character getReplacedChar(){return this.replacedChar;}
	public Character getLastMoved(){return this.lastMoved;}
	public String getNPCType(){return this.npcType;}
	public int getXCoord(){return this.Xcoord;}
	public int getYCoord(){return this.Ycoord;}
	public int getHealth(){return this.health;}
	public List<Item> getItemList(){return this.itemList;}
	public List<Bullet> getBulletList(){return this.bulletList;}
	
	public void addToItemList(Item itemIn){this.itemList.add(itemIn);}
	public void addToBulletList(Bullet bulletIn){this.bulletList.add(bulletIn);}
	
}
