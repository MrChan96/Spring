package com.km.demo1;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Bicycle {

	private String bicName;

	public Bicycle(String bicName) {
		super();
		this.bicName = bicName;
	}

	@Override
	public String toString() {
		return "Bicycle [bicName=" + bicName + "]";
	}

}
