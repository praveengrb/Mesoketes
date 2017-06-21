/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model;

import praveen.mesoketes.common.Constants;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 20, 2017
 */
public enum Directions {
	N(Constants.NORTH),E(Constants.EAST),W(Constants.WEST),S(Constants.SOUTH);
	
	
	private String direction;
	Directions(String direction){
		this.setDirection(direction);
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public static Directions getDirection(String direction){
		Directions d = Directions.N;
		if (Constants.SOUTH.equalsIgnoreCase(direction)) {
			d=Directions.S;
		} 
		else if (Constants.EAST.equalsIgnoreCase(direction)) {
			d=Directions.E;
		} 
		else if (Constants.WEST.equalsIgnoreCase(direction)) {
			d=Directions.W;
		} 

		return d;
	}
}
