package info.spring.tutorial.implementations;

import java.util.Date;

import info.spring.tutorial.repository.Logger;

public class LoggerImpl implements Logger {
	
	private String name;
	private int version;

	public void setVersion(int version) {
		this.version = version;
	}

	public void log(String message) {
		System.out.println(new Date()+" ["+name+" v."+ version+"] : " + message);
	}

	public void setLoggerName(String name) {
		this.name=name;
	}

}
