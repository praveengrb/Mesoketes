/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/

package praveen.mesoketes.model;

import java.util.List;

import praveen.mesoketes.base.model.IBuilder;
import praveen.mesoketes.base.model.abstraction.BasicWar;

/**
 * @author Praveen,Sankarasubramanian
 *
 * @since 1.0
 * @version 1.0 Jun 21, 2017
 */
public class War extends BasicWar{

	/**
	 * 
	 */
	public War() {
		super();
	}
	
	/**
	 * @param day
	 */
	public War(String day) {
		super(day);
	}
	
	/**
	 * @param day
	 */
	private War(DayBuilder builder) {
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

	public static class DayBuilder implements IBuilder<War>{
		private String day;
		private List<Attack> attacks;
		public DayBuilder(){
			super();
		}
		
		public DayBuilder(String day){
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
	/*	public DayBuilder addAttack(Attack attack) {
			attacks.add(attack);
			return this;
		}*/
		public DayBuilder setAttacks(List<Attack> attacks) {
			this.attacks=attacks;
			return this;
		}
		/**
		 * @return the day
		 */
		public String getDay() {
			return day;
		}
		/**
		 * @param day the day to set
		 */
		public DayBuilder setDay(String day) {
			this.day = day;
			return this;
		}
		/* (non-Javadoc)
		 * @see praveen.mesoketes.base.model.IBuilder#build()
		 */
		@Override
		public War build() {
			return new War(this);
		}
	}

}
