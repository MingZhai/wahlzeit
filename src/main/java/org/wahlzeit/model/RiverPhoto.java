package org.wahlzeit.model;

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
	
}
