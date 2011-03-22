package net.frontlinesms.plugins.template.ui;

import net.frontlinesms.plugins.BasePluginThinletTabController;
import net.frontlinesms.plugins.template.TemplatePluginController;
import net.frontlinesms.ui.ThinletUiEventHandler;
import net.frontlinesms.ui.UiGeneratorController;

import org.springframework.context.ApplicationContext;

public class BasicPluginThinletTabController extends BasePluginThinletTabController<TemplatePluginController> implements ThinletUiEventHandler{
	private static final String TAB_XML_FILE = "/ui/plugins/basicplugin/basicPluginTab.xml";
	
	public BasicPluginThinletTabController(TemplatePluginController pluginController, UiGeneratorController uiController, ApplicationContext appCon) {
		super(pluginController, uiController);
		super.setTabComponent(uiController.loadComponentFromFile(TAB_XML_FILE, this));
	}
	
	public Object getTab(){
		return super.getTabComponent();
	}
}
