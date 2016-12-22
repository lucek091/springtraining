package com.springaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
	
	private CompactDisc compactDisc;
	
//	public CDPlayer(CompactDisc compactDisc){
//		
//		compactDisc.play();		
//	}

	
	@Override
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc){
		this.compactDisc=compactDisc;
		play();
	}

	@Override
	public void play(){
		compactDisc.play();
	}
}
