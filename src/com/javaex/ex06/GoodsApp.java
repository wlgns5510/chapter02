package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		Goods computer = new Goods("LG그램", 900000);
		//생성자를 사용해서 표현
		
		Goods camera = new Goods("니콘");
		camera.setPrice(400000);
		//생성자를 사용해서 표현
		

		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
//		System.out.println(computer.getName());
//		System.out.println(computer.getPrice());
		System.out.println(computer.toString()); 
		System.out.println(camera.toString());
		System.out.println(cup.toString());      //출력물이 너무 많을경우 toString으로 자동반영(테스트 용)

	}

}
