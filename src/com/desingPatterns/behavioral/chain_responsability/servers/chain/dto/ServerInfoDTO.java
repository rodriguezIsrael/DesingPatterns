package com.desingPatterns.behavioral.chain_responsability.servers.chain.dto;

/**
 * This is the server information
 * 
 * @author isivroes
 *
 */
public class ServerInfoDTO {

	// -------------------------------
	// ---------- variables ----------
	// -------------------------------

	/**
	 * server name
	 */
	private String name;

	/**
	 * server port
	 */
	private String port;

	/**
	 * server ip
	 */
	private String ip;

	// -------------------------------
	// -------- constructors ---------
	// -------------------------------

	/**
	 * 
	 * @param name
	 *            - server name
	 * @param port
	 *            - server port
	 * @param ip
	 *            - server ip
	 */
	public ServerInfoDTO(String name, String port, String ip) {
		super();
		this.name = name;
		this.port = port;
		this.ip = ip;
	}

	/**
	 * default constructor
	 */
	public ServerInfoDTO() {
		super();
		this.name = "";
		this.port = "";
		this.ip = "";
	}

	// -------------------------
	// -- setters and getters --
	// -------------------------

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

}
