/*******************************************************
 * Written by Praveen,Sankarasubramanian
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * 
 *******************************************************/

package praveen.mesoketes.test;

import praveen.mesoketes.business.service.MesoketesService;

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

	public static void testAttacks() {

		String attacks[] = { 
				"Day 1; T1 - N - 3: T2 - S - 4: T3 - W - 2", 
				"Day 2; T1 - E - 4: T2 - N - 3: T3 - S - 2",
				"Day 3; T1 - W - 3: T2 - E - 5: T3 - N - 2" };
		MesoketesService service = new MesoketesService();
		service.getSuccesfulAttacks(attacks);

		String attacks2[] = { 
				"Day 1; T1-S-4:T1-N-2:T3-W-3", 
				"Day 2; T2-S-5:T2-N-1:T3-N-3",
				"Day 3; T1-W-2:T1-W-4:T2-N-3:T2-S-4" }; //
		
		/*
		 *  N E W S  SUCCESS
		 *  0 0 0 0
		 *  2 0 3 4   3
		 *  3 0 3 5   3+2 = 5
		 *  4 0 4 5   5+2 =  7
		 */

		service.getSuccesfulAttacks(attacks2);
		// System.out.println(attackz);
	}

}
