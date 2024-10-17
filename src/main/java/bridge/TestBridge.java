package bridge;

import bridge.enemy.Mage;
import bridge.enemy.Warrior;
import bridge.fighter.MageFighterImpl;
import bridge.fighter.WarriorFighterImpl;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("============ WARRIOR ===========");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MageFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("============ MAGE ===========");
        Mage mage = new Mage();
        mage.attack();
        mage.protect();
        mage.setFighter(new WarriorFighterImpl());
        mage.attack();
        mage.protect();
    }
}

/*
 * Patrón de diseño: Bridge
 *
 * Descripción:
 * - El patrón Bridge se utiliza para desacoplar una abstracción de su implementación,
 *   permitiendo que ambas evolucionen de manera independiente. Se compone de dos
 *   jerarquías: una para la abstracción y otra para la implementación.
 *
 * Uso:
 * - Se utiliza cuando se desea evitar un gran número de subclases que combinan
 *   diferentes implementaciones con diferentes abstracciones. Esto es útil
 *   cuando hay muchas variaciones de una clase.
 *
 * Ejemplo:
 * - Una clase `Abstraction` que contiene una referencia a una interfaz `Implementor`.
 *   Las subclases de `Abstraction` pueden utilizar diferentes implementaciones
 *   de `Implementor` sin necesidad de cambiar su propia lógica.
 *
 * Ventajas:
 * - Facilita la extensión del sistema al permitir que la abstracción y la
 *   implementación evolucionen independientemente.
 * - Reduce el número de subclases necesarias al desacoplar las jerarquías.
 * - Mejora la flexibilidad y la escalabilidad del diseño.
 */
