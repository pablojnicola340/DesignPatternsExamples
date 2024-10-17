package mediator;

public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Enemy enemy1 = new Enemy("enemy1", mediator);
        Enemy enemy2 = new Enemy("enemy2", mediator);
        Enemy enemy3 = new Enemy("enemy3", mediator);
        Companion companion = new Companion("companion1", mediator);
        enemy1.send();
    }
}

/*
 * Patrón de diseño: Mediator
 *
 * Descripción:
 * - El patrón Mediator define un objeto que encapsula cómo interactúan un conjunto
 *   de objetos. Este patrón promueve la comunicación entre objetos sin que se
 *   refieran entre sí, lo que reduce las dependencias y mejora la mantenibilidad.
 *
 * Uso:
 * - Se utiliza cuando se desea desacoplar los objetos que interactúan entre sí,
 *   facilitando la gestión de sus interacciones. Es útil en sistemas donde hay
 *   múltiples componentes que necesitan comunicarse sin tener referencias directas
 *   entre ellos.
 *
 * Ejemplo:
 * - Una interfaz `Mediator` que define métodos para la comunicación entre
 *   componentes. Clases concretas que implementan el Mediator y gestionan las
 *   interacciones entre los componentes.
 *
 * Ventajas:
 * - Reduce las dependencias entre objetos al centralizar la comunicación.
 * - Facilita la adición de nuevos componentes sin modificar el código existente.
 * - Mejora la mantenibilidad y la claridad del código al separar las interacciones.
 */
