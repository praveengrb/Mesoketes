/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

import praveen.mesoketes.base.model.BasicAttack;
import praveen.mesoketes.base.model.Direction;
import praveen.mesoketes.base.model.IBuilder;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0 Jun 20, 2017
 */
public class Attack extends BasicAttack {
	public Attack() {
		super();
	}

	

	private Attack(AttackBuilder builder) {
		super(builder.getTribe());
		setDirection(builder.getDirection());
		setStrength(builder.getStrength());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Attack: Tribe - " + getTribe() + ", Direction - " + getDirection() + ", Strength - "
				+ getStrength();
	}

	public static class AttackBuilder implements IBuilder<Attack> {
		//private int day;
		private int strength;
		private String tribe;
		private Direction direction;

		/**
		 * @return the day
		 *//*
		public final int getDay() {
			return day;
		}
*/
		/**
		 * @param day
		 *            the day to set
		 */
	/*	public final AttackBuilder setDay(int day) {
			this.day = day;
			return this;
		}*/

		/**
		 * @param tribe
		 */
		public AttackBuilder(String tribe) {
			super();
			this.tribe = tribe;
		}
		/**
		 * @param tribe
		 */
		public AttackBuilder() {
			super();
		}

		/**
		 * @return the strength
		 */
		public final int getStrength() {
			return strength;
		}

		/**
		 * @param strength
		 *            the strength to set
		 */
		public final AttackBuilder setStrength(int strength) {
			this.strength = strength;
			return this;
		}

		/**
		 * @return the tribe
		 */
		public final String getTribe() {
			return tribe;
		}

		/**
		 * @param tribe
		 *            the tribe to set
		 */
		public final AttackBuilder setTribe(String tribe) {
			this.tribe = tribe;
			return this;
		}

		/**
		 * @return the direction
		 */
		public final Direction getDirection() {
			return direction;
		}

		/**
		 * @param direction
		 *            the direction to set
		 */
		public final AttackBuilder setDirection(Direction direction) {
			this.direction = direction;
			return this;
		}

		/**
		 * @return
		 */
		@Override
		public final Attack build() {
			return new Attack(this);
		}

	}
}
