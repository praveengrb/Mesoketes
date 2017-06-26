package praveen.mesoketes.model;

public class WarResult<T> {
	
	private int succeededAttacks;
	
	private int failedAttacks;
	
	private CompoundWall compoundWall;
	
	private Attack<T> attack;

	/**
	 * 
	 */
	public WarResult() {
		super();
		setCompoundWall(new CompoundWall());
	}

	/**
	 * @return the succeededAttacks
	 */
	public final int getSucceededAttacks() {
		return succeededAttacks;
	}

	/**
	 * @return the failedAttacks
	 */
	public final int getFailedAttacks() {
		return failedAttacks;
	}

	/**
	 * @return the compoundWall
	 */
	public final CompoundWall getCompoundWall() {
		return compoundWall;
	}

	/**
	 * @param succeededAttacks the succeededAttacks to set
	 */
	public final void setSucceededAttacks(int succeededAttacks) {
		this.succeededAttacks = succeededAttacks;
	}

	/**
	 * @param failedAttacks the failedAttacks to set
	 */
	public final void setFailedAttacks(int failedAttacks) {
		this.failedAttacks = failedAttacks;
	}

	/**
	 * @param compoundWall the compoundWall to set
	 */
	public final void setCompoundWall(CompoundWall compoundWall) {
		this.compoundWall = compoundWall;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WarResult [succeededAttacks=" + succeededAttacks + ", failedAttacks=" + failedAttacks
				+ ", compoundWall=" + compoundWall + "]";
	}

	/**
	 * @return the attack
	 */
	public Attack<T> getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(Attack<T> attack) {
		this.attack = attack;
	}

}
