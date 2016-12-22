package info.spring.tutorial.implementations;

import java.util.Date;

import info.spring.tutorial.repository.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date()+": " + message);
	}

}
