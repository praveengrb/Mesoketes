/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0
 * Jun 21, 2017
 */
public class CompoundWall{
	
	private West west;
	private North north;
	private East east;
	private South south;

	/**
	 * 
	 */
	public CompoundWall() {
		
	}

	/**
	 * @return the west
	 */
	public final West getWest() {
		return west;
	}

	/**
	 * @return the north
	 */
	public final North getNorth() {
		return north;
	}

	/**
	 * @return the east
	 */
	public final East getEast() {
		return east;
	}

	/**
	 * @return the south
	 */
	public final South getSouth() {
		return south;
	}

	/**
	 * @param west the west to set
	 */
	public final void setWest(West west) {
		this.west = west;
	}

	/**
	 * @param north the north to set
	 */
	public final void setNorth(North north) {
		this.north = north;
	}

	/**
	 * @param east the east to set
	 */
	public final void setEast(East east) {
		this.east = east;
	}

	/**
	 * @param south the south to set
	 */
	public final void setSouth(South south) {
		this.south = south;
	}

	

}
