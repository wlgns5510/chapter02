package com.javaex.ex14;

public class DrawApp {

	public static void main(String[] args) {
		Ractangle r1 = new Ractangle("빨강", "검정", 4, 4);
		r1.draw();
		
		Ractangle r2 = new Ractangle("주황", "검정", 5, 5);
		r2.draw();
		
		Triangle t1 = new Triangle("빨강", "검정", 4, 4);
		t1.draw();
		
		Triangle t2 = new Triangle("보라", "검정", 10, 10);
		t2.draw();
								
		Circle c1 = new Circle("보라", "빨강", 3);
		c1.draw();
		
		Circle c2 = new Circle("보라", "검정", 3);
		c2.draw();
		

	}

}
