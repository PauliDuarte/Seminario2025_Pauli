package src.main.Strategy;

/**
 * Implementación de la estrategia de movimiento hacia la izquierda
 */
public class MoverIzquierda implements EstrategiaMovimiento {
    public void mover(EnemigoConEstrategia enemigo) {
        enemigo.setX(enemigo.getX() - 10);
        System.out.println(enemigo.getTipo() + " se mueve a la izquierda a (" + enemigo.getX() + ", " + enemigo.getY() + ")");
    }
} 