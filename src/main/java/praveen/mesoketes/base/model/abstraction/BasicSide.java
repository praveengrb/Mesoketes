/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model.abstraction;

import praveen.mesoketes.base.model.ISide;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 21, 2017
 */
public abstract class BasicSide implements ISide {
	

	/**
	 * 
	 */
	public BasicSide() {
		
	}

	/**
	 * @return the height
	 */
	@Override
	public abstract int getHeight();

	/**
	 * @param height the height to set
	 */
	@Override
	public abstract void setHeight(int height);

}
