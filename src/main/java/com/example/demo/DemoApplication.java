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

		//DemoApplication
		SpringApplication.run(String.class, args);
	}
}
