package net.frontlinesms.plugins.template;

import net.frontlinesms.FrontlineSMS;
import net.frontlinesms.plugins.BasePluginController;
import net.frontlinesms.plugins.PluginControllerProperties;
import net.frontlinesms.plugins.PluginInitialisationException;
import net.frontlinesms.plugins.template.ui.BasicPluginThinletTabController;
import net.frontlinesms.ui.UiGeneratorController;

import org.springframework.context.ApplicationContext;

@PluginControllerProperties(name="Plugin Template",
		i18nKey="plugins.template", iconPath="/icons/plugins/template/logo_small.png",
		springConfigLocation="classpath:net/frontlinesms/plugins/template/spring.xml",
		hibernateConfigPath="classpath:net/frontlinesms/plugins/template/hibernate.cfg.xml")
public class TemplatePluginController extends BasePluginController {
	private ApplicationContext applicationContext;
	
	protected Object initThinletTab(UiGeneratorController uiController) {
		return new BasicPluginThinletTabController(this, uiController, applicationContext).getTab();
	}

	public void deinit() {
		// Don't forget to undo everything you did in init() here
		this.applicationContext = null;
	}

	public void init(FrontlineSMS frontlineController, ApplicationContext applicationContext) throws PluginInitialisationException {
		this.applicationContext = applicationContext;
		
		// you can cache the frontlineController here too, if you need to
		//this.frontlineController = frontlineController;
	}
}
