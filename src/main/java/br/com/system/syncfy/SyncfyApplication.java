package br.com.system.syncfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SyncfyApplication {

	public static void main(String[] args) {
		


		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("Encerrando aplicativo Syncfy...");
			// Qualquer código de limpeza pode ser colocado aqui, como fechar conexões com o banco de dados
		}));

		SpringApplication.run(SyncfyApplication.class, args);
	}
}
