/*******************************************************
* Copyright (C) Pipecandy Technologies Private Limited - All Rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* Written by Praveen,Sankarasubramanian <praveen@pipecandy.com>
*******************************************************/
package praveen.mesoketes.business.service.adapter;

import java.util.ArrayList;
import java.util.List;

import praveen.mesoketes.base.model.Directions;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.Tribe;
import praveen.mesoketes.model.War;

/**
 * @author Praveen,Sankarasubramanian
 *
 */
public class AttackAdapter implements IAttackAdapter<Tribe> {

	@Override
	public War<Tribe> formWar(String warPattern) {
		String[] dayAttack=warPattern.split(";");
		String day = dayAttack[0];
		String[] attacks = dayAttack[1].split(":");
		List<Attack<Tribe>> alist = new ArrayList<Attack<Tribe>>();
		for (String a : attacks) {
			a=a.trim();
			String [] bz = a.split("-");
			Tribe tribe = new Tribe();
			tribe.setName(bz[0].trim());
			tribe.setStrength(Integer.parseInt(bz[2].trim()));
			
			Attack<Tribe> result = new Attack.AttackBuilder<Tribe>(tribe).setDirection(Directions.getDirection(bz[1].trim())).build();
			alist.add(result);
			
		}
		War<Tribe> war= new War.DayBuilder<Tribe>(day).setAttacks(alist).build();
		return war;
	}
}
