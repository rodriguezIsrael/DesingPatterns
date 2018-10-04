package com.desingPatterns.creational.chain_responsability.servers.imp;

import com.desingPatterns.creational.chain_responsability.servers.AbstractServer;
import com.desingPatterns.creational.chain_responsability.servers.dto.ServerInfoDTO;

/**
 * 
 * @author isivroes
 *
 */
public class Server extends AbstractServer {

	// -------------------------------
	// ---------- variables ----------
	// -------------------------------

	private ServerInfoDTO serverInfo;

	// -------------------------------
	// -------- constructors ---------
	// -------------------------------

	/**
	 * 
	 * @param serverInfo
	 *            - Server infomation for do conection
	 * 
	 * @param availability
	 *            - true -> server with availability, false -> server not
	 *            availability
	 */
	public Server(ServerInfoDTO serverInfo, boolean availability) {
		super();
		this.serverInfo = serverInfo;
		this.availability = availability;
	}

	/**
	 * do conection with the info of server availability
	 */
	@Override
	protected void doConnection() {
		System.out.println("Doing connection....");

		System.out.println("---------------------------");
		System.out.println("-- name: " + this.serverInfo.getName());
		System.out.println("-- port: " + this.serverInfo.getPort());
		System.out.println("-- ip: " + this.serverInfo.getIp());
		System.out.println("---------------------------");
	}

}
