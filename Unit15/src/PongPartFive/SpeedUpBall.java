package PongPartFive;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpeed;
	private int ySpeed;

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y);
	   xSpeed = xSpd;
	   ySpeed = ySpd;
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht);
	   xSpeed = xSpd;
	   ySpeed = ySpd;
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col);
	   xSpeed = xSpd;
	   ySpeed = ySpd;
   }
   
   public boolean didCollideLeft(Object obj)
   {
	   if (super.didCollideLeft(obj))
	   {
		   if (super.getXSpeed() >= 0)
		   {
			   super.setXSpeed(super.getXSpeed()+1);
		   }
		   else
		   {
			   super.setXSpeed(super.getXSpeed()-1);
		   }
		   
		   if (super.getYSpeed() >= 0)
		   {
			   super.setYSpeed(super.getYSpeed()+1);
		   }
		   else
		   {
			   super.setYSpeed(super.getYSpeed()-1);
		   }
	   }
	   return super.didCollideLeft(obj);
   }
   
   public boolean didCollideRight(Object obj)
   {
	   if (super.didCollideRight(obj))
	   {
		   if (super.getXSpeed() >= 0)
		   {
			   super.setXSpeed(super.getXSpeed()+1);
		   }
		   else
		   {
			   super.setXSpeed(super.getXSpeed()-1);
		   }
		   
		   if (super.getYSpeed() >= 0)
		   {
			   super.setYSpeed(super.getYSpeed()+1);
		   }
		   else
		   {
			   super.setYSpeed(super.getYSpeed()-1);
		   }
	   }
	   return super.didCollideRight(obj);
   }
   
   public boolean didCollideTop(Object obj)
   {
	   if (super.didCollideTop(obj))
	   {
		   if (super.getXSpeed() >= 0)
		   {
			   super.setXSpeed(super.getXSpeed()+1);
		   }
		   else
		   {
			   super.setXSpeed(super.getXSpeed()-1);
		   }
		   
		   if (super.getYSpeed() >= 0)
		   {
			   super.setYSpeed(super.getYSpeed()+1);
		   }
		   else
		   {
			   super.setYSpeed(super.getYSpeed()-1);
		   }
	   }
	   return super.didCollideTop(obj);
   }
   
   public boolean didCollideBottom(Object obj)
   {
	   if (super.didCollideBottom(obj))
	   {
		   if (super.getXSpeed() >= 0)
		   {
			   super.setXSpeed(super.getXSpeed()+1);
		   }
		   else
		   {
			   super.setXSpeed(super.getXSpeed()-1);
		   }
		   
		   if (super.getYSpeed() >= 0)
		   {
			   super.setYSpeed(super.getYSpeed()+1);
		   }
		   else
		   {
			   super.setYSpeed(super.getYSpeed()-1);
		   }
	   }
	   return super.didCollideBottom(obj);
   }

}

