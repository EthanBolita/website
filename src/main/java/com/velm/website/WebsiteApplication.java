/**
 * This is the WebsiteApplication class, which starts up the website
 * @ authors: Ethan
 * @ date of oldest edition: April 17 
 * @ version: 2 
 */
package com.velm.website;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * boots up the website
 */
public class WebsiteApplication {

	
	/** 
	 * @param args
	 * main method
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

}
