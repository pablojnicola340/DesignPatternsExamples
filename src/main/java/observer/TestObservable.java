package observer;

public class TestObservable {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("warrior 1");
        Warrior warrior2 = new Warrior("warrior 2");
        Mage mage1 = new Mage("mage 1");
        Mage mage2 = new Mage("mage 2");
        Vigilant vigilant = new Vigilant("vigilant");
        vigilant.subscribe(warrior1);
        vigilant.subscribe(warrior2);
        vigilant.subscribe(mage1);
        vigilant.subscribe(mage2);
        vigilant.activate();
        System.out.println("==============");
        vigilant.unsubscribe(mage2);
        vigilant.activate();
    }
}

/*
 * Patrón de diseño: Observer
 *
 * Descripción:
 * - El patrón Observer define una relación entre objetos en la que un objeto,
 *   llamado sujeto, notifica a otros objetos, llamados observadores, sobre
 *   cambios en su estado. Este patrón permite que los objetos se comuniquen
 *   entre sí sin tener una referencia directa entre ellos.
 *
 * Uso:
 * - Se utiliza cuando se necesita notificar a múltiples objetos sobre cambios
 *   en el estado de otro objeto. Es común en aplicaciones que requieren
 *   actualizaciones en tiempo real, como sistemas de monitoreo o aplicaciones
 *   de trading.
 *
 * Ejemplo:
 * - Una interfaz `Observer` que define el método de notificación. Una interfaz
 *   `Subject` que define los métodos para agregar y eliminar observadores.
 *   Una clase concreta `ConcreteSubject` que implementa la lógica de notificación.
 *
 * Ventajas:
 * - Permite que los objetos se comuniquen entre sí sin tener una referencia
 *   directa entre ellos.
 * - Facilita la adición de nuevos observadores sin modificar el código existente.
 * - Promueve la separación de responsabilidades entre los objetos.
 */
