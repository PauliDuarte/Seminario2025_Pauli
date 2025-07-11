package src.main.Factory;

/**
 * Clase base abstracta para todos los enemigos del juego
 * Define las propiedades y comportamientos comunes
 */
public abstract class Enemy {
    protected int x;
    protected int y;
    protected String tipo;
    
    public Enemy(int x, int y, String tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }
    
    /**
     * Método abstracto que cada enemigo debe implementar
     * Define cómo se comporta el enemigo
     */
    public abstract void comportarse();
    
    /**
     * Método para que el enemigo se mueva
     */
    public void mover() {
        // Movimiento básico hacia abajo
        y += 5;
        System.out.println(tipo + " se mueve a posición (" + x + ", " + y + ")");
    }
    
    /**
     * Método para que el enemigo dispare
     */
    public void disparar() {
        System.out.println(tipo + " dispara desde posición (" + x + ", " + y + ")");
    }
    
    // Getters y Setters
    public int getX() { return x; }
    public int getY() { return y; }
    public String getTipo() { return tipo; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    
    @Override
    public String toString() {
        return tipo + "{posicion=(" + x + ", " + y + ")}";
    }
} 