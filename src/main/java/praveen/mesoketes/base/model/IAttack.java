/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 20, 2017
 */
public interface IAttack extends IBase {

	/**
	 * @param day
	 */
	//void setDay(int day);

	/**
	 * @param tribe
	 */
	void setTribe(String tribe);

	/**
	 * @return
	 */
	int getStrength();

	/**
	 * @param direction
	 */
	void setDirection(Direction direction);

	/**
	 * @param strength
	 */
	void setStrength(int strength);

	/**
	 * @return
	 */
	Direction getDirection();

	/**
	 * @return
	 */
	String getTribe();

	/**
	 * @return
	 */
	//int getDay();

}
