package javasamples.network;

import java.io.IOException;
import java.util.Scanner;

/**
 * Execute network test
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/01/2021
 */
public class NetworkTest {
	/**
	 * 
	 */
	public String ping(String host) {
		String response = "";
        String comando="ping -n 1 -w 600 "+ host;
        try {
            Scanner scan = new Scanner( Runtime.getRuntime().exec("cmd /c " + comando).getInputStream());  
            while(scan.hasNextLine()) {  
            	response += scan.nextLine()+"\n";  
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            response = ex.getMessage();
        }
        return response;
	}
}
