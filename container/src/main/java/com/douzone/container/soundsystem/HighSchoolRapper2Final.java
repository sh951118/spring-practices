package com.douzone.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper2Final implements CompactDisc {

	private String title = "오빛너";
	private String artist = "마크툽";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + ", by " + artist);
	}

}
