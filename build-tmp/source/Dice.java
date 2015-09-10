import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
  noLoop();
  size(500, 500);
  background(200);
}
public void draw()
{
  background(200);

  for(int y = 50; y <= 175; y += 125)
  {
    for(int x = 50; x <= 300; x += 125)
    {
      Die one = new Die(x, y);
      one.show();
      one.roll();
    }
  }
}
public void mousePressed()
{
  redraw();
}

class Die
{
  int dieX, dieY;
  int value;
  int probabilityColor = (int)(Math.random() * 2); 
  Die(int x, int y) 
  {
    roll();
    dieX = x;
    dieY = y;
  }


  public void roll()
  {
    value = (int)(Math.random() * 6 + 1);
  }
  public void show()
  {
    

    if(probabilityColor == 0)
    {
      fill(0);
    } else if(probabilityColor == 1)
    {
      fill(255);
    }

    
    rect(dieX, dieY, 100, 100, 10);

    if(probabilityColor == 1)
    {
      fill(0);
    } else if(probabilityColor == 0)
    {
      fill(255);
    }

    stroke(0);

    if(value == 1)
    {
      
      ellipse(dieX + 50, dieY + 50, 15, 15);
    } else if( value == 2)
    {
      
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
    } else if(value == 3)
    {
      
      ellipse(dieX + 50, dieY + 50, 15, 15);
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);

    } else if(value == 4)
    {
    
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 25, 15, 15);
      ellipse(dieX + 25, dieY + 75, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
    } else if(value == 5) 
    {
      
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 25, 15, 15);
      ellipse(dieX + 25, dieY + 75, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      ellipse(dieX + 50, dieY + 50, 15, 15);
    } else if(value == 6)
    {
      
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 25, 15, 15);
      ellipse(dieX + 25, dieY + 75, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      ellipse(dieX + 25, dieY + 50, 15, 15);
      ellipse(dieX + 75, dieY + 50, 15, 15);
    } 
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
