import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class DrawHouse {
	public static void main(String[] args) {
	
		drawAtBottom();
		Tortoise.setAngle(90);
		drawFlatRoof("small");
		drawFlatRoof("medium");
		drawFlatRoof("large");
		
	}
		
	
	static void drawAtBottom(){
		
	Tortoise.penUp();
	Tortoise.setSpeed(3);
	Tortoise.setX(0);
	Tortoise.setY(430);

	}
	static void drawFlatRoof(String height){
		int size=0;
		int small= 60;
		int medium=120;
		int large= 250;
		if (height.equals("small")){
		size=small;	
		}
		if (height.equals("medium")){
			size=medium;
		}
		if (height.equals("large")){
			size=large;
		}
		
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.green);
		
		Tortoise.move(50);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.BLUE);
		Tortoise.turn(-90);
		Tortoise.move(size);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(size);
		Tortoise.turn(-90);
		
	}
	
}
