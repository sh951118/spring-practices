package com.douzone.container.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.mixing.VideoSystemConfig;


// @ContextConfiguration(classes={DVDConfig.class, DVDPlayerConfig.class}) 
// 이렇게도 사용 가능하지만 복잡도를 피해가기 위함. 또한, 조립식으로 만들기 위해 밑에처럼 사용 권장.

@ContextConfiguration(classes=VideoSystemConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DVDPlayerJavaMixingConfigTest02 {

	@Autowired
	DVDPlayer player;
	
	@Test
	public void testPlayerNotNull() {
		assertNotNull(player);
	}
}
