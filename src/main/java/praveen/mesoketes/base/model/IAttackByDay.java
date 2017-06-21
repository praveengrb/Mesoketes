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
public interface IAttackByDay extends IBase{

	/**
	 * @param day
	 */
	void setDay(int day);

	/**
	 * @return
	 */
	int getDay();

	/**
	 * @param attacks
	 */
	void setAttacks(List<Attack> attacks);

	/**
	 * @return
	 */
	List<Attack> getAttacks();

}
