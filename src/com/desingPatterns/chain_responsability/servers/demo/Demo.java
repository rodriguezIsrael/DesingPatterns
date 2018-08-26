package com.desingPatterns.chain_responsability.servers.demo;

import com.desingPatterns.chain_responsability.AbstractServer;
import com.desingPatterns.chain_responsability.servers.chain.ChainServer;

/**
 * This is an example application for a chain responsability, This example it's
 * about having different servers and going one by one availability, in case one
 * of them is available, a connection, if not, continue with the search for
 * servers available
 * 
 * (ONLY CODE OF EXAMPLE, THEREFORE DO NOT REALIZE REAL CONNECTIONS TO SERVERS)
 * 
 * 
 * @author isivroes
 *
 */
public class Demo {

	public static void main(String[] args) {
		ChainServer chainServer = new ChainServer();
		AbstractServer abstractServer = chainServer.getAllServers();

		abstractServer.checkAvailability();
	}

}
