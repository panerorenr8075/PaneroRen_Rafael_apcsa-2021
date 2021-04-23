package PongPartThree;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y, int wid, int hei, Color col, int xspd, int yspd)
	{
		super(x, y, wid, hei, col);
		xSpeed = xspd;
		ySpeed = yspd;
	}
	
	public Ball(int x, int y, int wid, int hei)
	{
		super(x, y, wid, hei);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int wid, int hei, Color col)
	{
		super(x, y, wid, hei, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	  
   //add the set methods
   
	public void setYSpeed(int yspd)
	{
		ySpeed = yspd;
	}
	
	public void setXSpeed(int xspd)
	{
		xSpeed = xspd;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);


	   setX(getX()+xSpeed);
		//setY
	   setY(getY()+ySpeed);

		//draw the ball at its new location
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball rhs = (Ball) obj;
		if(rhs.getX() == getX() && rhs.getY() == getY() && rhs.getWidth() == getWidth() && rhs.getHeight() == getHeight() && rhs.getColor() == getColor() && rhs.getYSpeed() == getYSpeed() && rhs.getXSpeed() == getXSpeed())
		{
			return true;
		}
		
		return false;
	}   

   //add the get methods
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	public int getXSpeed()
	{
		return xSpeed;
	}

   //add a toString() method
	
	public String toString()
	{
		String output = "";
		output = "X = " + getX() + " Y = " + getY() + " Width = " + getWidth() + " Height = " + getHeight() + " Color = " + getColor() + "\t" + getXSpeed() + " " + getYSpeed();
		return output;
	}
}