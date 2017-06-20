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
			properties.load(Constants.class.getClassLoader().getResourceAsStream("configuration.properties"));
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
	public static final char NORTH = properties.getProperty("direction.north").charAt(0);

	/** The Constant EAST. Represents E*/
	public static final char EAST = properties.getProperty("direction.east").charAt(0);

	/** The Constant WEST. Represents W*/
	public static final char WEST = properties.getProperty("direction.west").charAt(0);

	/** The Constant SOUTH. Represents S*/
	public static final char SOUTH = properties.getProperty("direction.south").charAt(0);

}
