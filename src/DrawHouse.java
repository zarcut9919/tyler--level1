import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class DrawHouse {
	public static void main(String[] args) {
	
		drawAtBottom();
		Tortoise.setAngle(90);
		for (int i = 0; i < 20; i++) {
		int y= new Random().nextInt(2);
		if (y==0){
		drawFlatRoof();	
		}
		if (y==1){
		drawPointyRoof();	
		}
		
		
		
		}
		
	}
		
	
	static void drawAtBottom(){
		
	Tortoise.penUp();
	Tortoise.setSpeed(3);
	Tortoise.setX(0);
	Tortoise.setY(430);

	}
	static void drawFlatRoof(){
		int nick2=new Random().nextInt(200)+50;
		
		
		
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.green);
		
		Tortoise.move(50);
		Tortoise.penDown();
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.turn(-90);
		Tortoise.move(nick2);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(nick2);
		Tortoise.turn(-90);
		
	}
	static void drawPointyRoof(){
		int nick=new Random().nextInt(200)+50;
		Tortoise.setPenColor(Color.green);
		Tortoise.move(50);
		Tortoise.turn(-90);
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(nick);
		Tortoise.turn(45);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(45);
		Tortoise.move(nick);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(5);

		
	}
}
