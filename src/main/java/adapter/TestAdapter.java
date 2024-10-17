package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        ZombieAdapter zombie = new ZombieAdapter();
        zombie.attack();
        zombie.damage();
    }
}

/*
 * Patrón de diseño: Adapter
 *
 * Descripción:
 * - El patrón Adapter permite que dos interfaces incompatibles colaboren.
 *   Actúa como un intermediario que traduce las solicitudes de una interfaz
 *   en otra que el cliente espera.
 *
 * Uso:
 * - Se utiliza cuando se desea integrar clases que no pueden trabajar juntas
 *   debido a diferencias en sus interfaces. Esto es común en sistemas donde
 *   se necesita reutilizar código existente sin modificarlo.
 *
 * Ejemplo:
 * - Una clase `Adapter` que implementa la interfaz esperada por el cliente
 *   y contiene una referencia a una clase que tiene una interfaz incompatible.
 *   El `Adapter` traduce las llamadas de método del cliente a la clase
 *   incompatible.
 *
 * Ventajas:
 * - Permite la reutilización de clases existentes sin modificar su código.
 * - Facilita la integración de sistemas diversos.
 * - Promueve la flexibilidad en el diseño al desacoplar las interfaces.
 */
