package com.sofka.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StreamApi
{
    List<Integer> numeros = new ArrayList<>();
    List<String> lista = new ArrayList<>();

    public  StreamApi(){
        lista.add("Pedro diego");
        lista.add("Pablo josé");
        lista.add("Juan diego");

        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
    }

    public void filtrar(){
        System.out.println("lista filtrada");
        lista.stream().filter(x -> x.contains("diego")).forEach(System.out::println);
    }

    public void ordenar()
    {
        System.out.println("Lista ordenada");
        //Descendente
        numeros.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
        //Ascendente
        numeros.stream().sorted((x,y) -> x.compareTo(y)).forEach(System.out::println);
    }

    public void transformar()
    {
        System.out.println("Lista a mayusculas");
        lista.stream().map(x->x.toUpperCase()).forEach(System.out::println);
    }

    public void limitar()
    {
        System.out.println("Lista limitada");
        numeros.stream().limit(3).forEach(System.out::println);

        System.out.println("Lista ordenada y limitada");
        numeros.stream().sorted((x,y)->x.compareTo(y)).limit(3).forEach(System.out::println);
    }

    public void contar()
    {
        System.out.println("cantidad de elementos en lista de numeros");
        long contador = numeros.stream().count();
        System.out.println(contador);
    }

    public static void main(String[] args) {
        StreamApi streamApi = new StreamApi();
        streamApi.filtrar();
        streamApi.ordenar();
        streamApi.transformar();
        streamApi.limitar();
        streamApi.contar();
    }
}
