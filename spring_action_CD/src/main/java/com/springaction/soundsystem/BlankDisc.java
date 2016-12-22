package com.springaction.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;

	private List<String> tracks;

	// public BlankDisc(String title, String artist, List<String> tracks){
	// this.title=title;
	// this.artist=artist;
	// this.tracks=tracks;
	// }
	//
	public void play() {
		System.out.println("Currently I am plaing " + title + " artists " + artist);
		for (String track : tracks) {
			System.out.println("-Utwor: " + track);
		}

	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

}
