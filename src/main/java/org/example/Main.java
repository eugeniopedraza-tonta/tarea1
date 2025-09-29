package org.example;
import java.util.*;
// Eugenio Pedraza A00835064

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();

        System.out.println("--- Stack ---");
        // Meter elementos al final de la lista (tope del stack)
        System.out.println("Agregar enteros");
        for (int i = 1; i <= 4; i++) {
            s.push(i);
            System.out.println(s);
        }

        // Eliminamos uno por uno el último elemento de la lista (LIFO)
        System.out.println("Eliminar enteros");
        while (!s.empty()) {
            s.pop();
            System.out.println(s);
        }

        System.out.println("--- Queue ---");
        System.out.println("Agregar enteros");
        // Agregamos elementos al final de la cola (FIFO)
        for (int i = 1; i <= 4; i++) {
            q.offer(i);
            System.out.println(q);
        }

        // Eliminamos el primer elemento de la cola
        System.out.println("Eliminar enteros");
        while (!q.isEmpty()) {
            q.poll();
            System.out.println(q);
        }

        System.out.println("--- LinkedHashMap ---");
        System.out.println("Agregar enteros");
        // Agregamos pares llave->valor manteniendo orden de inserción
        for (int i = 1; i <= 4; i++) {
            m.put(i, i + i);
            System.out.println(m);
        }

        // Acceso por llave
        System.out.println("Acceder elementos");
        for (int i = 1; i <= m.size(); i++) {
            System.out.println("Llave = " + i + " // Valor = " + m.get(i));
        }

        System.out.println("Eliminamos un elemento usando su llave como índice");
        m.remove(1);
        System.out.println("Llave 1 eliminada");
        System.out.println("Nuevo LinkedHashMap: " + m);
    }
}