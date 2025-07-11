package src.main;

/**
 * Clase Jugador para Space Invaders
 * Ahora incluye vidas y métodos en español
 */
public class Jugador {
    private int x;
    private int y;
    private int vidas;
    
    public Jugador(int x, int y, int vidas) {
        this.x = x;
        this.y = y;
        this.vidas = vidas;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getVidas() { return vidas; }
    
    public void disparar() {
        System.out.println("Jugador dispara desde (" + x + ", " + y + ")");
    }
    
    public void perderVida() {
        vidas--;
        System.out.println("¡Perdiste una vida! Vidas restantes: " + vidas);
    }
} 