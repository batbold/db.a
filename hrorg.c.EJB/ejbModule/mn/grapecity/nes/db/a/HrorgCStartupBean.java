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
				"20161026142250_hrorg.c_tables.sql",
				"20161026142251_hrorg.c_columns.sql",
				"20161027210412_hrorg.c_1fk.sql",
				"20161027210412_hrorg.c_2idx.sql",
				"20161027210412_hrorg.c_3views.sql",
				"20161028142255_hrorg.c_screens.sql", 
				"20161028142337_hrorg.c_operation.sql",
				"20161028142417_hrorg.c_msg.sql", 
				"20161028142456_hrorg.c_general.sql",
				"20161028142557_hrorg.c_const.sql", 
				"20161028142628_hrorg.c_bulg.sql",
				"20161028142656_hrorg.c_autonum.sql", 
				"20170130122317_hrorg.c_admOper.sql",
				"20170130122355_hrorg.c_admPriv.sql",
				"20170130122432_hrorg.c_admOperPriv.sql",
				"20161028142529_hrorg.c_dictionary.sql",
				"20170221112950_dic024.sql",
				"20170221114950_alterHrOrgorgdetail.sql",
				"20170221120250_alterHrOrgorgViews.sql",
				"20170306152250_alterHrRegion.sql",
				"20170313142608_hrorg.c_Position_COL_ADD.sql",
				"20170316213008_hrorg.c_14160201_OPERATION.sql",
				"20170503215008_hrorg.c_add_config.sql",
				"20170517142610_hrorg.c_vwChartList.sql",
				"20170526094708_hrorg.c_add_head_emp.sql",
				"20170606113705_hrorg.c_hrorg_fix",
				"20170607172005_hrorg.c_head_emp_org.sql",
				"20171117163111_hrorg.c_oper.sql",
				"20171127170611_hrorg.c_columns.sql",
				"SRC_VW_HRORG_CHART_POSITION$20171204155155.sql",
				"SRC_VW_HRORG_POSITION$20171204155155.sql",
				"20171225101611_hrorg.msg_41416026.sql",
				"20180205203523_hrorg.c_add_column.sql",
				"SRC_VW_HRORG_ASSIGNMENT$20180205203735.sql"
			};

		DbScriptBox.addFiles("hrorg.c", files);
		Func.printModuleInfo("hrorg.c", this.getClass());
	}

}