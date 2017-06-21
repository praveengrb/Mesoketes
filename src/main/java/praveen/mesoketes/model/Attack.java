/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

import praveen.mesoketes.base.model.Direction;
import praveen.mesoketes.base.model.IBuilder;
import praveen.mesoketes.base.model.abstraction.BasicAttack;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0 Jun 20, 2017
 */
public class Attack<T> extends BasicAttack<T> {
	public Attack() {
		super();
	}

	private Attack(AttackBuilder<T> builder) {
		super(builder.getOpponent());
		setDirection(builder.getDirection());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Attack: Opponent - " + getOpponent() + ", Direction - " + getDirection();
	}

	public static class AttackBuilder<BT> implements IBuilder<Attack<BT>> {
		// private int day;
		private BT opponent;
		private Direction direction;

		/**
		 * @param tribe
		 */
		public AttackBuilder(BT opponent) {
			super();
			this.opponent = opponent;
		}

		/**
		 * @param tribe
		 */
		public AttackBuilder() {
			super();
		}

		/**
		 * @return the tribe
		 */
		public final BT getOpponent() {
			return opponent;
		}

		/**
		 * @param tribe
		 *            the tribe to set
		 */
		public final AttackBuilder<BT> setOpponent(BT opponent) {
			this.opponent = opponent;
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
		public final AttackBuilder<BT> setDirection(Direction direction) {
			this.direction = direction;
			return this;
		}

		/**
		 * @return
		 */
		@Override
		public final Attack<BT> build() {
			return new Attack<BT>(this);
		}

	}
}
