package org.atomframework.atomframework.config;

public interface Constants {
	/**
	 * The default file name of the configuration.
	 */
	final String CONFIG_FILE_NAME = "atom.properties";
	
	/**
	 * The key name of JDBC driver property. 
	 */
	final String JDBC_DRIVER_PROPERTY_NAME = "atom.framework.jdbc.driver";
	
	/**
	 * The key name of JDBC URL property.
	 */
	final String JDBC_URL_PROPERTY_NAME = "atom.framework.jdbc.url";
	
	/**
	 * The key name of JDBC username property. 
	 */
	final String JDBC_USERNAME_PROPERTY_NAME = "atom.framework.jdbc.username";
	
	/**
	 * The key name of JDBC password property. 
	 */
	final String JDBC_PASSWORD_PROPERTY_NAME = "atom.framework.jdbc.password";
	
	/**
	 * The key name of the name of base package of the project created by users.
	 */
	final String BASE_PACKAGE_PROPERTY_NAME = "atom.framework.basePackage";
	
	/**
	 * The key name of the base path of the web views. 
	 */
	final String BASE_PATH_OF_WEB_VIEWS = "atom.framework.views.basePath";
	
	/**
	 * The key name of the base path of the web resources.
	 */
	final String BASE_PATH_OF_WEB_RESOURCES = "atom.framework.resources.basePath";
}
