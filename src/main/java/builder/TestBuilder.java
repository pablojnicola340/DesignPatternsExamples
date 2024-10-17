package builder;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .name("pepe")
                .type("mage")
                .health(100)
                .damage(100)
                .endurance(100)
                .build();
        System.out.println(enemy.toString());
    }
}

/*
 * Patrón de diseño: Builder
 *
 * Descripción:
 * - El patrón Builder se utiliza para construir un objeto complejo paso a paso.
 *   Separa la construcción de un objeto de su representación, permitiendo crear
 *   diferentes representaciones del mismo tipo de objeto.
 *
 * Uso:
 * - Se utiliza cuando un objeto necesita ser creado de manera incremental y
 *   puede tener diferentes configuraciones. Esto es especialmente útil cuando
 *   un objeto tiene muchas propiedades opcionales o cuando su construcción
 *   requiere varios pasos.
 *
 * Ejemplo:
 * - Una clase `Builder` que proporciona métodos para establecer diferentes
 *   propiedades de un objeto y un método `build()` para crear el objeto final.
 *
 * Ventajas:
 * - Mejora la legibilidad del código al permitir la construcción de objetos de
 *   manera clara y concisa.
 * - Facilita la creación de objetos inmutables.
 * - Permite la creación de diferentes representaciones de un objeto.
 */
