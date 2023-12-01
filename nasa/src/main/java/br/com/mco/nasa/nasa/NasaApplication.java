package br.com.mco.nasa.nasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class NasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NasaApplication.class, args);
	}

}
