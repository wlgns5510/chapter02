package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack("3번 track");
		iu.setComposer("이민수 작곡");
		
		iu.showlnfo();
		//아이유
		
		Song bigbang = new Song();
		bigbang.setArtist("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack("2번 track");
		bigbang.setComposer("G-DRAGON");
		
		bigbang.showlnfo();
		//빅뱅
		
		Song buskerbusker = new Song();
		buskerbusker.setArtist("버스커버스커");
		buskerbusker.setTitle("벚꽃엔딩");
		buskerbusker.setAlbum("버스커버스커1집");
		buskerbusker.setYear(2012);
		buskerbusker.setTrack("4번 track");
		buskerbusker.setComposer("장범준 작곡");
		
		buskerbusker.showlnfo();
		//버스커버스커

	}

}
