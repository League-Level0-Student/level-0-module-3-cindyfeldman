import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("what color do you want?");
	String red= "red";
	String blue = "blue";
	String neon = "neon";
	Robot hi = new Robot();
	if(color.equals(red)) {
	
		hi.setPenColor(255, 0, 0);
	}
	else if(color.equals(blue)) {
		hi.setPenColor(0, 0, 255);}
		else if(color.equals(neon)){
			hi.setPenColor(0,255,0);
		}
	
	
	
String shape=JOptionPane.showInputDialog("what shape do you want?");


String triangle = "triangle";
String square = "square";
String circle = "circle";

if(shape.equals(square)) {
	drawSquare(hi);
}
else if(shape.equals(triangle)) {
	drawTriangle(hi);
}
else {
	drawCircle(hi);}}
	



		
		
	
	static void drawSquare(Robot hi) {
		hi.penDown();
		hi.setSpeed(10);
		for(int i = 0; i<4;i++) {
			hi.turn(90);
			hi.move(100);
		}
	
}
	static void drawTriangle(Robot hi) {

	hi.setSpeed(10);
	hi.penDown();
	
	hi.turn(90);
	hi.move(112);
	hi.turn(110);
	hi.move(100);
	hi.turn(120);
	hi.move(100);
}
	static void drawCircle(Robot hi) {
	
	hi.penDown();
	hi.setSpeed(10);
for (int i = 0; i <35 ; i++) {
	hi.turn(10);
	hi.move(10);
	}
	}}

