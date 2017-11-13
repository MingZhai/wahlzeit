package org.wahlzeit.model;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class RiverPhoto extends Photo {
	

	protected String name;//name of river
	protected int length;//length of river
	protected int flow;//flow per second of river
	
	public RiverPhoto() {
		super();
	}
	
	public RiverPhoto(PhotoId myId) {
		super(myId);
	}
	
	public RiverPhoto(String name, int length, int flow) {
		super();
		this.name = name;
		this.length = length;
		this.flow = flow;
	}
	
	public RiverPhoto(PhotoId myId, String name, int length, int flow) {
		super(myId);
		this.name = name;
		this.length = length;
		this.flow = flow;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getFlow() {
		return this.flow;
	}
	
}
