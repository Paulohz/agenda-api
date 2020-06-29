package io.github.paulohz.agendaapi;

import io.github.paulohz.agendaapi.model.entity.Contato;
import io.github.paulohz.agendaapi.model.repository.ContatoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {

	/*@Bean
	public CommandLineRunner commandLineRunner(
			@Autowired ContatoRepositoy repositoy){
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Paulo");
			contato.setEmail("Paulo@gmail.com");
			contato.setFavorito(false);
			repositoy.save(contato);
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
