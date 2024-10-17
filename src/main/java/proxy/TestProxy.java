package proxy;

public class TestProxy {
    public static void main(String[] args) {
        GameImpl gameImpl = new GameImpl();
        gameImpl.newGame("player1");
        ProxyGameImpl proxyGame = new ProxyGameImpl(gameImpl);
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
        proxyGame.getStats().setKills(10);
        proxyGame.getStats().setDeaths(2);
        proxyGame.getStats().setLevel(10);
        proxyGame.save("player1");
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
    }
}

/*
 * Patrón de diseño: Proxy
 *
 * Descripción:
 * - El patrón Proxy proporciona un sustituto o representante de otro objeto para
 *   controlar el acceso a este. Permite realizar acciones como la carga diferida,
 *   la autenticación, el registro de acceso y más, sin que el cliente tenga que
 *   conocer la implementación real del objeto.
 *
 * Uso:
 * - Se utiliza cuando se necesita controlar el acceso a un objeto, ya sea para
 *   optimizar el rendimiento (carga diferida), para agregar funcionalidad (como
 *   seguridad) o para gestionar recursos (como conexiones de red).
 *
 * Ejemplo:
 * - Una interfaz `Subject` que define las operaciones que el objeto real puede
 *   realizar. Una clase `RealSubject` que implementa esta interfaz y una clase
 *   `Proxy` que también implementa la interfaz y controla el acceso al
 *   `RealSubject`.
 *
 * Ventajas:
 * - Proporciona un control adicional sobre el acceso a un objeto.
 * - Puede mejorar el rendimiento al retrasar la creación de objetos hasta que
 *   sean necesarios.
 * - Permite añadir funcionalidad adicional sin modificar el objeto real.
 */