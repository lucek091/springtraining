package com.springaction.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class KrolAlbanii implements CompactDisc{
	private String title="Plyta Gang Albanii";
	private String artist="Popek Ciota";
	
	public void play(){
		System.out.println("Currently I am plaing "+title+" artists "+artist);
	}

}
