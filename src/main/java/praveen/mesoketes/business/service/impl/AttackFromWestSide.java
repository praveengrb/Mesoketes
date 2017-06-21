package praveen.mesoketes.business.service.impl;

import praveen.mesoketes.business.service.AttackFrom;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.WarResult;

public class AttackFromWestSide<T> extends AttackFrom<T>{

	@Override
	public WarResult attack(Attack<T> attack) {
		//TODO 
		increaseWallHeight(0,0);
		return null;
	}

}
