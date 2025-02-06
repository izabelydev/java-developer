package br.com.louly.projeto_inicial.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void listarNomes() {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Amanda");
        nomes.add("Maria");
        nomes.add("Danilo");

        nomes.set(0, "Bruno");
        System.out.println(nomes);

        // Ordena em ordem alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        // Saber o indice de um elemento
        nomes.indexOf("Bruno");

        // Alterar valor do indice
        nomes.set(1, "Bruno");
        System.out.println(nomes);

        // Remover valor do indice
        nomes.remove(2);

        // Retornar valor do indice
        nomes.get(1);

        // Tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Metodo boleano para verificar se o valor existe na lista
        nomes.contains("Amanda");

        // Metodo boleano para saber se a lista esta vazia
        nomes.isEmpty();

        // Navegar elemento por elemento
        for(String nome : nomes) System.out.println("--> " + nome);

        // Iterar cada elemento da lista
        Iterator<String> i = nomes.iterator();
        while (i.hasNext()) System.out.println("--> " + i.next()); // i.next() retorna o elemento iterado no momento de execucao

        // Limpar a lista
        nomes.clear();
    }
}
