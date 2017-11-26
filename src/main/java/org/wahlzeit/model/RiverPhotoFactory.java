package org.wahlzeit.model;

import java.util.logging.Logger;

import org.wahlzeit.services.LogBuilder;

public class RiverPhotoFactory extends PhotoFactory {

	/**
	 * Hidden singleton instance; needs to be initialized from the outside.
	 */
	private static RiverPhotoFactory instance = null;
	
	private static final Logger log = Logger.getLogger(PhotoFactory.class.getName());
	
//	/**
//	 * overload two create methods because they have special parameters
//	 */
//	public RiverPhoto createPhoto(String name, int length, int flow) {
//		return new RiverPhoto(name, length, flow);
//	}
//
//	public RiverPhoto createPhoto(PhotoId id, String name, int length, int flow) {
//		return new RiverPhoto(id, name, length, flow);
//	}
	
	/**
	 * @methodtype factory
	 */
	public RiverPhoto createPhoto() {
		return new RiverPhoto();
	}

	/**
	 * Creates a new photo with the specified id
	 */
	public RiverPhoto createPhoto(PhotoId id) {
		return new RiverPhoto(id);
	}
	
	/**
	 * Hidden singleton instance; needs to be initialized from the outside.
	 */
	public static void initialize() {
		getInstance(); // drops result due to getInstance() side-effects
	}

	/**
	 * Public singleton access method.
	 */
	public static synchronized RiverPhotoFactory getInstance() {
		if (instance == null) {
			log.config(LogBuilder.createSystemMessage().addAction("setting generic PhotoFactory").toString());
			setInstance(new RiverPhotoFactory());
		}

		return instance;
	}

	/**
	 * Method to set the singleton instance of PhotoFactory.
	 */
	protected static synchronized void setInstance(RiverPhotoFactory riverPhotoFactory) {
		if (instance != null) {
			throw new IllegalStateException("attempt to initalize PhotoFactory twice");
		}

		instance = riverPhotoFactory;
	}
	
}
