package com.desingPatterns.creational.builder_pattern.builder;

/**
 * 
 * @author isivroes
 *
 */
public class LaptopBuilder {

	// -------------------------------
	// ---------- variables ----------
	// -------------------------------

	/**
	 * memory ram
	 */
	private String ram;

	/**
	 * size of disk
	 */
	private String disk;

	/**
	 * Operative System
	 */
	private String so;

	// -------------------------------
	// -------- constructors ---------
	// -------------------------------
	public LaptopBuilder() {
		System.out.println("Built new Laptop");
	}

	// -------------------------
	// -- setters and getters --
	// -------------------------

	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * @param ram
	 *            the ram to set
	 */
	public LaptopBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	/**
	 * @return the disk
	 */
	public String getDisk() {
		return disk;
	}

	/**
	 * @param disk
	 *            the disk to set
	 */
	public LaptopBuilder setDisk(String disk) {
		this.disk = disk;
		return this;
	}

	/**
	 * @return the so
	 */
	public String getSo() {
		return so;
	}

	/**
	 * @param so
	 *            the so to set
	 */
	public LaptopBuilder setSo(String so) {
		this.so = so;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LaptopBuilder [");
		if (ram != null)
			builder.append("ram=").append(ram).append(", ");
		if (disk != null)
			builder.append("disk=").append(disk).append(", ");
		if (so != null)
			builder.append("so=").append(so).append(", ");

		builder.append("]");
		return builder.toString();
	}

}
