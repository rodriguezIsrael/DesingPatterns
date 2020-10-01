package com.desingPatterns.behavioral.chain_responsability.servers.chain.imp;

import com.desingPatterns.behavioral.chain_responsability.servers.chain.AbstractServer;
import com.desingPatterns.behavioral.chain_responsability.servers.chain.dto.ServerInfoDTO;

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
