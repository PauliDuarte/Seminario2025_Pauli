package src.main.Strategy;

/**
 * Implementación de la estrategia de movimiento hacia la derecha
 */
public class MoverDerecha implements EstrategiaMovimiento {
    public void mover(EnemigoConEstrategia enemigo) {
        enemigo.setX(enemigo.getX() + 10);
        System.out.println(enemigo.getTipo() + " se mueve a la derecha a (" + enemigo.getX() + ", " + enemigo.getY() + ")");
    }
} 