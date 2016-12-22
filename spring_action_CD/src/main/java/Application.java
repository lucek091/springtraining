import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaction.soundsystem.CDPlayer;
import com.springaction.soundsystem.MediaPlayer;

public class Application {
	
	public static void main(String[] args){
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MediaPlayer cdPlayer=appContext.getBean("cdPlayer", CDPlayer.class);
	
		
	}
	
	

}
