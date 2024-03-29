package org.newdawn.slick.loading;

import java.io.IOException;

/**
 * A description of any class providing a resource handle that be loaded 
 * at a later date (i.e. deferred)
 *
 * @author kevin
 */
public interface DeferredResource {

	/**
	 * Load the actual resource 
	 * 
	 * @throws IOException Indicates a failure to load the resource
	 */
    void load() throws IOException;
	
	/**
	 * Get a description of the resource to be loaded
	 * 
	 * @return The description of the resource to be loaded
	 */
    String getDescription();
}
