package com.douzone.container.soundsystem;

import javax.inject.Named;

// 밑의 3개 다 같음.
//@Component("HSRapper3Final")
//@Component("highSchoolRapper3Final")
@Named("highSchoolRapper3Final")
public class HighSchoolRapper3Final implements CompactDisc {

	private String title = "안녕이라는 말";
	private String artist = "송이한";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + ", by " + artist);
	}

}
