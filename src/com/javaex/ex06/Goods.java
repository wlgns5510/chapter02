package com.javaex.ex06;

public class Goods {
	//필드
	private String name;
	private int price;
	//생성자
	public Goods() {	//기본생성자 //없어도 작동함
		//****** 메모리에 올리는일(클래스를 인스턴스화)******		
		//로직
	}
	public Goods(String name) {
		//****** 메모리에 올리는일(클래스를 인스턴스화)******		
		//추가로직
		this.name = name;
	}
	public Goods(String name, int price) {
		//****** 메모리에 올리는일(클래스를 인스턴스화)******		
		//추가 로직
		this.name = name;
		this.price = price;
	}
	//메소드-gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("");
		
		
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]"; //출력물이 너무 많을경우 toString으로 자동반영(테스트 용)
	}
}
