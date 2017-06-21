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
public enum Direction {
	N(Constants.NORTH),E(Constants.EAST),W(Constants.WEST),S(Constants.SOUTH);
	
	
	private String direction;
	Direction(String direction){
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
	
	public static Direction getDirection(String direction){
		Direction d = Direction.N;
		if (Constants.SOUTH.equalsIgnoreCase(direction)) {
			d=Direction.S;
		} 
		else if (Constants.EAST.equalsIgnoreCase(direction)) {
			d=Direction.E;
		} 
		else if (Constants.WEST.equalsIgnoreCase(direction)) {
			d=Direction.W;
		} 

		return d;
	}
}
