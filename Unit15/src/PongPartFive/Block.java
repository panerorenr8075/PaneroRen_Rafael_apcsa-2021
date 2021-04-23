package PongPartFive;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setWidth(10);
		setHeight(10);
		setColor(color.black);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y, int wid, int hei, Color col)
	{
		setPos(x, y);
		setWidth(wid);
		setHeight(hei);
		setColor(col);
	}
	
	public Block(int x, int y, int wid, int hei)
	{
		setPos(x, y);
		setWidth(wid);
		setHeight(hei);
		setColor(color.black);
	}
	
	public Block(int x, int y)
	{
		setPos(x, y);
		setWidth(10);
		setHeight(10);
		setColor(color.black);
	}
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void setPos(int x, int y) 
	{
		setX(x);
		setY(y);
	}

	public void setX(int x)
	{
		xPos = x;
	}

	public void setY(int y)
	{
		yPos = y;
	}
	
	public void setWidth(int wid)
	{
		width = wid;
	}
	
	public void setHeight(int hei)
	{
		height = hei;
	}

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block rhs = (Block) obj;
		if(rhs.getX() == getX() && rhs.getY() == getY() && rhs.getWidth() == getWidth() && rhs.getHeight() == getHeight())
		{
			return true;
		}

		return false;
	}   

   //add the other get methods
	
	public int getX()
	{
		return xPos;
	}

	public int getY() 
	{
		return yPos;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}
    

   //add a toString() method  - x , y , width, height, color
	
	public String toString()
	{
		String output = "";
		output = "X = " + getX() + " Y = " + getY() + " Width = " + getWidth() + " Height = " + getHeight() + " Color = " + getColor();
		return output;
	}
}