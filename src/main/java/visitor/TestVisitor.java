package visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("last warrior");
        Mage mage = new Mage("last mage");
        Assassin assassin = new Assassin("last assassin");
        EnemyVisitor visitor = new EnemyVisitor();
        visitor.visit(warrior);
        System.out.println("============");
        visitor.visit(mage);
        System.out.println("============");
        visitor.visit(assassin);
    }
}

/*
 * Patrón de diseño: Visitor
 *
 * Descripción:
 * - El patrón Visitor permite agregar nuevas operaciones a una estructura de objetos
 *   existente sin modificar la estructura. Este patrón es útil cuando se necesita realizar
 *   operaciones sobre objetos de diferentes clases sin cambiar la estructura de las clases.
 *
 * Uso:
 * - Se utiliza cuando se necesita realizar operaciones sobre objetos de diferentes clases
 *   sin cambiar la estructura de las clases. Es común en sistemas de procesamiento de datos,
 *   donde se necesitan realizar diferentes operaciones sobre los datos sin cambiar la
 *   estructura de los datos.
 *
 * Ejemplo:
 * - Una interfaz `Visitor` que define los métodos que se pueden aplicar a los objetos.
 *   Clases concretas que implementan la interfaz `Visitor` y una clase `Element` que
 *   acepta a los visitantes.
 *
 * Ventajas:
 * - Permite agregar nuevas operaciones a una estructura de objetos existente sin modificar
 *   la estructura.
 * - Facilita la separación de las operaciones de los objetos, lo que mejora la flexibilidad
 *   y la reutilización del código.
 * - Reduce la complejidad de las clases al no tener que implementar todas las operaciones
 *   en cada clase.
 */
