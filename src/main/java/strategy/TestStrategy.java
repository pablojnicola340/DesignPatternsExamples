package strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Player player = new Player("Player 1");
        Enemy enemy = new Enemy("Enemy 1");
        enemy.attack(player);
        System.out.println("=============");
        enemy.setAttackStrategy(new WarriorAttack());
        enemy.attack(player);
        System.out.println("=============");
        enemy.setAttackStrategy(new MageAttack());
        enemy.attack(player);
    }
}

/*
 * Patrón de diseño: Strategy
 *
 * Descripción:
 * - El patrón Strategy permite definir una familia de algoritmos, encapsular cada uno de ellos
 *   y hacerlos intercambiables. Este patrón permite que el algoritmo varíe independientemente
 *   de los clientes que lo utilizan. Es útil para seleccionar un comportamiento en tiempo de
 *   ejecución.
 *
 * Uso:
 * - Se utiliza cuando se necesita seleccionar un algoritmo específico en tiempo de ejecución,
 *   como en sistemas de ordenamiento, compresión de datos o estrategias de precios.
 *
 * Ejemplo:
 * - Una interfaz `Strategy` que define un método para realizar un comportamiento específico.
 *   Clases concretas que implementan esta interfaz y una clase `Context` que utiliza una
 *   estrategia específica.
 *
 * Ventajas:
 * - Facilita la adición de nuevos algoritmos sin modificar el código existente.
 * - Promueve la reutilización del código al encapsular comportamientos.
 * - Mejora la legibilidad y mantenimiento del código al eliminar condicionales complejas.
 */