package chainofresponsibility;

public class TestChainOfResponsibility {

    public static void main(String[] args) {
        Player player = new Player(TypePlayer.ASSASSIN);
        Mage mage = new Mage(new FireAttack(new IceAttack(new ElectricAttack())));
        mage.chainAttack(player);
    }
}

/*
 * Patrón de diseño: Chain of Responsibility
 *
 * Descripción:
 * - El patrón Chain of Responsibility permite que varios objetos tengan la
 *   oportunidad de manejar una solicitud, pasándola a lo largo de una cadena
 *   de objetos hasta que uno de ellos la maneje.
 *
 * Uso:
 * - Se utiliza cuando hay una solicitud que necesita ser manejada por uno de
 *   varios objetos, pero no se sabe de antemano cuál de ellos lo hará. Esto
 *   es útil en sistemas donde hay una jerarquía de objetos que pueden manejar
 *   diferentes tipos de solicitudes.
 *
 * Ejemplo:
 * - Una clase `Handler` que tiene una referencia a otro `Handler` y un método
 *   `handle()` que maneja la solicitud si es posible, o la pasa al siguiente
 *   `Handler` en la cadena si no es posible.
 *
 * Ventajas:
 * - Permite que varios objetos tengan la oportunidad de manejar una solicitud.
 * - Facilita la creación de sistemas flexibles y escalables.
 * - Reduce la dependencia entre objetos al desacoplar el objeto que envía la
 *   solicitud del objeto que la maneja.
 */
