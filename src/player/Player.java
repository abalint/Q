package player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import item.Bullet;
import item.Item;

public class Player {

	Character playerIcon = '@';
	Character replacedChar;
	Character lastMoved;
	int playerXcoord;
	int playerYcoord;
	boolean inInventory;
	boolean inConsoleInfo;
	LinkedList<String> consoleOutput = new LinkedList<String>();
	List<String> boardInputQueue = new ArrayList<String>();
	List<String> consoleInputQueue= new ArrayList<String>();
	List<String> textBarInputQueue= new ArrayList<String>();
	List<Item> itemList= new ArrayList<Item>();
	List<Bullet> bulletList = new ArrayList<Bullet>();
	
	//setters
	public void setPlayerIcon(Character playerIconIn){this.playerIcon = playerIconIn ;}
	public void setReplacedChar(Character replacedCharIn){this.replacedChar = replacedCharIn ;}
	public void setLastMoved(Character lastMovedIn){this.lastMoved = lastMovedIn;}
	public void setPlayerXCoord(int playerXcoordIn){this.playerXcoord = playerXcoordIn;}
	public void setPlayerYCoord(int playerYcoordIn){this.playerYcoord = playerYcoordIn;}
	public void setItemList(List<Item> itemListIn){this.itemList = itemListIn;}
	public void setInInventory(boolean inInventoryIn){this.inInventory = inInventoryIn;}
	public void setInConsoleInfo(boolean inConsoleInfoIn){this.inConsoleInfo = inConsoleInfoIn;}
	public void setBoardInputQueue(List<String> boardInputQueueIn){this.boardInputQueue = boardInputQueueIn;}
	public void setConsoleInputQueue(List<String> consoleInputQueueIn){this.consoleInputQueue = consoleInputQueueIn;}
	public void setTextBarInputQueue(List<String> textBarInputQueueIn){this.textBarInputQueue = textBarInputQueueIn;}
	public void setConsoleOutput(LinkedList<String> consoleOutputIn){this.consoleOutput = consoleOutputIn;}
	public void setBulletList(List<Bullet> bulletListIn){this.bulletList = bulletListIn;}
	
	//getters
	public Character getPlayerIcon(){return this.playerIcon;}
	public Character getReplacedChar(){return this.replacedChar;}
	public Character getLastMoved(){return this.lastMoved;}
	public int getPlayerXCoord(){return this.playerXcoord;}
	public int getPlayerYCoord(){return this.playerYcoord;}
	public List<Item> getItemList(){return this.itemList;}
	public boolean getInInventory(){return this.inInventory;}
	public boolean getInConsoleInfo(){return this.inConsoleInfo;}
	public List<String> getBoardInputQueue(){return this.boardInputQueue;}
	public List<String> getConsoleInputQueue(){return this.consoleInputQueue;}
	public List<String> getTextBarInputQueue(){return this.textBarInputQueue;}
	public LinkedList<String> getConsoleOutput(){return this.consoleOutput;}
	public List<Bullet> getBulletList(){return this.bulletList;}
	
	//misc
	public void addItemToItemList(Item itemIn){this.itemList.add(itemIn);}
	public void appendToBoardInputQueue(String appendString){this.boardInputQueue.add(appendString);}
	public void clearBoardInputQueue(){this.boardInputQueue.clear();}
	public void appendToConsoleInputQueue(String appendString){this.consoleInputQueue.add(appendString);}
	public void clearConsoleInputQueue(){this.consoleInputQueue.clear();}
	public void appendToTextBarInputQueue(String appendString){this.textBarInputQueue.add(appendString);}
	public void clearTextBarInputQueue(){this.textBarInputQueue.clear();}
	public void addToConsoleOutput(String textIn){this.consoleOutput.add(textIn);}
	public void popConsoleOutput(int numberOfPops){for(int i = 0; i < numberOfPops; i++){this.consoleOutput.pop();}}
	public String getConvertedConsoleOutputToString(){String convertedString= "";for(String line : this.consoleOutput){convertedString += line+"\n";}return convertedString;}
	public void addBulletToList(Bullet bulletIn){this.bulletList.add(bulletIn);}
	
	public Player()
	{
		this.boardInputQueue = new ArrayList<String>();
		this.inConsoleInfo = false;
		this.inInventory = false;
	}
}

