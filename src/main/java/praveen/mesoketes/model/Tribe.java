package praveen.mesoketes.model;

import praveen.mesoketes.base.model.abstraction.BasicTribe;

public class Tribe extends BasicTribe{

	public Tribe() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tribe: Name - " + getName() + ", Strength -" + getStrength();
	}
	

}
