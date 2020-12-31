package com.cdvasquez.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	public Date startToSee(Date dateI);
	public void stopToSee(Date dateI, Date dateF);

}
