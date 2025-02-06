package br.com.louly.projeto_inicial.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploVector {
    public static void listarEsportes() {
        List<String> esportes = new ArrayList<>();

        // Adiciona 4 esportes
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("Handebol");

        // Altera o valor da posicao 2
        esportes.set(2, "Ping Pong");

        // Remove valor da posicao 2
        esportes.remove(2);

        // Remove Handebol do vetor
        esportes.remove("Handebol");

        // Retorna o primeiro item do vetor
        esportes.get(0);

        // Navega em cada elemento do vetor
        for(String esporte : esportes) System.out.println("--> " + esporte);
    }
}
