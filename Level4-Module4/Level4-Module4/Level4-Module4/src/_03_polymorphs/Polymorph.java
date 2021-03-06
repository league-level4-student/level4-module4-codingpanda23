package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    MovingMorph move = new MovingMorph();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public int getX() {
    	return this.x;
    }
    public void setX(int x) {
    	
    }
    
    public int getY() {
    	return this.y;
    }
    public void setY(int y) {
    	
    }
    
    public int getWidth() {
    	return this.width;
    }
    public void setWidth(int width) {
    	
    }
    
    public int getHeight() {
    	return this.height;
    }
    public void setHeight(int height) {
    	
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 Random r = new Random;
   	 Random rand = new Random;
   	 
   	 move.x = r;
   	 move.y = rand;
    }
    
    public abstract void draw(Graphics g);
}



















