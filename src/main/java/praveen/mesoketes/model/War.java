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
public class War<T> extends BasicWar<T>{

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
	private War(DayBuilder<T> builder) {
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

	public static class DayBuilder<T> implements IBuilder<War<T>>{
		private String day;
		private List<Attack<T>> attacks;
		public DayBuilder(){
			super();
		}
		
		public DayBuilder(String day){
			setDay(day);
		}
		/**
		 * @return the attacks
		 */
		public List<Attack<T>> getAttacks() {
			return attacks;
		}
		/**
		 * @param attacks the attacks to set
		 */
		public DayBuilder<T> setAttacks(List<Attack<T>> attacks) {
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
		public DayBuilder<T> setDay(String day) {
			this.day = day;
			return this;
		}
		/* (non-Javadoc)
		 * @see praveen.mesoketes.base.model.IBuilder#build()
		 */
		@Override
		public War<T> build() {
			return new War<>(this);
		}
	}

}
