/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

import java.util.LinkedList;
import java.util.List;

import praveen.mesoketes.base.model.BasicAttackByDay;
import praveen.mesoketes.base.model.IBuilder;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0 Jun 21, 2017
 */
public class AttackByDay extends BasicAttackByDay{

	/**
	 * 
	 */
	public AttackByDay() {
		super();
	}
	
	/**
	 * @param day
	 */
	public AttackByDay(int day) {
		super(day);
	}
	
	/**
	 * @param day
	 */
	private AttackByDay(DayBuilder builder) {
		super(builder.getDay());
		setAttacks(builder.getAttacks());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Attacked:  Day -" + getDay() + ", Attacks -" + getAttacks();
	}

	public static class DayBuilder implements IBuilder<AttackByDay>{
		private int day;
		private List<Attack> attacks=new LinkedList<Attack>();
		public DayBuilder(){
			super();
		}
		
		public DayBuilder(int day){
			setDay(day);
		}
		/**
		 * @return the attacks
		 */
		public List<Attack> getAttacks() {
			return attacks;
		}
		/**
		 * @param attacks the attacks to set
		 */
		public DayBuilder addAttack(Attack attack) {
			attacks.add(attack);
			return this;
		}
		/**
		 * @return the day
		 */
		public int getDay() {
			return day;
		}
		/**
		 * @param day the day to set
		 */
		public DayBuilder setDay(int day) {
			this.day = day;
			return this;
		}
		/* (non-Javadoc)
		 * @see praveen.mesoketes.base.model.IBuilder#build()
		 */
		@Override
		public AttackByDay build() {
			return new AttackByDay(this);
		}
	}

}
