/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.common;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 20, 2017
 */

/**
 * The Class Constants contains the list of constants used in this application.
 *
 * @author Praveen,Sankarasubramanian
 * @version 1.0
 * @since 1.0
 */
public class Constants {
	
	/** The log. */
	static Logger log=Logger.getLogger(Constants.class);
	
	/** The properties. */
	static Properties properties = new Properties();
	static {
		try {
			properties.load(Constants.class.getClassLoader().getResourceAsStream("application-constants.properties"));
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}
	
	private Constants(){
		super();
	}

	/*
	 * DIRECTION CONSTANTS-- START
	 * 
	 */

	/** The Constant NORTH. Represents N  */
	public static final String NORTH = properties.getProperty("direction.north");

	/** The Constant EAST. Represents E*/
	public static final String EAST = properties.getProperty("direction.east");

	/** The Constant WEST. Represents W*/
	public static final String WEST = properties.getProperty("direction.west");

	/** The Constant SOUTH. Represents S*/
	public static final String SOUTH = properties.getProperty("direction.south");
	/*
	 * DIRECTION CONSTANTS-- END
	 * 
	 */
}
