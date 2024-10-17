package command;

import java.util.Scanner;

public class TestCommand {
    public static void main(String[] args) {
        Player player = new Player(0,0,0);
        MovementInvoker invoker = new MovementInvoker(player);
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().toLowerCase().charAt(0);
        while (c != 'q') {
            invoker.move(c);
            c = sc.next().trim().toLowerCase().charAt(0);
        }
    }
}

/*
 * Patrón de diseño: Command
 *
 * Descripción:
 * - El patrón Command convierte una solicitud en un objeto independiente que
 *   contiene toda la información sobre la solicitud. Esto permite parametrizar
 *   métodos con diferentes solicitudes, retrasar la ejecución de una solicitud
 *   o soportar operaciones que pueden deshacerse.
 *
 * Uso:
 * - Se utiliza cuando se desea encapsular una solicitud como un objeto, lo que
 *   permite que se puedan almacenar, pasar y ejecutar de forma flexible.
 *   Es útil en sistemas donde se necesita soporte para operaciones deshacer/rehacer.
 *
 * Ejemplo:
 * - Una interfaz `Command` con un método `execute()`. Clases concretas que
 *   implementan esta interfaz encapsulan las acciones específicas. Un objeto
 *   `Invoker` que invoca el comando y un objeto `Receiver` que realiza la
 *   acción real.
 *
 * Ventajas:
 * - Desacopla el objeto que invoca la operación del objeto que la realiza.
 * - Permite la implementación de operaciones deshacer/rehacer.
 * - Facilita la implementación de colas de solicitudes y registro de operaciones.
 */
