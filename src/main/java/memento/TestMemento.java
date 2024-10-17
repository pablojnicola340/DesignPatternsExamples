package memento;

public class TestMemento {
    public static void main(String[] args) {
        String name = "game1";
        Game game = new Game(name, 1, 0);
        game.save();
        System.out.println("Save 1: " + game);
        game = new Game(name, 2, 10);
        game.save();
        System.out.println("Save 2: " + game);
        System.out.println("===============");
        game = new Game(name);
        game.back();
        System.out.println("Undo 1: " + game);
        System.out.println("===============");
        game = new Game(name);
        game.forward();
        System.out.println("Redo 1: " + game);
    }
}

/*
 * Patrón de diseño: Memento
 *
 * Descripción:
 * - El patrón Memento permite capturar y almacenar el estado interno de un objeto
 *   sin violar su encapsulamiento, de modo que pueda restaurarse posteriormente.
 *   Este patrón es útil para implementar funcionalidades de deshacer/rehacer.
 *
 * Uso:
 * - Se utiliza cuando se necesita guardar el estado de un objeto en un momento
 *   determinado y restaurarlo más tarde. Es común en aplicaciones que requieren
 *   funcionalidades de deshacer, como editores de texto o herramientas de diseño.
 *
 * Ejemplo:
 * - Una clase `Memento` que almacena el estado del objeto. Una clase `Originator`
 *   que crea y restaurar el Memento. Un `Caretaker` que gestiona los Mementos
 *   y se encarga de la memoria.
 *
 * Ventajas:
 * - Permite restaurar el estado de un objeto sin exponer su implementación interna.
 * - Facilita la implementación de funcionalidades de deshacer/rehacer.
 * - Promueve la separación de responsabilidades entre el objeto y su estado.
 */
