# Space Invaders - Patrones de Diseño (Versión Pauli)

## 📋 Resumen del Proyecto

**Space Invaders - Patrones de Diseño** es una implementación educativa del clásico juego Space Invaders en Java que demuestra tres patrones de diseño importantes. Desarrollado por **pauli**.

### 🎯 Patrones Implementados

1. **Singleton** (`GestorJuego`) - Controla la instancia única del juego
2. **Factory** (`EnemyFactory`) - Crea diferentes tipos de enemigos (Alien, UFO, Robot)
3. **Strategy** (`EstrategiaMovimiento`) - Permite cambiar el comportamiento de movimiento

### 🏗️ Estructura del Proyecto
```
Seminario_2025/
├── src/main/
│   ├── Game.java                 # Clase principal del juego
│   ├── Jugador.java              # Jugador con sistema de vidas
│   ├── Singleton/
│   │   └── GestorJuego.java     # Patrón Singleton
│   ├── Factory/
│   │   ├── EnemyFactory.java    # Patrón Factory
│   │   ├── Enemy.java           # Clase base para enemigos
│   │   ├── Alien.java           # Tipo de enemigo
│   │   ├── UFO.java             # Tipo de enemigo
│   │   └── Robot.java           # Nuevo tipo de enemigo
│   └── Strategy/
│       ├── EstrategiaMovimiento.java # Interfaz Strategy
│       ├── MoverIzquierda.java       # Estrategia de movimiento
│       ├── MoverDerecha.java         # Estrategia de movimiento
│       └── EnemigoConEstrategia.java # Enemigo con Strategy
├── compile.bat                   # Script de compilación
├── run.bat                      # Script de ejecución
└── README.md
```

### 🎮 Características del Juego
- Sistema de puntuación y niveles
- Múltiples tipos de enemigos (Alien, UFO, Robot)
- Diferentes estrategias de movimiento
- Gestión centralizada del estado del juego
- Jugador con sistema de vidas
- Mensajes personalizados en español

### 🚀 Cómo Ejecutar el Proyecto

1. **Compilar**: `.\compile.bat`
2. **Ejecutar**: `.\run.bat`

O manualmente:
- **Compilar**: `javac -d bin src/main/*.java src/main/*/*.java`
- **Ejecutar**: `java -cp bin src.main.Game`

### 📝 Notas del Desarrollador
- Proyecto educativo para demostrar patrones de diseño
- Código simplificado y comentado
- Nombres de variables y métodos en español
- Estructura clara y fácil de entender
