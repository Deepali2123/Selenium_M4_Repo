package com.TakesScreenshot;

import java.time.LocalDateTime;

public class LDT {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(":","-");

	}

}
