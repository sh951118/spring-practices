package com.douzone.container.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.AppConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes= {AppConfig01.class})
@ContextConfiguration(locations={"/config/user/applicationContext02.xml"})
public class XmlConfigTest {

	@Autowired
	private User user;
	
	@Test
	public void testUserNotNull() {
		assertNotNull(user);
	}
}
