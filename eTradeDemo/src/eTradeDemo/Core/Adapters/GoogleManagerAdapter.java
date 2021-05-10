package eTradeDemo.Core.Adapters;

import eTradeDemo.Core.Abstract.GoogleService;
import eTradeDemo.GoogleRegisterSystem.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void register() {
		GoogleManager manager=new GoogleManager();
		manager.register();
		
	}

}
