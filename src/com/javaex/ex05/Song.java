package com.javaex.ex05;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	//생성자
	//메소드-gs
	public void setTitle(String t) {
		this.title = t;
	}
	public void setArtist(String a) {
		this.artist = a;
	}
	public void setAlbum(String a) {
		this.album = a;
	}
	public void setComposer(String c) {
		this.composer = c;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public void setTrack(String t) {
		this.track = t;
	}
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbm() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public String getTrack() {
		return track;
	}
	
	//메소드-일반
	public void showlnfo(){
		System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track + ", " + composer + " )");
	}
}
