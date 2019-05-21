package br.com.creativie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.creativie.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class CreativieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreativieApplication.class, args);
	}

}
