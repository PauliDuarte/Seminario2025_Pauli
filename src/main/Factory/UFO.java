package src.main.Factory;

/**
 * Clase UFO que extiende de Enemy
 * Implementa el comportamiento específico del UFO
 */
public class UFO extends Enemy {
    
    public UFO(int x, int y) {
        super(x, y, "UFO");
    }
    
    @Override
    public void comportarse() {
        System.out.println("UFO se comporta de forma básica.");
    }
} 