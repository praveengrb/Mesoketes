package praveen.mesoketes.base.model;

public interface IOpponent extends IBase{

	/**
	 * @return
	 */
	int getStrength();

	/**
	 * @return
	 */
	String getName();

	/**
	 * @param strength
	 */
	void setStrength(int strength);

	/**
	 * @param name
	 */
	void setName(String name);

}
