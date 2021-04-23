package PongPartFour;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	private int leftScore;
	private int rightScore;


	public Pong()
	{
		//set up all variables related to the game
		leftPaddle = new Paddle(20, 225, 5, 55, 5);
		rightPaddle = new Paddle(760, 225, 5, 55, 5);
		ball = new Ball();
		
		leftScore = 0;
		rightScore = 0;



		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			if (!(ball.getX() >= 10))
			{
				rightScore++;
			}
			else
			{
				leftScore++;
			}
			Ball cover = new Ball(ball.getX(), ball.getY(), 10, 10, Color.WHITE);
			cover.draw(graphToBack);
			ball = new Ball();
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=550))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if(ball.didCollideRight(leftPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if(ball.didCollideBottom(leftPaddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollideTop(leftPaddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		
		
		//see if the ball hits the right paddle
		if(ball.didCollideLeft(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if(ball.didCollideRight(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if(ball.didCollideBottom(rightPaddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollideTop(rightPaddle))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}


		//see if the paddles need to be moved
		
		if(keys[0] == true&&leftPaddle.getY()>0)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true&&leftPaddle.getY()<510)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		if(keys[2] == true&&rightPaddle.getY()>0)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true&&rightPaddle.getY()<510)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		
		twoDGraph.drawImage(back, null, 0, 0);
		
		twoDGraph.drawString("Leftscore: " + Integer.toString(leftScore), 340, 520);
		twoDGraph.drawString("Rightscore: " + Integer.toString(rightScore), 340, 550);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}