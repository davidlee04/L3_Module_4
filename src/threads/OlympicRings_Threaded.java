package threads;

import java.awt.Color;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r1 = new Robot(675, 500);
		Robot r2 = new Robot(825, 500);
		Robot r3 = new Robot(600, 350);
		Robot r4 = new Robot(750, 350);
		Robot r5 = new Robot(900, 350);
		
		r1.setSpeed(10);
		r2.setSpeed(10);
		r3.setSpeed(10);
		r4.setSpeed(10);
		r5.setSpeed(10);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				r1.penDown();
				r1.setPenColor(Color.yellow);
			    for (int i = 0; i < 360; i++) {
					r1.turn(360/360);
					r1.move(2);
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				r2.penDown();
				r2.setPenColor(Color.GREEN);
				for (int i = 0; i < 360; i++) {
					r2.turn(360/360);
					r2.move(2);
					
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				r3.penDown();
				r3.setPenColor(Color.blue);
				for (int i = 0; i < 360; i++) {
					r3.turn(360/360);
					r3.move(2);
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				r4.penDown();
				r4.setPenColor(Color.black);
				for (int i = 0; i < 360; i++) {
					r4.turn(360/360);
					r4.move(2);
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				r5.penDown();
				r5.setPenColor(Color.red);
				for (int i = 0; i < 360; i++) {
					r5.turn(360/360);
					r5.move(2);
				}
			}
		}).start();
	}
	
}

