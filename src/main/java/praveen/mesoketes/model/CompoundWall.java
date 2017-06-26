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
	
	private WestSide westSide;
	private NorthSide northSide;
	private EastSide eastSide;
	private SouthSide southSide;

	/**
	 * 
	 */
	public CompoundWall() {
		super();
		setEast(new EastSide());
		setWest(new WestSide());
		setNorth(new NorthSide());
		setSouth(new SouthSide());
		
	}

	/**
	 * @return the westSide
	 */
	public final WestSide getWest() {
		return westSide;
	}

	/**
	 * @return the northSide
	 */
	public final NorthSide getNorth() {
		return northSide;
	}

	/**
	 * @return the eastSide
	 */
	public final EastSide getEast() {
		return eastSide;
	}

	/**
	 * @return the southSide
	 */
	public final SouthSide getSouth() {
		return southSide;
	}

	/**
	 * @param westSide the westSide to set
	 */
	public final void setWest(WestSide westSide) {
		this.westSide = westSide;
	}

	/**
	 * @param northSide the northSide to set
	 */
	public final void setNorth(NorthSide northSide) {
		this.northSide = northSide;
	}

	/**
	 * @param eastSide the eastSide to set
	 */
	public final void setEast(EastSide eastSide) {
		this.eastSide = eastSide;
	}

	/**
	 * @param southSide the southSide to set
	 */
	public final void setSouth(SouthSide southSide) {
		this.southSide = southSide;
	}

	

}
