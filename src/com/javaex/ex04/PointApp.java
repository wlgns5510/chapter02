package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point xy1= new Point();
		xy1.setX(5);
		xy1.setY(5);
		
		Point xy2= new Point();
		xy2.setX(10);
		xy2.setY(23);
		
		Point xy3= new Point(10,20);
		
		Point xy4 = new Point(100);
		xy4.setY(200);
		
	
		
		
		//draw메소드
		xy1.draw();
		xy2.draw();
		xy3.draw();
		xy4.draw();
		
		xy1.draw(true); //그리기
		xy1.draw(false); //지우기
		
		
						
	}

}

