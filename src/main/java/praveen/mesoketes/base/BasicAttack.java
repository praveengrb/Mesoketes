/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 20, 2017
 */
public class BasicAttack implements IAttack{
	private int day;
	private int strength;
	private String tribe;
	private Direction direction;

	/**
	 * @param day 
	 * 
	 */
	public BasicAttack(int day) {
		super();
		setDay(day);
	}
	
	/**
	 * @param day 
	 * 
	 */
	public BasicAttack(final int day,final String tribe) {
		super();
		this.setDay(day);
		this.setTribe(tribe);
	}

	/**
	 * 
	 */
	public BasicAttack() {
		
	}

	/**
	 * @return the day
	 */
	@Override
	public int getDay() {
		return day;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	@Override
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the strength
	 */
	@Override
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength
	 *            the strength to set
	 */
	@Override
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the tribe
	 */
	@Override
	public String getTribe() {
		return tribe;
	}

	/**
	 * @param tribe
	 *            the tribe to set
	 */
	@Override
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	/**
	 * @return the direction
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
