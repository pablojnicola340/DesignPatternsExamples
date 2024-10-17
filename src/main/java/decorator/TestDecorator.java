package decorator;

import decorator.decorator.AssassinEnemyDecorator;
import decorator.decorator.MageEnemyDecorator;
import decorator.decorator.WarriorEnemyDecorator;
import decorator.race.Elf;
import decorator.race.Human;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("======== Human Warrior ========");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("======== Human Warrior Mage ========");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();
        System.out.println("======== Elf Warrior Mage Assassin========");
        Enemy elfWarriorMageAssassin = new AssassinEnemyDecorator(
                new MageEnemyDecorator(
                        new WarriorEnemyDecorator(
                                new Elf()
                        )
                )
        );
        elfWarriorMageAssassin.attack();
    }
}

/*
 * Patrón de diseño: Decorator
 *
 * Descripción:
 * - El patrón Decorator permite agregar funcionalidad a un objeto de forma dinámica
 *   sin alterar su estructura. Esto se logra envolviendo el objeto original con
 *   un nuevo objeto que implementa la misma interfaz y añade nuevas responsabilidades.
 *
 * Uso:
 * - Se utiliza cuando se necesita añadir características a objetos de manera
 *   flexible y en tiempo de ejecución, en lugar de utilizar la herencia, que
 *   puede ser más rígida. Es útil en sistemas donde se requiere una combinación
 *   de comportamientos.
 *
 * Ejemplo:
 * - Una interfaz `Component` que define operaciones comunes. Clases concretas que
 *   implementan esta interfaz, y clases `Decorator` que también implementan `Component`
 *   y contienen una referencia a un `Component` para añadir funcionalidad.
 *
 * Ventajas:
 * - Permite añadir responsabilidades a los objetos de manera flexible y dinámica.
 * - Facilita la creación de combinaciones de comportamientos sin necesidad de
 *   crear una gran cantidad de subclases.
 * - Promueve el principio de responsabilidad única al separar la funcionalidad
 *   adicional en clases decoradoras.
 */
