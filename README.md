FrontlineSMS Plugin Template
============================

Use this project as a starting point for developing new FrontlineSMS plugins.  The project you create with this should be added as a dependency to the [FrontlineSMS Distribution Builder](http://github.com/frontlinesms/frontlinesms-dist).

Adding to frontline-dist POM
----------------------------
To add your new plugin to the FrontlineSMS Distribution project's POM, you should add the following lines:
    
    ...
    <dependencies>
    	...
    	<dependency>
		<groupId>net.frontlinesms.plugins</groupId>
		<artifactId>frontlinesms-plugin-template</artifactId>
		<version>${pluginVersion}</version>
	</dependency>
	...
    </dependencies>
    ...
**Where *${pluginVersion}* is the version you have set for your plugin, or the version of core FrontlineSMS you are using if you have not explicitly set a plugin version.**

TODO
----
* Update Spring and Hibernate XMLs so that there is no startup error when running FrontlineSMS
