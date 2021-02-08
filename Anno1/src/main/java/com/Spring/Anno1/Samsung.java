package com.Spring.Anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	public MobileProcess mp;

	public MobileProcess getMp() {
		return mp;
	}

	public void setMp(MobileProcess mp) {
		this.mp = mp;
	}
	
	public void config() {
		System.out.println("Samsung phone in Anno1 is called");
		mp.process();
	}
	
}
