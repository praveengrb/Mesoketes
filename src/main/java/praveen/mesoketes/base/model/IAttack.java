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
public interface IAttack<T> extends IBase {



	/**
	 * @param directions
	 */
	void setDirection(Directions directions);

	

	/**
	 * @return
	 */
	Directions getDirection();

	/**
	 * @param opponent
	 */
	void setOpponent(T opponent);
	
	/**
	 * @return
	 */
	T getOpponent();

}
