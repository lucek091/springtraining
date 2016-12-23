package info.spring.tutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.spring.tutorial.implementations.SomeBean;

public class MainSpring {

	public static void main(String[] args) {
		
/*		ApplicationContext appConext=new ClassPathXmlApplicationContext("someBeanConfiguration.xml");
		
		SomeBean bean = appConext.getBean("someBean", SomeBean.class);*/
		
/*		Locale locale=Locale.getDefault();
		Calendar calendar=GregorianCalendar.getInstance(locale);		
		DateFormat formatter=SimpleDateFormat.getInstance();		
		System.out.println(formatter.format(calendar.getTime()));*/
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("context.xml");
		Calendar calendar = appContext.getBean("calendar", java.util.Calendar.class);		
		DateFormat formatter = appContext.getBean("formatter", java.text.DateFormat.class);
		
		System.out.println(formatter.format(calendar.getTime()));
		
		
		
	}

}
