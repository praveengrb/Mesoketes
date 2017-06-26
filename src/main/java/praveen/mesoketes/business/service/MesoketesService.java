package praveen.mesoketes.business.service;

import java.util.List;

import praveen.mesoketes.base.model.IBase;
import praveen.mesoketes.business.service.adapter.AttackAdapter;
import praveen.mesoketes.business.service.impl.AttackFromFactory;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.Tribe;
import praveen.mesoketes.model.War;
import praveen.mesoketes.model.WarResult;

public class MesoketesService implements IBase{

	
	public void getSuccesfulAttacks(String warPatterns[]){
		getListOfWar(warPatterns);
		
	}
	
	private void getListOfWar(String warPatterns[]){
		//List<War<Tribe>> attackz = new ArrayList<>();
		AttackAdapter adapter = new AttackAdapter();
		WarResult<Tribe> params = new WarResult<Tribe>();
		for (String warPattern : warPatterns) {
			War<Tribe> war = adapter.formWar(warPattern);
			List<Attack<Tribe>> attacks=war.getAttacks();
			
			for (Attack<Tribe> attack : attacks) {
				AttackFrom<Tribe> factory = new AttackFromFactory<Tribe>(attack.getDirection()).getInstance();
				params.setAttack(attack);
				factory.attack(params);
				//params.setSucceededAttacks(params.getSucceededAttacks()+  temp.getSucceededAttacks());
				
				
			}
			System.out.println("Success after iteration" + params.getSucceededAttacks());
		}
		System.out.println(params.getSucceededAttacks());
	}
}
