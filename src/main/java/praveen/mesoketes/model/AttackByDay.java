/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

import java.util.List;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0 Jun 21, 2017
 */
public class AttackByDay {
	private int day;
	private List<Attack> attacks;

	public AttackByDay() {
		super();
	}
	
	public AttackByDay(int day) {
		super();
		setDay(day);
	}


	/**
	 * @return the attacks
	 */
	public final List<Attack> getAttacks() {
		return attacks;
	}

	/**
	 * @return the day
	 */
	public final int getDay() {
		return day;
	}

	/**
	 * @param attacks
	 *            the attacks to set
	 */
	public final void setAttacks(List<Attack> attacks) {
		this.attacks = attacks;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public final void setDay(int day) {
		this.day = day;
	}

}
