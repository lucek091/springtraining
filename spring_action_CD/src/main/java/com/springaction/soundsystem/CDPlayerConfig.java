package com.springaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc randomBeatlesCD(){
		
		int choice=(int)Math.floor(Math.random()*2);
		if (choice==0){
			return new KrolAlbanii();
		} else  {
			return new WhiteAlbum();
		}
	}
	

	
	

}
