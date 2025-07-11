package src.main.Strategy;

/**
 * Clase que implementa el patrón Strategy para enemigos
 * Permite cambiar dinámicamente la estrategia de movimiento
 */
public class EnemigoConEstrategia {
    
    private String tipo;
    private int x, y;
    private EstrategiaMovimiento estrategia;
    
    public EnemigoConEstrategia(String tipo, int x, int y) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Establece la estrategia de movimiento
     */
    public void setEstrategiaMovimiento(EstrategiaMovimiento e) {
        this.estrategia = e;
        System.out.println(tipo + " cambia a estrategia: " + e.getClass().getSimpleName());
    }
    
    /**
     * Ejecuta el movimiento usando la estrategia actual
     */
    public void mover() {
        if (estrategia != null) estrategia.mover(this);
    }
    
    /**
     * Ejecuta el comportamiento del enemigo
     */
    public void comportarse() {
        System.out.println(tipo + " en posición (" + x + ", " + y + ") ejecuta comportamiento");
        
        // El enemigo puede cambiar de estrategia basado en su posición
        if (x <= 100) {
            // Si está cerca del borde izquierdo, cambiar a movimiento hacia la derecha
            setEstrategiaMovimiento(new MoverDerecha());
        } else if (x >= 700) {
            // Si está cerca del borde derecho, cambiar a movimiento hacia la izquierda
            setEstrategiaMovimiento(new MoverIzquierda());
        }
        
        // Ejecutar movimiento
        mover();
    }
    
    /**
     * El enemigo dispara
     */
    public void disparar() {
        System.out.println(tipo + " dispara desde posición (" + x + ", " + y + ")");
    }
    
    /**
     * El enemigo recibe daño
     */
    public void recibirDaño(int damage) {
        // Assuming health is managed elsewhere or not directly in this class
        // For now, we'll just print a message.
        System.out.println(tipo + " recibe daño: " + damage);
    }
    
    /**
     * Verifica si el enemigo está vivo
     */
    public boolean estaVivo() {
        // Assuming health is managed elsewhere or not directly in this class
        // For now, we'll always return true.
        return true;
    }
    
    // Getters y Setters
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public EstrategiaMovimiento getEstrategia() {
        return estrategia;
    }
    
    @Override
    public String toString() {
        return tipo + "{posicion=(" + x + ", " + y + "), estrategia=" + (estrategia != null ? estrategia.getClass().getSimpleName() : "Ninguna") + "}";
    }
} 