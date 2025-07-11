package src.main;

import src.main.Factory.Enemy;
import src.main.Factory.EnemyFactory;
import src.main.Singleton.GestorJuego;
import src.main.Strategy.EnemigoConEstrategia;
import src.main.Strategy.MoverDerecha;
import src.main.Strategy.MoverIzquierda;

/**
 * Juego Space Invaders - Ejemplo de Patrones de Diseño
 * Desarrollado por pauli
 *
 * Demuestra Singleton, Factory y Strategy de forma sencilla
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("=== SPACE INVADERS - PATRONES DE DISEÑO (Versión Pauli) ===\n");
        System.out.println("¡Bienvenido/a! Este es un ejemplo sencillo hecho por pauli.\n");

        // 1. PATRÓN FACTORY primero
        System.out.println("1. PATRÓN FACTORY - Fabrica de Enemigos");
        System.out.println("========================================");
        EnemyFactory fabrica = new EnemyFactory();
        Enemy alien = fabrica.crearEnemigo("ALIEN", 10, 10);
        Enemy ufo = fabrica.crearEnemigo("UFO", 20, 20);
        Enemy robot = fabrica.crearEnemigo("ROBOT", 30, 30);
        System.out.println("Enemigo creado: " + alien.getTipo() + " en (" + alien.getX() + ", " + alien.getY() + ")");
        System.out.println("Enemigo creado: " + ufo.getTipo() + " en (" + ufo.getX() + ", " + ufo.getY() + ")");
        System.out.println("Enemigo creado: " + robot.getTipo() + " en (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println();

        // 2. PATRÓN SINGLETON
        System.out.println("2. PATRÓN SINGLETON - Gestor del Juego");
        System.out.println("======================================");
        GestorJuego gestor1 = GestorJuego.obtenerInstancia();
        GestorJuego gestor2 = GestorJuego.obtenerInstancia();
        System.out.println("Instancia 1: " + gestor1);
        System.out.println("Instancia 2: " + gestor2);
        System.out.println("¿Son la misma instancia? " + (gestor1 == gestor2));
        gestor1.setPuntos(200);
        gestor1.setNivel(2);
        System.out.println("Puntos: " + gestor2.getPuntos());
        System.out.println("Nivel: " + gestor2.getNivel());
        System.out.println();

        // 3. PATRÓN STRATEGY
        System.out.println("3. PATRÓN STRATEGY - Estrategias de Movimiento");
        System.out.println("==============================================");
        EnemigoConEstrategia enemigoEstrategico = new EnemigoConEstrategia("ALIEN", 100, 100);
        System.out.println("Posición inicial: (" + enemigoEstrategico.getX() + ", " + enemigoEstrategico.getY() + ")");
        enemigoEstrategico.setEstrategiaMovimiento(new MoverIzquierda());
        enemigoEstrategico.mover();
        System.out.println("Después de MoverIzquierda: (" + enemigoEstrategico.getX() + ", " + enemigoEstrategico.getY() + ")");
        enemigoEstrategico.setEstrategiaMovimiento(new MoverDerecha());
        enemigoEstrategico.mover();
        System.out.println("Después de MoverDerecha: (" + enemigoEstrategico.getX() + ", " + enemigoEstrategico.getY() + ")");
        System.out.println();

        // 4. SIMULACIÓN DE JUEGO
        System.out.println("4. SIMULACIÓN DE JUEGO");
        System.out.println("=======================");
        Jugador jugador = new Jugador(400, 500, 3); // 3 vidas
        System.out.println("Jugador creado en posición: (" + jugador.getX() + ", " + jugador.getY() + ") con " + jugador.getVidas() + " vidas");
        jugador.disparar();
        jugador.disparar();
        System.out.println("¡Jugador dispara dos veces!");
        gestor1.sumarPuntos(30);
        System.out.println("Nuevos puntos: " + gestor1.getPuntos());
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN (pauli) ===");
    }
} 