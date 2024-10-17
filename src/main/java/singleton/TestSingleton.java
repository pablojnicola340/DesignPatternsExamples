package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread threadPepe = new Thread(new RunPepe());
        Thread threadManolo = new Thread(new RunManolo());

        threadPepe.start();
        threadManolo.start();
    }

    static class RunPepe implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("pepe");
            System.out.println("Running pepe: " + player);
        }
    }

    static class RunManolo implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("manolo");
            System.out.println("Running manolo: " + player);
        }
    }
}

/*
 * Patrón de diseño: Singleton
 *
 * Descripción:
 * - El patrón Singleton asegura que una clase tenga una única instancia y proporciona
 *   un punto de acceso global a esa instancia. Este patrón es útil cuando se necesita
 *   controlar el acceso a un recurso compartido, como una configuración o un
 *   gestor de conexiones.
 *
 * Uso:
 * - Se utiliza cuando se desea garantizar que solo exista una instancia de una clase
 *   en toda la aplicación, como en el caso de un registro de configuración o una
 *   conexión a base de datos.
 *
 * Ejemplo:
 * - Una clase `Singleton` que tiene un constructor privado y un método estático que
 *   devuelve la única instancia de la clase.
 *
 * Ventajas:
 * - Controla el acceso a un recurso compartido.
 * - Reduce el consumo de memoria al evitar la creación de múltiples instancias.
 * - Facilita el acceso global a la instancia única.
 */
