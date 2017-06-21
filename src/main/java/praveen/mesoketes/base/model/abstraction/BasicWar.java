/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model.abstraction;

import java.util.List;

import praveen.mesoketes.base.model.IWar;
import praveen.mesoketes.model.Attack;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 21, 2017
 */
public abstract class BasicWar implements IWar {
	private String day;
	private List<Attack> attacks;

	public BasicWar() {
		super();
	}
	
	public BasicWar(String day) {
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
	public String getDay() {
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
	public void setDay(final String day) {
		this.day = day;
	}
}
