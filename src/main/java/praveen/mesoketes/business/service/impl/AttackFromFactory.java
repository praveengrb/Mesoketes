package praveen.mesoketes.business.service.impl;

import praveen.mesoketes.base.model.Directions;
import praveen.mesoketes.business.service.AttackFrom;
import praveen.mesoketes.common.Constants;

public class AttackFromFactory<T> {
	
	
	
	private Directions side;
	/**
	 * @return the side
	 */
	private final Directions getSide() {
		return side;
	}



	/**
	 * @param side the side to set
	 */
	private final void setSide(Directions side) {
		this.side = side;
	}



	public AttackFromFactory(Directions side){
		this.setSide(side);
	}
	
	
	
	public AttackFrom<T> getInstance(){
		AttackFrom<T> attackedFrom = null;
		switch (getSide()) {
		case N:
			attackedFrom = new AttackFromNorthSide<>();
			break;
		case E:
			attackedFrom = new AttackFromEastSide<>();
			break;
		case S:
			attackedFrom = new AttackFromSouthSide<>();
			break;
		case W:
			attackedFrom = new AttackFromWestSide<>();
			break;	

		}
		return attackedFrom;
		
	}

}
