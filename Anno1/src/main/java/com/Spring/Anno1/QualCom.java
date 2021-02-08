package com.Spring.Anno1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QualCom implements MobileProcess {

	@Override
	public void process() {
		System.out.println("QualCom is used");

	}

}
