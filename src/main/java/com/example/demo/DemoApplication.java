package com.example.demo;

import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//JetInstance instance1 = Jet.newJetInstance();
		System.exit(5);
		System.runFinalizersOnExit(true);

		//Second
		System.getProperties();

		// working with "dev" branch
		System.out.println("dev. Hi! 12345  It's Silk and Mak");

		//DemoApplication
		SpringApplication.run(String.class, args);


		/*

	!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 */
	}
}
