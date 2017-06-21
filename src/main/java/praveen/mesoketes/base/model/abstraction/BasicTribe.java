package praveen.mesoketes.base.model.abstraction;

import praveen.mesoketes.base.model.IOpponent;

public abstract class BasicTribe implements IOpponent{
	private int strength;
	private String name;
	/**
	 * @return the strength
	 */
	@Override
	public final int getStrength() {
		return strength;
	}
	/**
	 * @return the name
	 */
	@Override
	public final String getName() {
		return name;
	}
	/**
	 * @param strength the strength to set
	 */
	@Override
	public final void setStrength(int strength) {
		this.strength = strength;
	}
	/**
	 * @param name the name to set
	 */
	@Override
	public final void setName(String name) {
		this.name = name;
	}
	

}
