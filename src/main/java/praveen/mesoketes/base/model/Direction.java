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
	
	
	private char direction;
	Direction(char direction){
		this.setDirection(direction);
	}
	/**
	 * @return the direction
	 */
	public char getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(char direction) {
		this.direction = direction;
	}
}
