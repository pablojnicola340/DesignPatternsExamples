package factory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.createEnemy("warrior");
        Enemy mage = enemyFactory.createEnemy("mage");
        warrior.attack();
        mage.attack();
    }
}

/*
 * Comparación entre patrones de diseño: Factory, Factory Method y Abstract Factory
 *
 * Semejanza Conceptual:
 * - Propósito: Todos estos patrones se utilizan para crear objetos sin especificar
 *   la clase exacta del objeto que se va a crear.
 * - Encapsulación: Permiten encapsular la lógica de creación de objetos, facilitando
 *   la gestión y mantenimiento del código.
 *
 * Diferencias:
 *
 * 1. Factory (Simple Factory):
 *    - Descripción: No es un patrón oficial, sino una práctica común. Se utiliza
 *      para crear instancias de diferentes clases a través de una única función.
 *    - Uso: Generalmente se usa cuando hay una lógica simple para decidir qué clase
 *      instanciar.
 *    - Ejemplo: Una función que recibe un parámetro y devuelve un objeto de una
 *      clase específica.
 *
 * 2. Factory Method:
 *    - Descripción: Define una interfaz para crear un objeto, pero permite que las
 *      subclases decidan qué clase instanciar. Es un patrón de diseño más formal.
 *    - Uso: Se utiliza cuando se necesita que las subclases modifiquen el tipo de
 *      objeto que se crea.
 *    - Ejemplo: Una clase base con un método `create()` que es sobrescrito por
 *      subclases para crear diferentes tipos de productos.
 *
 * 3. Abstract Factory:
 *    - Descripción: Proporciona una interfaz para crear familias de objetos
 *      relacionados sin especificar sus clases concretas.
 *    - Uso: Se utiliza cuando se necesita crear varios tipos de objetos que están
 *      relacionados entre sí.
 *    - Ejemplo: Una interfaz que define métodos para crear diferentes tipos de
 *      productos (por ejemplo, `createChair()` y `createTable()`) y varias
 *      implementaciones que crean productos de diferentes estilos.
 *
 * Resumen:
 * - Factory: Método simple para crear objetos.
 * - Factory Method: Interfaz para subclases que crean objetos.
 * - Abstract Factory: Interfaz para crear familias de objetos relacionados.
 */
