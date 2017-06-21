/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.base.model.abstraction;

import praveen.mesoketes.base.model.IWallProperties;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 21, 2017
 */
public abstract class BasicWallProperties implements IWallProperties {
	

	/**
	 * 
	 */
	public BasicWallProperties() {
		
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
