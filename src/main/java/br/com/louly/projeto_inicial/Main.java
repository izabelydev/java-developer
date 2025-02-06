package br.com.louly.projeto_inicial;

import br.com.ivblour.POO.heranca.Cachorro;
import br.com.ivblour.POO.heranca.enums.TamanhoAnimal;
import br.com.ivblour.POO.heranca.enums.TipoAnimal;
import br.com.louly.projeto_inicial.collections.list.ExemploList;
import br.com.louly.projeto_inicial.collections.list.ExemploVector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Cachorro cachorro = new Cachorro("Bob", TipoAnimal.CACHORRO, TamanhoAnimal.MEDIO);
        System.out.println("\nSucesso");
        ExemploList.listarNomes();
        ExemploVector.listarEsportes();
    }
}
