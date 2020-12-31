package com.cdvasquez.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Movie extends Film implements IVisualizable{
	

	private int id;	
	private int timeViewed;		
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);		
		setYear(year);
	}

	public int getTimeViewed() {
		return timeViewed;
	}


	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		return "::MOVIE::\n"+"Title = "+ getTitle() + ", Genre = " + getGenre() + ", Creator = " + getCreator()
				+ ", Duration = " + getDuration() + ", Year = " + getYear()+ ", Viewed = " + isViewed();
	}

	@Override
	public Date startToSee(Date dateI) {		
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		if(dateF.getTime() > dateI.getTime()) {
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
	}
	
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie> movies = new ArrayList<>();	

		for(int i =0; i < 5; i ++) {
			movies.add(new Movie("Movie "+ (i+1), "Genero "+ (i+1), "Creador "+ (i+1), 120+(i+1), (short)(2017+ (i+1))));
		}
		
		return movies;
	}
	
	
}
