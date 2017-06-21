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
import praveen.mesoketes.model.AttackByDay;
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
		List<AttackByDay> attacks = new ArrayList<AttackByDay>();

		AttackByDay attackByDay = new AttackByDay.DayBuilder(1)
				.addAttack(new Attack.AttackBuilder("T1").
						setStrength(4)
						.setDirection(Direction.E)
						.build())
				.addAttack(new Attack.AttackBuilder("T2").
						setStrength(4)
						.setDirection(Direction.S)
						.build()).build();
		attacks.add(attackByDay);
		attackByDay = new AttackByDay.DayBuilder(2)
				.addAttack(new Attack.AttackBuilder("T1").
						setStrength(4)
						.setDirection(Direction.E)
						.build())
				.addAttack(new Attack.AttackBuilder("T2").
						setStrength(4)
						.setDirection(Direction.S)
						.build()).build();
		attacks.add(attackByDay);
		System.out.println(attacks);

	}

}
