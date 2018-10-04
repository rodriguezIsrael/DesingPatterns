package com.desingPatterns.creational.singleton;

/**
 * 
 * @author isivroes
 *
 */
public class Configuration {

	/**
	 * url connection
	 */
	private String url;
	/**
	 * data base
	 */
	private String dataBase;

	private static Configuration configuration;

	public static Configuration getConfiguration(String url, String baseDatos) {
		if (configuration == null) {

			configuration = new Configuration(url, baseDatos);
		}
		return configuration;
	}

	private Configuration(String url, String dataBase) {

		this.url = url;
		this.dataBase = dataBase;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the dataBase
	 */
	public String getDataBase() {
		return dataBase;
	}

	/**
	 * @param dataBase
	 *            the dataBase to set
	 */
	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Configuration [" + (url != null ? "url=" + url + ", " : "")
				+ (dataBase != null ? "dataBase=" + dataBase : "") + "]";
	}

}
