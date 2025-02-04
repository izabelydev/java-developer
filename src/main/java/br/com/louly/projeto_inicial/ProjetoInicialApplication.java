package br.com.louly.projeto_inicial;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProjetoInicialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoInicialApplication.class, args);
		log.info("POC Funcionando");
	}

}
