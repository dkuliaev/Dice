int rollTotal;
void setup()
{
  noLoop();
  size(500, 500);
  background(200);
}
void draw()
{
  background(200);
  rollTotal = 0;
  for(int y = 50; y <= 175; y += 125)
  {
    for(int x = 50; x <= 300; x += 125)
    {
      Die one = new Die(x, y);
      one.show();
      one.roll();
    }
  }
      fill(0);
      textSize(25);
      text("Your total is " + rollTotal, 150, 400);
}
void mousePressed()
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
  
    
    

  void roll()
  {
    value = (int)(Math.random() * 6 + 1);
  }
  void show()
  {
    
    if(probabilityColor == 0)
    {
      fill(0);
    } else if(probabilityColor == 1)
    {
      fill(255);
    }

    
    rect(dieX, dieY, 100, 100, 10);
    fill(255, 0, 0);


    
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
      rollTotal += 1;
    } else if( value == 2)
    {
      
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      rollTotal += 2;
    } else if(value == 3)
    {
      
      ellipse(dieX + 50, dieY + 50, 15, 15);
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      rollTotal += 3;

    } else if(value == 4)
    {
    
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 25, 15, 15);
      ellipse(dieX + 25, dieY + 75, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      rollTotal += 4;
      
    } else if(value == 5) 
    {
      
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 25, 15, 15);
      ellipse(dieX + 25, dieY + 75, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      ellipse(dieX + 50, dieY + 50, 15, 15);
      rollTotal += 5;
      
    } else if(value == 6)
    {
      
      ellipse(dieX + 25, dieY + 25, 15, 15);
      ellipse(dieX + 75, dieY + 25, 15, 15);
      ellipse(dieX + 25, dieY + 75, 15, 15);
      ellipse(dieX + 75, dieY + 75, 15, 15);
      ellipse(dieX + 25, dieY + 50, 15, 15);
      ellipse(dieX + 75, dieY + 50, 15, 15);
      rollTotal += 6;
    } 
  }
}
