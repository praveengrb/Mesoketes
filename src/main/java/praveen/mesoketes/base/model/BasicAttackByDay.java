/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model;

import java.util.List;

import praveen.mesoketes.model.Attack;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 21, 2017
 */
public abstract class BasicAttackByDay implements IAttackByDay {
	private int day;
	private List<Attack> attacks;

	public BasicAttackByDay() {
		super();
	}
	
	public BasicAttackByDay(int day) {
		super();
		setDay(day);
	}


	/**
	 * @return the attacks
	 */
	@Override
	public List<Attack> getAttacks() {
		return attacks;
	}

	/**
	 * @return the day
	 */
	@Override
	public int getDay() {
		return day;
	}

	/**
	 * @param attacks
	 *            the attacks to set
	 */
	@Override
	public void setAttacks(final List<Attack> attacks) {
		this.attacks = attacks;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	@Override
	public void setDay(final int day) {
		this.day = day;
	}
}
