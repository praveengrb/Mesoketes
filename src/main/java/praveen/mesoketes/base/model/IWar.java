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
public interface IWar<T> extends IBase{

	/**
	 * @param day
	 */
	void setDay(String day);

	/**
	 * @return
	 */
	String getDay();

	/**
	 * @param attacks
	 */
	void setAttacks(List<Attack<T>> attacks);

	/**
	 * @return
	 */
	List<Attack<T>> getAttacks();

}
