package com.desingPatterns.chain_responsability.servers.chain;

import com.desingPatterns.chain_responsability.AbstractServer;
import com.desingPatterns.chain_responsability.servers.dto.ServerInfoDTO;
import com.desingPatterns.chain_responsability.servers.imp.Server;

/**
 * Class for init all servers and do the chain servers
 * 
 * @author isivroes
 *
 */
public class ChainServer {

	public AbstractServer getAllServers() {

		/* INIT: servers creation */
		ServerInfoDTO serverInfo01 = new ServerInfoDTO();
		serverInfo01.setName("Server 01");
		serverInfo01.setPort("8081");
		serverInfo01.setIp("9.9.9.1");

		AbstractServer server01 = new Server(serverInfo01, false);

		ServerInfoDTO serverInfo02 = new ServerInfoDTO();
		serverInfo02.setName("Server 02");
		serverInfo02.setPort("8082");
		serverInfo02.setIp("9.9.9.2");

		AbstractServer server02 = new Server(serverInfo02, false);

		ServerInfoDTO serverInfo03 = new ServerInfoDTO();
		serverInfo03.setName("Server 03");
		serverInfo03.setPort("8083");
		serverInfo03.setIp("9.9.9.3");

		AbstractServer server03 = new Server(serverInfo03, false);

		/* END: servers creation */

		/**
		 * chain servers creation
		 */
		server01.setNextServer(server02);
		server02.setNextServer(server03);

		return server01;
	}

}
