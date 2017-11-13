package org.wahlzeit.model;

import com.google.appengine.api.images.Image;

public class RiverPhotoManager extends PhotoManager {
	
	protected static final RiverPhotoManager instance = new RiverPhotoManager();
	
	/**
	 *
	 */
	public RiverPhotoManager() {
		photoTagCollector = RiverPhotoFactory.getInstance().createPhotoTagCollector();
	}
	
	/**
	 *
	 */
	public static final RiverPhotoManager getInstance() {
		return instance;
	}
	
	
	/**
	 *
	 */
	public Photo createPhoto(String filename, Image uploadedImage) throws Exception {
		PhotoId id = PhotoId.getNextId();
		RiverPhoto result = (RiverPhoto)PhotoUtil.createPhoto(filename, id, uploadedImage);
		addPhoto(result);
		return result;
	}
}
