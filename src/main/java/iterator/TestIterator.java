package iterator;

import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
      /*  ListNode<String> listNode = new ListNode<>(new Node<>("hola"));
        listNode.addEnd("qué");
        listNode.addEnd("tal");
        Iterator<Node<String>> iterator = listNode.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        listNode.forEach(System.out::println);*/
        Inventory inventory = new Inventory();
        inventory.addEnd(new Item("sword", 10));
        inventory.addEnd(new Item("shield", 10));
        inventory.addEnd(new Item("armor", 20));
        inventory.addEnd(new Item("helmet", 10));
        ItemIterator iterator = inventory.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("=========================");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

/*
 * Patrón de diseño: Iterator
 *
 * Descripción:
 * - El patrón Iterator permite acceder a los elementos de una colección sin
 *   exponer su estructura interna. Este patrón proporciona una forma de
 *   recorrer los elementos de una colección de manera secuencial.
 *
 * Uso:
 * - Se utiliza cuando se necesita acceder a los elementos de una colección
 *   sin conocer su estructura interna. Es útil en aplicaciones que requieren
 *   recorrer colecciones de manera eficiente y flexible.
 *
 * Ejemplo:
 * - Una interfaz `Iterator` que define los métodos para recorrer la colección.
 *   Una clase `Aggregate` que representa la colección y devuelve un Iterator.
 *   Un `ConcreteIterator` que implementa la lógica de recorrido.
 *
 * Ventajas:
 * - Permite acceder a los elementos de una colección sin exponer su estructura
 *   interna.
 * - Facilita la implementación de diferentes tipos de recorridos (directo,
 *   inverso, aleatorio, etc.).
 * - Promueve la flexibilidad y la reutilización de código.
 */