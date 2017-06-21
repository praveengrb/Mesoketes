package praveen.mesoketes.business.service.impl;

import praveen.mesoketes.business.service.AttackFrom;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.WarResult;
import praveen.mesoketes.model.Tribe;

public class AttackFromEastSide<T> extends AttackFrom<T>{

	@Override
	public WarResult attack(Attack<T> attack) {
		//TODO 
		WarResult result= new WarResult();
		Tribe tribe=(Tribe)attack.getOpponent();
		result=increaseWallHeight(tribe.getStrength(),0);
		return result;
	}

}
