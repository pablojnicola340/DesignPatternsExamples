package composite;

public class TestComposite {
    public static void main(String[] args) {
        BaseItem inventory = new Bag("inventory");
        BaseItem bagCoins = new Bag("bag coins");
        BaseItem bagPotions = new Bag("bag potions");

        BaseItem coins = new Item("coins", 6);
        bagCoins.add(coins);
        BaseItem magicPotion = new Item("Magic potion", 3);
        BaseItem healthPotion = new Item("Health potion", 3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        BaseItem blade = new Item("blade", 3);
        BaseItem shield = new Item("shield", 3);
        BaseItem armor = new Item("armor", 3);

        inventory.add(bagCoins);
        inventory.add(bagPotions);
        inventory.add(blade);
        inventory.add(shield);
        inventory.add(armor);

        System.out.println("Inventory total value: " + inventory.getValue());
    }
}

/*
 * Patrón de diseño: Composite
 *
 * Descripción:
 * - El patrón Composite permite tratar a los objetos individuales y a los compuestos
 *   de manera uniforme. Esto se logra mediante la creación de una estructura de árbol
 *   donde los nodos pueden ser tanto hojas (objetos individuales) como compuestos
 *   (grupos de objetos).
 *
 * Uso:
 * - Se utiliza cuando se necesita representar jerarquías de objetos en las que
 *   los clientes pueden tratar de manera uniforme tanto a los objetos individuales
 *   como a los compuestos. Es útil en sistemas donde se necesita construir
 *   estructuras complejas a partir de objetos más simples.
 *
 * Ejemplo:
 * - Una interfaz `Component` que define operaciones comunes. Clases `Leaf` que
 *   implementan `Component` y representan objetos individuales, y una clase
 *   `Composite` que también implementa `Component` y contiene una colección de
 *   otros `Component`.
 *
 * Ventajas:
 * - Facilita la creación de estructuras jerárquicas y la manipulación de objetos
 *   de manera uniforme.
 * - Permite la adición de nuevos tipos de componentes sin afectar el código cliente.
 * - Mejora la flexibilidad y la escalabilidad del diseño.
 */
