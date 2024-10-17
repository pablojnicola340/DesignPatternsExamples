package prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior(100, 100, 100);
        Warrior warrior2 = (Warrior) warrior1.clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("============");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("============");
        Mage mage1 = new Mage(100, 100, 100);
        Mage mage2 = (Mage) mage1.clone();
        System.out.println(mage1);
        System.out.println(mage2);
        System.out.println("============");
        mage2.setHealth(0);
        System.out.println(mage1);
        System.out.println(mage2);
    }
}

/*
 * Patrón de diseño: Prototype
 *
 * Descripción:
 * - El patrón Prototype permite crear nuevos objetos copiando un objeto existente,
 *   conocido como prototipo. Este patrón es útil cuando la creación de un objeto
 *   es costosa o compleja y se desea evitar la sobrecarga de crear nuevos objetos
 *   desde cero.
 *
 * Uso:
 * - Se utiliza cuando se necesita crear instancias de una clase que tiene un
 *   costo significativo en términos de tiempo o recursos. Es común en aplicaciones
 *   que requieren la creación de objetos similares o en configuraciones donde
 *   los objetos se generan dinámicamente.
 *
 * Ejemplo:
 * - Una interfaz `Prototype` que define el método `clone()`. Clases concretas
 *   que implementan el método para crear copias de sí mismas.
 *
 * Ventajas:
 * - Permite la creación de objetos sin acoplarse a sus clases concretas.
 * - Facilita la creación de nuevos objetos a partir de un prototipo existente.
 * - Reduce el costo de creación de objetos complejos.
 */
