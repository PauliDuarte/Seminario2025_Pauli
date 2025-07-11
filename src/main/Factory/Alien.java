package src.main.Factory;

/**
 * Clase Alien que extiende de Enemy
 * Implementa el comportamiento específico del Alien
 */
public class Alien extends Enemy {
    
    public Alien(int x, int y) {
        super(x, y, "ALIEN");
    }
    
    @Override
    public void comportarse() {
        System.out.println("Alien se comporta de forma básica.");
    }
} 