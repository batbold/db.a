package mn.grapecity.nes.db.a;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import mn.grapecity.nes.DbScriptBox;
import mn.grapecity.nes.Func;

@Singleton
@Startup
@LocalBean
public class HrorgCStartupBean {

	public HrorgCStartupBean() {
	}

	@PostConstruct
	public void prepareDbChanges() {
		String[] files = { 
			};

		DbScriptBox.addFiles("db.a", files, "965");
		Func.printModuleInfo("db.a", this.getClass());
	}

}