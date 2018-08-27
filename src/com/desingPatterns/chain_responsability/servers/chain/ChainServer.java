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

		// server one
		ServerInfoDTO serverInfo01 = new ServerInfoDTO("Server 01", "8081", "9.9.9.1");
		AbstractServer server01 = new Server(serverInfo01, false);

		// server two
		ServerInfoDTO serverInfo02 = new ServerInfoDTO("Server 02", "8082", "9.9.9.2");
		AbstractServer server02 = new Server(serverInfo02, false);

		// server three
		ServerInfoDTO serverInfo03 = new ServerInfoDTO("Server 03", "8083", "9.9.9.3");
		AbstractServer server03 = new Server(serverInfo03, false);

		/**
		 * chain servers creation
		 */
		server01.setNextServer(server02);
		server02.setNextServer(server03);

		return server01;
	}

}
