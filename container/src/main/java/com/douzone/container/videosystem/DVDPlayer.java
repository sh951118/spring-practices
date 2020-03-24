package com.douzone.container.videosystem;

public class DVDPlayer {

	// 전체적으로 표시하면 어벤져스 뿐만 아니라 인터페이스와 연관된 모든 것을 사용 가능(확장성 용이)
	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {
		
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}
}
