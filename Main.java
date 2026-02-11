import java.util.Scanner;

/**
 * CLASES
 * 1- Clase Principal: El Oráculo de Neón
 * 2- Clases de Escenarios: Píldora Roja y Píldora Azul
 * 3- Clases de Retos: Lógica, Memoria, Seguridad, etc.
 * 4- Clases de Interacción: Comandos, Inventario, Pistas, etc.
 * 5- Clases de Narrativa: Diálogos, Descripciones, Eventos, etc.
 * 6- Clases de Utilidades: Guardado/Carga, Configuración, Ayuda, etc.
 * Estudiante: Marco Somarribas - Universidad CENFOTEC
 * Descripción: Simulación de escape room con estética retro-computing.
 */
public class Main {
    // Scanner global para ser usado en diferentes métodos
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Creamos el Scanner una única vez aquí
        Scanner lector = new Scanner(System.in);
        
        // Iniciamos el juego pasándole el lector
        iniciarJuego(lector);
        
        lector.close();
    }

    //Método: iniciarJuego: Renderiza el mapa estilo consola 80s y presenta la narrativa inicial.
    public static void iniciarJuego(Scanner lector) {
        System.out.println(" ___________________________________________________________ ");
        System.out.println("|                                                           |");
        System.out.println("|  ** NEON ORACLE OS v1.0 ** (C) 198X POR MARKO             |");
        System.out.println("|___________________________________________________________|");
        System.out.println("|                                                           |");
        System.out.println("|     [NODO_CENTRAL]                                        |");
        System.out.println("|       |                                                   |");
        System.out.println("|       +--- [PÍLDORA_ROJA] ----> (3 NIVELES DIFICILES)     |");
        System.out.println("|       |                                                   |");
        System.out.println("|       +--- [PÍLDORA_AZUL] ----> (5 NIVELES ESTABLES)      |");
        System.out.println("|                                                           |");
        System.out.println("|___________________________________________________________|");
        System.out.println("| RAM: 64KB OK | CPU: 8-BIT | ESTADO: ESPERANDO...          |");
        System.out.println("|___________________________________________________________|");
        System.out.println("");

        System.out.println(">> PANTALLA: CARGANDO AVENTURA DE TEXTO...");
        System.out.println(">> BIENVENIDO, USUARIO. HAS SIDO DETECTADO EN EL SISTEMA.");

        System.out.print("\nREADY. ¿DESEAS INICIAR SESIÓN? (SI/NO): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("SI")) {
            // Llamada al siguiente método de la arquitectura
            faseCanalizacionActiva();
        } else {
            System.out.println("\n>> SISTEMA DETENIDO. HASTA LUEGO.");
        }
    }

    // Método: faseCanalizacionActiva: Representa la Fase 0 donde el usuario debe confirmar su entrada al código.
    public static void faseCanalizacionActiva() {
        System.out.println("\n--- [FASE 0: CANALIZACIÓN ACTIVA] ---");
        System.out.println(">> EL SISTEMA ESTÁ GENERANDO EL ENTORNO VIRTUAL...");
        
        // Simulación visual de carga
        System.out.println("[##########..........] 50% CARGADO");
        System.out.println("[####################] 100% COMPLETADO");
        
        System.out.println("\n>> ADVERTENCIA: Una vez dentro, no hay vuelta atrás.");
        System.out.println(">> Debes sincronizar tu pulso con el código del Oráculo.");
        System.out.println("\nEscribe el comando 'LANZARSE' para entrar al portal:");
        System.out.print("> ");
        
        String comando = sc.nextLine();

        if (comando.equalsIgnoreCase("LANZARSE")) {
            System.out.println("\n>> ¡DESCOMPRESIÓN DE DATOS EXITOSA!");
            System.out.println(">> Te has lanzado al vacío digital...");
            // Próximo paso: dilemaDelOraculo()
            dilemaDelOraculo();
        } else {
            System.out.println("\n>> ERROR DE SINCRONIZACIÓN. EL PORTAL SE HA CERRADO.");
            System.out.println(">> Tu consciencia quedó atrapada en el buffer.");
        }
    }

    // Método: dilemaDelOraculo: Punto donde el usuario elige su camino (Roja o Azul).
    public static void dilemaDelOraculo() {
        System.out.println("\n===========================================================");
        System.out.println("            EL DILEMA DEL ORÁCULO: ELIGE TU DESTINO        ");
        System.out.println("===========================================================");
        System.out.println("El Oráculo aparece ante ti con dos fragmentos de memoria.");
        System.out.println("\n1. PÍLDORA ROJA: La verdad amarga. (Retos lógicos complejos)");
        System.out.println("2. PÍLDORA AZUL: La ignorancia feliz. (Protocolos de seguridad)");
        
        System.out.print("\n¿Qué camino eliges? (ROJA/AZUL): ");
        String eleccion = sc.nextLine();

        // Aquí es donde bifurcaremos a los métodos de Escenarios que hicimos antes
        System.out.println("Has elegido la ruta: " + eleccion.toUpperCase());
    }
}