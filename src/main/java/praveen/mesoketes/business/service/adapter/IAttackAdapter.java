package praveen.mesoketes.business.service.adapter;

import praveen.mesoketes.base.model.IBase;
import praveen.mesoketes.model.War;

public interface IAttackAdapter<T> extends IBase{
	
	War<T> formWar(String attack);
	
}
