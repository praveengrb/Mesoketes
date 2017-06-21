/*******************************************************
 * Written by Praveen,Sankarasubramanian
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * 
 *******************************************************/

package praveen.mesoketes.test;

import java.util.ArrayList;
import java.util.List;

import praveen.mesoketes.base.model.Direction;
import praveen.mesoketes.model.Attack;
import praveen.mesoketes.model.Tribe;
import praveen.mesoketes.model.War;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0 Jun 21, 2017
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testAttacks();
	}
	
	public static void testAttacks(){
		String attacks[]=
			{"Day 1; T1 - N - 3: T2 - S - 4: T3 - W - 2",
			 "Day 2; T1 - E - 4: T2 - N - 3: T3 - S - 2",
			 "Day 3; T1 - W - 3: T2 - E - 5: T3 - N - 2"
					};
		List<War<Tribe>> attackz = new ArrayList<>();
		for (String attack : attacks) {
			attackz.add(formAttack(attack));
		}
		System.out.println(attackz);
	}
	
	public static War<Tribe> formAttack(String attack){
		String[] dayAttack=attack.split(";");
		String day = dayAttack[0];
		String[] attacks = dayAttack[1].split(":");
		List<Attack<Tribe>> alist = new ArrayList<Attack<Tribe>>();
		for (String a : attacks) {
			a=a.trim();
			//System.out.println("Attack " + a);
			String [] bz = a.split("-");
			Tribe tribe = new Tribe();
			tribe.setName(bz[0].trim());
			tribe.setStrength(Integer.parseInt(bz[2].trim()));
			
			Attack<Tribe> result = new Attack.AttackBuilder<Tribe>(tribe).setDirection(Direction.getDirection(bz[1].trim())).build();
			alist.add(result);
			
		}
		War<Tribe> war= new War.DayBuilder<Tribe>(day).setAttacks(alist).build();
		return war;
	}

}
