/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model.abstraction;

import praveen.mesoketes.base.model.Directions;
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
	
	private Directions directions;
	
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
	 * @return the directions
	 */
	public final Directions getDirection() {
		return directions;
	}

	/**
	 * @return the opponent
	 */
	public final T getOpponent() {
		return opponent;
	}

	/**
	 * @param directions the directions to set
	 */
	public final void setDirection(Directions directions) {
		this.directions = directions;
	}

	/**
	 * @param opponent the opponent to set
	 */
	public final void setOpponent(T opponent) {
		this.opponent = opponent;
	}



}
