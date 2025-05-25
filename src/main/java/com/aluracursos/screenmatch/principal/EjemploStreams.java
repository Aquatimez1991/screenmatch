package com.aluracursos.screenmatch.principal;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploStreams {

    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda","Luis","Maria Fernanda","Eric","Genesys");

        nombres.stream()
                .sorted()
                .limit(4)
                .filter(nombre -> nombre.startsWith("L"))
                .map(nombre -> nombre.toUpperCase())
                .forEach(System.out::println);
    }
}
