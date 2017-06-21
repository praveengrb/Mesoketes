/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model.abstraction;

import praveen.mesoketes.base.model.Direction;
import praveen.mesoketes.base.model.IAttack;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 20, 2017
 */
public abstract class BasicAttack<T> implements IAttack<T>{
	//private int day;
	
	private Direction direction;
	
	private T opponent;

	/**
	 * @param day 
	 * 
	 */
	
	
	/**
	 * 
	 */
	public BasicAttack() {
		super();
	}
	
	/**
	 * 
	 */
	public BasicAttack(T opponent) {
		setOpponent(opponent);
	}

	/**
	 * @return the direction
	 */
	public final Direction getDirection() {
		return direction;
	}

	/**
	 * @return the opponent
	 */
	public final T getOpponent() {
		return opponent;
	}

	/**
	 * @param direction the direction to set
	 */
	public final void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * @param opponent the opponent to set
	 */
	public final void setOpponent(T opponent) {
		this.opponent = opponent;
	}



}
