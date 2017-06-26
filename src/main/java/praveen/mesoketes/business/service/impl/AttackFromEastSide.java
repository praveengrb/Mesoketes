package praveen.mesoketes.business.service.impl;

import praveen.mesoketes.business.service.AttackFrom;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.WarResult;
import praveen.mesoketes.model.Tribe;

public class AttackFromEastSide<T> extends AttackFrom<T> {

	@Override
	public WarResult<T> attack(WarResult<T> warResult) {

		Attack<T> attack = warResult.getAttack();
		Tribe tribe = (Tribe) attack.getOpponent();
		// WarResult tempResult=increaseWallHeight(tribe.getStrength(),0);

		if (tribe.getStrength() > warResult.getCompoundWall().getEast().getHeight()) {
			//log().info("Attack succeeded");
			warResult.setSucceededAttacks(warResult.getSucceededAttacks() + 1);
			// log().info("Increase height of wall by "+ (strength-height));
			warResult.getCompoundWall().getEast().setHeight(tribe.getStrength());

		} else {
			warResult.setFailedAttacks(warResult.getFailedAttacks() + 1);

		}

		// warResult.setCompoundWall(compoundWall);
		return warResult;
	}

}
