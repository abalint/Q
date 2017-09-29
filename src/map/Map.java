package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {

	List<List<Character>> characterList;
	List<InteractableObject> interactableList;
	String mapString;
	String hitBoxCharacterList = "#\\/.|-Q@";
	String npcCharacterList = "Q";
	

	public List<List<Character>> getCharacterList(){return this.characterList;}
	public String getMapString(){return this.mapString;}
	public String getHitBoxCharacterList(){return this.hitBoxCharacterList;}
	public String getNPCCharacterList(){return this.npcCharacterList;}
	public List<InteractableObject> getInteractableObjectList(){return this.interactableList;}
	
	public void setCharacterList(List<List<Character>> characterListIn){this.characterList = characterListIn;}
	public void setMapString(String mapStringIn){this.mapString = mapStringIn;}
	public void setNPCCharacterList(String npcCharacterListIn){this.npcCharacterList = npcCharacterListIn;}
	public void setInteractableObjectList(List<InteractableObject> interactableObjectListIn){this.interactableList = interactableObjectListIn;}
	
	public void addToInteractableObjectList(InteractableObject object){this.interactableList.add(object);}
	
	
	
	public Map(){
		List<List<Character>> mapCharacterList = new ArrayList<List<Character>>();
		//InputStream in = getClass().getResourceAsStream("/Files/Map.txt");
		Scanner scanner = new Scanner(getClass().getResourceAsStream("/Files/Map.txt"));
		while(scanner.hasNextLine())
		{
			List<Character>mapLine = new ArrayList<Character>();
			String line = scanner.nextLine();
			for(int i = 0; i < line.length(); i ++)
			{
				mapLine.add(line.charAt(i));
			}
			mapCharacterList.add(mapLine);
		}
		scanner.close();
		
		this.setCharacterList(mapCharacterList);
		this.setMapString(convertMapToString(mapCharacterList));
		
	}
	
	public static String convertMapToString(List<List<Character>> map)
	{
		String mapString = new String();
		
		
		for(List<Character> mapLine : map)
		{
			for(Character mapChar : mapLine)
			{
				mapString += mapChar;
			}
			mapString += "\n";
		}
		
		return mapString;
	}
	
	
}

