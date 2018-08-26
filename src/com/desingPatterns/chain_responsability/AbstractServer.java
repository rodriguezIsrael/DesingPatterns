package com.desingPatterns.chain_responsability;

/**
 * 
 * This abstract class has the task of iterate the next server for apply the
 * chain responsability.
 * 
 * @author isivroes
 *
 */
public abstract class AbstractServer {

	/**
	 * Availability of the assigned server.
	 */
	protected boolean availability;

	/**
	 * Next server in which availability will be tested
	 */
	private AbstractServer nextServer;

	/**
	 * doing server conection
	 */
	abstract protected void doConnection();

	/**
	 * verify the server availability
	 */
	public void checkAvailability() {
		System.out.println("Analyzing server availability...");

		if (nextServer == null) {
			System.out.println("All the servers are busy, try it later.");
		} else {
			if (availability) {
				System.out.println("Server available, making connection...");
				doConnection();
			} else {
				System.out.println("Looking for another server...");
				nextServer.checkAvailability();
			}
		}

	}

	/**
	 * 
	 * @param nextServer
	 */
	public void setNextServer(AbstractServer nextServer) {
		this.nextServer = nextServer;
	}

}
