package me.demo.maven.startup.service.impl;

import me.demo.maven.startup.service.IAppService;

/**
 * App Test
 * 
 * @author geosmart
 */
public class AppServiceimpl implements IAppService {

	@Override
	public void helloWord() {
		System.out.println("Hello World!");
	}

}
