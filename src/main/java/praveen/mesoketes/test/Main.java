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
import praveen.mesoketes.model.War;
import praveen.mesoketes.model.CompoundWall;

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
	/*	List<War> attacks = new ArrayList<War>();

		War attackByDay = new War.DayBuilder(1)
				.addAttack(new Attack.AttackBuilder("T1").
						setStrength(4)
						.setDirection(Direction.E)
						.build())
				.addAttack(new Attack.AttackBuilder("T2").
						setStrength(4)
						.setDirection(Direction.S)
						.build()).build();
		attacks.add(attackByDay);
		attackByDay = new War.DayBuilder(2)
				.addAttack(new Attack.AttackBuilder("T1").
						setStrength(4)
						.setDirection(Direction.E)
						.build())
				.addAttack(new Attack.AttackBuilder("T2").
						setStrength(4)
						.setDirection(Direction.S)
						.build()).build();
		attacks.add(attackByDay);*/
		//System.out.println(attacks);
		testAttacks();
	}
	
	public static void testAttacks(){
		String attacks[]=
			{"Day 1; T1 - N - 3: T2 - S - 4: T3 - W - 2",
			 "Day 2; T1 - E - 4: T2 - N - 3: T3 - S - 2",
			 "Day 3; T1 - W - 3: T2 - E - 5: T3 - N - 2"
					};
		List<War> attackz = new ArrayList<>();
		for (String attack : attacks) {
			attackz.add(formAttack(attack));
		}
		System.out.println(attackz);
	}
	
	public static War formAttack(String attack){
		String[] dayAttack=attack.split(";");
		String day = dayAttack[0];
		String[] attacks = dayAttack[1].split(":");
		List<Attack> alist = new ArrayList<Attack>();
		for (String a : attacks) {
			a=a.trim();
			//System.out.println("Attack " + a);
			String [] bz = a.split("-");
			alist.add(new Attack.AttackBuilder(bz[0].trim())
					.setDirection(Direction.getDirection(bz[1].trim())).setStrength(Integer.parseInt(bz[2].trim())).build());
		}
		War war= new War.DayBuilder(day).setAttacks(alist).build();
		return war;
	}

}
