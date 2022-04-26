package com.javaex.ex14;

public class Triangle extends Ractangle{
	//필드
	//생성자
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor, width, height);
	}
	//메소드-gs
	//메소드-일반
	
	public void draw() {
		System.out.println("면색:" + getFillColor() + ", " + "선색:" + getLineColor() + ", " + "가로:" + getWidth() + ", " + "세로: " + getHeight() + " 삼각형을 그렸습니다.");
	}
}
