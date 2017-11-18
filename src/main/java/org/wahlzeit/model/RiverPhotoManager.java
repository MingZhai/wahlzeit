package org.wahlzeit.model;

import java.util.logging.Logger;

import com.google.appengine.api.images.Image;

public class RiverPhotoManager extends PhotoManager {
	
	private static final Logger log = Logger.getLogger(RiverPhotoManager.class.getName());
	static final RiverPhotoManager instance = new RiverPhotoManager();
	
	public RiverPhotoManager() {
		super();
	}
	

	/**
	 *
	 */
	public static final RiverPhotoManager getInstance() {
		return instance;
	}
	
	
	@Override
	public Photo createPhoto(String filename, Image uploadedImage) throws Exception {
		PhotoId id = PhotoId.getNextId();
		RiverPhoto result = PhotoUtil.createPhoto(filename, id, uploadedImage);
		addPhoto(result);
		return result;
	}
}
