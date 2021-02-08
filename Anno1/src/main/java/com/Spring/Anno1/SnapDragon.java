package com.Spring.Anno1;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcess {

	@Override
	public void process() {
		System.out.println("SnapDragon is used");

	}

}
