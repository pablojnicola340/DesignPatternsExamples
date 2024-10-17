package templatemethod;

public class TestTemplateMethod {
    public static void main(String[] args) {
       EnemyTemplate warrior = new Warrior();
       EnemyTemplate mage = new Mage();
       warrior.template();
       mage.template();
    }
}

/*
 * Patrón de diseño: Template Method
 *
 * Descripción:
 * - El patrón Template Method define el esqueleto de un algoritmo en una operación,
 *   delegando algunos pasos a las subclases. Permite a las subclases redefinir ciertos
 *   pasos de un algoritmo sin cambiar la estructura del algoritmo en sí. Este patrón es
 *   útil para evitar la duplicación de código y proporcionar un marco común para
 *   diferentes implementaciones.
 *
 * Uso:
 * - Se utiliza cuando se tiene un algoritmo común que puede ser variado en algunos pasos
 *   por las subclases. Es común en frameworks y bibliotecas donde se necesita extender
 *   el comportamiento de una clase base.
 *
 * Ejemplo:
 * - Una clase abstracta que define el método plantilla y métodos abstractos que deben ser
 *   implementados por las subclases.
 *
 * Ventajas:
 * - Promueve la reutilización del código al definir la estructura común en la clase base.
 * - Facilita la extensión del comportamiento en las subclases.
 * - Reduce la duplicación de código al centralizar la lógica común.
 */
