package javasamples;

import javasamples.network.NetworkTest;

/**
 * Test console
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/01/2021
 */
public class Start {
	/**
	 * Start application
	 * @param args
	 */
	public static void main(String[] args) {
		NetworkTest nt = new NetworkTest();
		System.out.println(nt.ping("oracle.com"));
	}

}
