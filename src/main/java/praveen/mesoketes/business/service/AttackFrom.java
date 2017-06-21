package praveen.mesoketes.business.service;

import praveen.mesoketes.base.model.IBase;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.WarResult;

public abstract class AttackFrom<T> implements IBase {

	public AttackFrom() {
		super();
	}
	
	public abstract WarResult attack(Attack<T> attack);
	
	protected WarResult increaseWallHeight(int strength, int height){
		WarResult warResult= new WarResult();
		if(strength>height){
			log().info("Attack succeeded");
			warResult
			.setSucceededAttacks(warResult
					.getSucceededAttacks()+1);
			log().info("Increase height of wall by "+ (strength-height));
			
		} else{
			warResult
			.setFailedAttacks(warResult
					.getFailedAttacks()+1);
			
		}
		return warResult;
	}

}
