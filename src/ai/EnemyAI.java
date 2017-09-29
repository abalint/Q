package ai;

import java.util.Random;

import main.Run;
import map.Map;
import player.NPC;
import player.Player;

public class EnemyAI {

	public static Map update(Map map, NPC npc, Player player)
	{
		//npc is farther away on the y axis than on the x
		if(Math.abs(player.getPlayerYCoord() - npc.getYCoord()) > Math.abs(player.getPlayerXCoord() - npc.getXCoord()))
		{
			//move either up or down
			if(player.getPlayerYCoord() - npc.getYCoord() > 0)
				map = moveMapDown(map, npc);
			else
				map = moveMapUp(map, npc);
		}
		//npc is farther away on the x axis than on the y
		else if(Math.abs(player.getPlayerYCoord() - npc.getYCoord()) < Math.abs(player.getPlayerXCoord() - npc.getXCoord()))
		{
			if(player.getPlayerXCoord() - npc.getXCoord() > 0)
				map = moveMapToRight(map, npc);
			else
				map = moveMapToLeft(map, npc);
		}
		//if they are the same
		else
		{
			Random rand = new Random();
			int random = rand.nextInt(1);
			if(random == 0)
			{
				//move either up or down
				if(player.getPlayerYCoord() - npc.getYCoord() > 0)
					map = moveMapDown(map, npc);
				else
					map = moveMapUp(map, npc);
			}//end if 0
			else
			{
				if(player.getPlayerXCoord() - npc.getXCoord() > 0)
					map = moveMapToRight(map, npc);
				else
					map = moveMapToLeft(map, npc);
			}//end else
		}//end else
		
		return map;
	}

	public static Map moveMapToRight(Map map, NPC npc)
	{
		if(map.getCharacterList().get(npc.getYCoord()).size() -1 == npc.getXCoord() || map.getHitBoxCharacterList().contains(""+map.getCharacterList().get(npc.getYCoord()).get(npc.getXCoord()+1)))
			return map;
		npc.setLastMoved('R');
		Character tempChar = npc.getReplacedChar();
		npc.setReplacedChar(map.getCharacterList().get(npc.getYCoord()).get(npc.getXCoord()+1));
		map.getCharacterList().get(npc.getYCoord()).set(npc.getXCoord(), tempChar);
		map.getCharacterList().get(npc.getYCoord()).set(npc.getXCoord()+1, npc.getIcon());
		npc.setXCoord(npc.getXCoord()+1);
		map.setMapString(Run.convertMapToString(map.getCharacterList()));
		return map;
	}
	
	public static Map moveMapToLeft(Map map, NPC npc)
	{
		if(0 == npc.getXCoord() || map.getHitBoxCharacterList().contains(""+map.getCharacterList().get(npc.getYCoord()).get(npc.getXCoord()-1)))
			return map;
		npc.setLastMoved('L');
		Character tempChar = npc.getReplacedChar();
		npc.setReplacedChar(map.getCharacterList().get(npc.getYCoord()).get(npc.getXCoord()-1));
		map.getCharacterList().get(npc.getYCoord()).set(npc.getXCoord(), tempChar);
		map.getCharacterList().get(npc.getYCoord()).set(npc.getXCoord()-1, npc.getIcon());
		npc.setXCoord(npc.getXCoord()-1);
		map.setMapString(Run.convertMapToString(map.getCharacterList()));
		return map;
	}
	
	public static Map moveMapDown(Map map, NPC npc)
	{
		if(map.getCharacterList().get(npc.getYCoord()).size() -1 == npc.getYCoord() || map.getHitBoxCharacterList().contains(""+map.getCharacterList().get(npc.getYCoord()+1).get(npc.getXCoord())))
			return map;
		npc.setLastMoved('D');
		Character tempChar = npc.getReplacedChar();
		npc.setReplacedChar(map.getCharacterList().get(npc.getYCoord()+1).get(npc.getXCoord()));
		map.getCharacterList().get(npc.getYCoord()).set(npc.getXCoord(), tempChar);
		map.getCharacterList().get(npc.getYCoord()+1).set(npc.getXCoord(), npc.getIcon());
		npc.setYCoord(npc.getYCoord()+1);
		map.setMapString(Run.convertMapToString(map.getCharacterList()));
		return map;
	}
	
	public static Map moveMapUp(Map map, NPC npc)
	{
		if(0 == npc.getYCoord()|| map.getHitBoxCharacterList().contains(""+map.getCharacterList().get(npc.getYCoord()-1).get(npc.getXCoord())))
			return map;
		npc.setLastMoved('U');
		Character tempChar = npc.getReplacedChar();
		npc.setReplacedChar(map.getCharacterList().get(npc.getYCoord()-1).get(npc.getXCoord()));
		map.getCharacterList().get(npc.getYCoord()).set(npc.getXCoord(), tempChar);
		map.getCharacterList().get(npc.getYCoord()-1).set(npc.getXCoord(), npc.getIcon());
		npc.setYCoord(npc.getYCoord()-1);
		map.setMapString(Run.convertMapToString(map.getCharacterList()));
		return map;
	}
}
