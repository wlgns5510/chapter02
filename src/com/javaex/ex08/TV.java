package com.javaex.ex08;

public class TV {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	//생성자
	public TV(){}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//메소드-gs
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public boolean Power() {
		return power;
	}

	
	
	
	//메소드-일반
	///// 파워설정 /////
	public void power(boolean action) {
		
		if(action == true) {
			
			  power = true;
		}
		else {
			 power = false;
		}
	}
		
	///// 채널설정 /////
	public void channel(int action) {
		if(action > 0 && action <= 255) {
			this.channel = action;
		}
		else if(action <= 0){
			this.channel = 1;
		}
		else if(action > 255) {
			this.channel = 255;
		}
	}
	
	public void channel(boolean action) {
		if(action == true) {
			if(channel > 0 && channel <= 255) {
				this.channel ++;
			}
			else {
				this.channel = 0;
			}
		}
		else if(action == false) {
			if(channel > 0 && channel <= 255) {
				this.channel --;
			}
			else {
				this.channel = 0;
			}	
		}
	}
	
	///// 볼륨설정 /////
	public void volume(int action) {
		if(action >= 0 && action <= 100) {
			this.volume = action;
		}
		else if(action > 100){
			this.volume = 100;
		}
		else if(action < 0) {
			this.volume = 0;
		}
	}
	
	public void volume(boolean action) {
		if(action == true) {
			if(volume >= 0 && volume <= 100) {
				this.volume ++;
			}
			else {
				this.volume = 0;
			}
		}
		else if(action == false) {
			if(volume >= 0 && volume <= 100) {
				this.volume --;
			}
			else {
				this.volume = 0;
			}
		}
	}
	
	///// 정보출력 /////	
	public void startus() {
		System.out.println("TV [채널: " + channel + "번   " + "볼륨: " + volume + "   " + "전원: " + power + "]");
	}
	
	
	
	
	
}
