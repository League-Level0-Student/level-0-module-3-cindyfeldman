import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
String shape=JOptionPane.showInputDialog("what shape do you want?");



int shapes = Integer.parseInt(shape);
if(shapes==tri) {
	drawSquare();
}
else if(shapes==){
	drawTriangle();
}
else {
	drawCircle();
	
}

		
		
	}
		

		
		
		
		
		
	
	static void drawSquare() {
		Robot hi = new Robot();
		hi.penDown();
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
	
}
	static void drawTriangle() {
	Robot hi = new Robot();
	hi.setSpeed(10);
	hi.penDown();
	hi.turn(90);
	hi.move(100);
	hi.turn(110);
	hi.move(100);
	hi.turn(120);
	hi.move(100);
}
	static void drawCircle() {
	Robot hi = new Robot();
	hi.penDown();
	hi.setSpeed(10);
for (int i = 0; i <35 ; i++) {
	hi.turn(10);
	hi.move(10);
	}
	}}

