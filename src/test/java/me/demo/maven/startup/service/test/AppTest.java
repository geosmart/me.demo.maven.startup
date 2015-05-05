package me.demo.maven.startup.service.test;

import me.demo.maven.startup.service.IAppService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * App Test
 * 
 * @author wanggang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AppTest {

	@Autowired
	IAppService appSerivice;

	@Before
	public void startup() {
		System.out.println("---startup");
	}

	@Test
	public void helloWorldTest() {
		appSerivice.helloWord();
	}

	@After
	public void teardown() {
		System.out.println("---teardown");
	}
}
