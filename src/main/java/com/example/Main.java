
package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // Ejercicio 1
    static void ejercicio1() {
        System.out.println("== Ejercicio 1 ==");
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");
        frutas.add(2, "Uva"); // insertar en posición 2
        System.out.println("Primera fruta: " + frutas.get(0));
        frutas.set(3, "Kiwi"); // modificar posición 3
        System.out.println("Tamaño: " + frutas.size());
        System.out.println("Lista: " + frutas);
        System.out.println();
    }

    // Ejercicio 2
    static void ejercicio2() {
        System.out.println("== Ejercicio 2 ==");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20));
        nums.remove(2); // elimina posición 2 (30)
        nums.remove(Integer.valueOf(20)); // elimina primera aparición de 20
        System.out.println("Contiene 40? " + nums.contains(40));
        System.out.println("Tamaño final: " + nums.size());
        System.out.println("Lista resultante: " + nums);
        System.out.println();
    }

    // Ejercicio 3
    static void ejercicio3() {
        System.out.println("== Ejercicio 3 ==");
        List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena"));
        int contador = 0;
        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println("Posición " + i + ": " + nombre);
            if (nombre.length() > 4) contador++;
        }
        System.out.println("Nombres con más de 4 caracteres: " + contador);
        System.out.println();
    }

    // Ejercicio 4
    static void ejercicio4() {
        System.out.println("== Ejercicio 4 ==");
        List<Double> valores = new ArrayList<>(Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4));
        double suma = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for (double v : valores) {
            suma += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }
        double promedio = valores.isEmpty() ? 0 : suma / valores.size();
        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
        System.out.println();
    }

    // Ejercicio 5
    static void ejercicio5() {
        System.out.println("== Ejercicio 5 ==");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++) nums.add(i);
        System.out.println("Antes: " + nums);
        Iterator<Integer> it = nums.iterator();
        int eliminados = 0;
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }
        System.out.println("Después: " + nums);
        System.out.println("Eliminados: " + eliminados);
        System.out.println();
    }

    // Ejercicio 6
    static void ejercicio6() {
        System.out.println("== Ejercicio 6 ==");
        List<String> lenguajes = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Python", "Go"));
        System.out.println("Índice primera 'Python': " + lenguajes.indexOf("Python"));
        System.out.println("Índice última 'Python': " + lenguajes.lastIndexOf("Python"));
        System.out.println("Contiene 'Ruby'? " + lenguajes.contains("Ruby"));
        List<String> sublista = new ArrayList<>(lenguajes.subList(1, 4)); // 1..3
        System.out.println("Sublista (1..4): " + sublista);
        System.out.println();
    }

    // Ejercicio 7
    static void ejercicio7() {
        System.out.println("== Ejercicio 7 ==");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56));
        Collections.sort(nums); // ascendente
        System.out.println("Ascendente: " + nums);
        nums.sort(Collections.reverseOrder()); // descendente
        System.out.println("Descendente: " + nums);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Raúl", "Beatriz", "Sofía", "Eduardo"));
        Collections.sort(nombres); // alfabéticamente
        System.out.println("Nombres alfabéticamente: " + nombres);
        nombres.sort(Comparator.comparingInt(String::length)); // por longitud
        System.out.println("Nombres por longitud (corto->largo): " + nombres);
        System.out.println();
    }

    // Ejercicio 8
    static void ejercicio8() {
        System.out.println("== Ejercicio 8 ==");
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren"));
        palabras.removeIf(p -> p.length() < 5);
        System.out.println("Palabras >=5 caracteres: " + palabras);

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 20; i++) nums.add(i);
        nums.removeIf(n -> n % 3 == 0);
        System.out.println("Números no divisibles por 3: " + nums);
        System.out.println();
    }

    // Ejercicio 9
    static void ejercicio9() {
        System.out.println("== Ejercicio 9 ==");
        List<String> dias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes"));
        Object[] objArr = dias.toArray();
        String[] strArr = dias.toArray(new String[0]);
        System.out.println("Longitud Object[]: " + objArr.length);
        System.out.println("Longitud String[]: " + strArr.length);
        System.out.println("Contenido Object[]:");
        for (Object o : objArr) System.out.println(" - " + o);
        System.out.println("Contenido String[]:");
        for (String s : strArr) System.out.println(" - " + s);

        List<String> fromArray = new ArrayList<>(Arrays.asList(strArr));
        System.out.println("ArrayList desde arreglo: " + fromArray);
        System.out.println();
    }

    // Ejercicio 10
    static void ejercicio10() {
        System.out.println("== Ejercicio 10 ==");
        ArrayList<String> estudiantes = new ArrayList<>();
        ArrayList<Double> calificaciones = new ArrayList<>();

        // métodos auxiliares como lambdas locales
        java.util.function.BiConsumer<String, Double> agregarEstudiante = (nombre, cal) -> {
            estudiantes.add(nombre);
            calificaciones.add(cal);
        };
        java.util.function.IntConsumer eliminarEstudiante = (indice) -> {
            if (indice >= 0 && indice < estudiantes.size()) {
                estudiantes.remove(indice);
                calificaciones.remove(indice);
            }
        };
        java.util.function.Function<String, Integer> buscarEstudiante = (nombre) -> estudiantes.indexOf(nombre);
        java.util.function.Supplier<Double> calcularPromedio = () -> {
            if (calificaciones.isEmpty()) return 0.0;
            double s = 0;
            for (double c : calificaciones) s += c;
            return s / calificaciones.size();
        };
        Runnable listarEstudiantes = () -> {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println(i + ": " + estudiantes.get(i) + " -> " + calificaciones.get(i));
            }
        };
        Runnable estudiantesAprobados = () -> {
            for (int i = 0; i < estudiantes.size(); i++) {
                if (calificaciones.get(i) >= 3.0) {
                    System.out.println(estudiantes.get(i) + " -> " + calificaciones.get(i));
                }
            }
        };

        // Datos de prueba
        agregarEstudiante.accept("Ana", 4.5);
        agregarEstudiante.accept("Luis", 2.8);
        agregarEstudiante.accept("María", 3.7);
        agregarEstudiante.accept("Carlos", 4.2);
        agregarEstudiante.accept("Elena", 2.5);

        System.out.println("Listado completo:");
        listarEstudiantes.run();

        System.out.println("Promedio general: " + calcularPromedio.get());

        System.out.println("Estudiantes aprobados:");
        estudiantesAprobados.run();

        System.out.println("Eliminando estudiante en posición 1...");
        eliminarEstudiante.accept(1);

        System.out.println("Posición de María: " + buscarEstudiante.apply("María"));

        System.out.println("Listado final:");
        listarEstudiantes.run();
        System.out.println();
    }

    
}