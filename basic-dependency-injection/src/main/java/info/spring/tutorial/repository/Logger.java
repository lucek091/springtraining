package info.spring.tutorial.repository;

public interface Logger {

	void log(String message);
	void setLoggerName(String name);
	void setVersion(int versions);
}
