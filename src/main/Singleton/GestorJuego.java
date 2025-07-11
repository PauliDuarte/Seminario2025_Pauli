package src.main.Singleton;

/**
 * Implementación del patrón Singleton para el gestor del juego
 * Garantiza una única instancia que controla puntuación, nivel y estado del juego
 */
public class GestorJuego {
    
    // Instancia única (Singleton)
    private static GestorJuego instancia;
    
    // Variables de estado del juego
    private int puntos;
    private int nivel;
    
    /**
     * Constructor privado para evitar instanciación directa
     */
    private GestorJuego() {
        puntos = 0;
        nivel = 1;
    }
    
    /**
     * Obtiene la instancia única del gestor del juego
     * Implementa lazy initialization
     */
    public static GestorJuego obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorJuego();
        }
        return instancia;
    }
    
    /**
     * Añade puntos al jugador
     */
    public void sumarPuntos(int puntosGanados) {
        puntos += puntosGanados;
        System.out.println("¡Puntos ganados! +" + puntosGanados + " (Total: " + puntos + ")");
        
        // Subir de nivel cada 1000 puntos
        if (puntos >= nivel * 1000) {
            subirNivel();
        }
    }
    
    /**
     * Sube de nivel
     */
    private void subirNivel() {
        nivel++;
        System.out.println("¡NIVEL " + nivel + " ALCANZADO!");
    }
    
    // Getters y Setters
    public int getPuntos() {
        return puntos;
    }
    
    public void setPuntos(int p) {
        puntos = p;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int n) {
        nivel = n;
    }
    
    @Override
    public String toString() {
        return "GestorJuego{puntos=" + puntos + ", nivel=" + nivel + "}";
    }
} 