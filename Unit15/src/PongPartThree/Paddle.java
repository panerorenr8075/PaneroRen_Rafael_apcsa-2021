package PongPartThree;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x, y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int spd)
   {
	   super(x, y);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int wid, int hei, int spd)
   {
	   super(x, y, wid, hei);
	   speed = spd;
   }

   public Paddle(int x, int y, int wid, int hei, Color col, int spd)
   {
	   super(x, y, wid, hei, col);
	   speed = spd;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   Color temp = getColor();
	   draw(window, Color.WHITE);
	   
	   setY(getY()-speed);
	   draw(window, temp);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   Color temp = getColor();
	   draw(window, Color.WHITE);

	   setY(getY()+speed);
	   draw(window, temp);
   }

   //add get methods
   
   public int getSpeed()
   {
	   return speed;
   }
   
   
   //add a toString() method
   
   public String toString()
   {
	   String output = "";
	   output = "X = " + getX() + " Y = " + getY() + " Width = " + getWidth() + " Height = " + getHeight() + " Color = " + getColor() + "\t" + getSpeed();
	   return output;
   }
}