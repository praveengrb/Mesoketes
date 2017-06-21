/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

import praveen.mesoketes.base.model.abstraction.BasicWallProperties;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 21, 2017
 */
public class WallProperties extends BasicWallProperties{
	private int height;

	/**
	 * @return the height
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	@Override
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
