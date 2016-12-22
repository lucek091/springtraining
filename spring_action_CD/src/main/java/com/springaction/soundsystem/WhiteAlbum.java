package com.springaction.soundsystem;

public class WhiteAlbum implements CompactDisc{
	
	private String title="White Album";
	private String artist="White Artis";
	

	@Override
	public void play() {
		System.out.println("Currently I am plaing "+title+" artists "+artist);
		
	}

}
