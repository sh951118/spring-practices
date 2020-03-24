package com.douzone.container.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerJavaConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CDPlayer cdPlayer;
	
//	@Test
//	public void testCDNull() {
//		assertNotNull(cd);
//	}
	
	@Test
	public void testCDPlayerNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 안녕이라는 말, by 송이한", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
