package com.list;


public class App {
    public static void main(String[] args) {
        
        GestorDiasSemana gestor = new GestorDiasSemana();


        gestor.crearListaDias();


        System.out.println("Días de la semana: " + gestor.obtenerDiasSemana());


        System.out.println("Número de días: " + gestor.obtenerLargoLista());


        gestor.eliminarDia("Lunes");
        System.out.println("Después de eliminar 'Lunes': " + gestor.obtenerDiasSemana());


        System.out.println("Día en la posición 2: " + gestor.obtenerDiaPorIndice(2));


        System.out.println("¿Existe 'Sábado'? " + gestor.existeDia("Sábado"));


        gestor.ordenarDiasAlfabeticamente();
        System.out.println("Días ordenados alfabéticamente: " + gestor.obtenerDiasSemana());


        gestor.vaciarLista();
        System.out.println("Después de vaciar la lista: " + gestor.obtenerDiasSemana());
    }
}