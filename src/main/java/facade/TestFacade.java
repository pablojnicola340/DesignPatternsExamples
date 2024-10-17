package facade;

public class TestFacade {
    public static void main(String[] args) {
        FacadeSmithy facade = new FacadeSmithy();
        facade.work("shield", false);
    }
}

/*
 * Patrón de diseño: Facade
 *
 * Descripción:
 * - El patrón Facade proporciona una interfaz simplificada para un conjunto de
 *   interfaces en un subsistema. Este patrón oculta la complejidad del sistema
 *   subyacente y proporciona una interfaz más fácil de usar para los clientes.
 *
 * Uso:
 * - Se utiliza cuando se desea simplificar la interacción con un subsistema
 *   complejo, haciendo que sea más fácil de usar. Es útil en sistemas donde
 *   se necesita reducir las dependencias entre los clientes y el subsistema.
 *
 * Ejemplo:
 * - Una clase `Facade` que coordina las operaciones de varias clases en un
 *   subsistema. Los clientes interactúan solo con la clase `Facade` en lugar
 *   de interactuar directamente con las clases del subsistema.
 *
 * Ventajas:
 * - Reduce la complejidad y el número de interacciones necesarias para
 *   realizar una tarea.
 * - Facilita la interacción con subsistemas complejos.
 * - Promueve un diseño más limpio y organizado al ocultar detalles de
 *   implementación.
 */
