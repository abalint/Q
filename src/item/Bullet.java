package item;

public class Bullet {
	
	
	Character direction;
	Character replacedChar;
	Character bulletIcon;
	int speed;
	int damage;
	int bulletXcoord;
	int bulletYcoord;
	
	
	public void setDirection(Character directionIn){this.direction = directionIn;}
	public void setReplacedChar(Character replacedCharIn){this.replacedChar = replacedCharIn;}
	public void setBulletIcon(Character bulletIconIn){this.bulletIcon = bulletIconIn;}
	public void setSpeed(int speedIn){this.speed = speedIn;}
	public void setDamage(int damageIn){this.damage = damageIn;}
	public void setBulletXCoord(int bulletXcoordIn){this.bulletXcoord = bulletXcoordIn;}
	public void setBulletYCoord(int bulletYcoordIn){this.bulletYcoord = bulletYcoordIn;}
	

	public Character getDirection(){return this.direction;}
	public Character getReplacedChar(){return this.replacedChar;}
	public Character getBulletIcon(){return this.bulletIcon;}
	public int getSpeed(){return this.speed;}
	public int getDamage(){return this.damage;}
	public int getBulletXCoord(){return this.bulletXcoord;}
	public int getBulletYCoord(){return this.bulletYcoord;}
	
	

}
