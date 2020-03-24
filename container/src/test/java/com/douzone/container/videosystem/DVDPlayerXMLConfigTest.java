package com.douzone.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXMLConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	//@Autowired
	// 예외 발생 : XML Bean 설정 시 id는 자동 부여 되지 않는다.
	DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengersAgeofUltron")
	DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer player2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer player3;
	
	@Autowired
	@Qualifier("dvdPlayer4")
	DVDPlayer player4;
	
	@Test
	public void testDVD2NotNull() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDVD3NotNull() {
		assertNotNull(dvd3);
	}
	
	@Test
	public void testDVD4NotNull() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDVD5NotNull() {
		assertNotNull(dvd5);
	}
	
	@Test
	public void testPlay2() {
		player2.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player3.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
