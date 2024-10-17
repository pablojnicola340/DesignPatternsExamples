package state;

public class TestState {
    public static void main(String[] args) {
        Mission mission = new Mission("Mission 1");
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
    }
}

/*
 * Patrón de diseño: State
 *
 * Descripción:
 * - El patrón State permite a un objeto alterar su comportamiento cuando su estado interno cambia.
 *   El objeto parecerá cambiar su clase. Este patrón es útil para gestionar el comportamiento
 *   de un objeto en función de su estado interno, evitando el uso de grandes estructuras de
 *   control (como condicionales).
 *
 * Uso:
 * - Se utiliza cuando un objeto debe cambiar su comportamiento según su estado.
 *   Es común en aplicaciones que requieren una lógica de estado compleja, como
 *   máquinas expendedoras, juegos, o sistemas de flujo de trabajo.
 *
 * Ejemplo:
 * - Una interfaz `State` que define los métodos que los estados concretos deben implementar.
 *   Clases concretas que representan diferentes estados y una clase `Context` que mantiene
 *   una referencia al estado actual.
 *
 * Ventajas:
 * - Permite la adición de nuevos estados sin modificar el contexto.
 * - Mejora la legibilidad y mantenimiento del código al evitar condicionales complejas.
 * - Facilita el cambio dinámico de comportamiento en tiempo de ejecución.
 */