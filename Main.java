import java.util.Scanner;

/**
 * CLASES PROYECTO UNIVERSITARIO
 * 1- Clase Principal: El Oráculo de Neón
 * Estudiante: Marco Somarribas - Universidad CENFOTEC
 * Descripción: Simulación de escape room con estética retro-computing y validaciones de flujo completas.
 */
public class Main {

    public static void main(String[] args) {
        // Creamos el Scanner una única vez aquí como 'lector'
        Scanner lector = new Scanner(System.in);
        
        // Iniciamos el juego pasándole el objeto lector
        iniciarJuego(lector);
        
        // Cerramos el recurso al finalizar todo el programa
        lector.close();
    }

    /**
     * Método: iniciarJuego
     * Renderiza el mapa estilo consola 80s y gestiona la bienvenida con validación SI/NO.
     */
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

        String respuesta = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("\nREADY. ¿DESEAS INICIAR SESIÓN? (SI/NO): ");
            respuesta = lector.nextLine().trim(); 

            if (respuesta.equalsIgnoreCase("SI")) {
                entradaValida = true; 
                System.out.println("\n>> ACCESO CONCEDIDO. INICIANDO PROTOCOLO...");
                faseCanalizacionActiva(lector); 
            } 
            else if (respuesta.equalsIgnoreCase("NO")) {
                entradaValida = true; 
                System.out.println("\n>> SISTEMA DETENIDO. HASTA LUEGO.");
            } 
            else {
                System.out.println(">> ERROR: '" + respuesta + "' no es un comando válido.");
                System.out.println(">> Escriba 'SI' para continuar o 'NO' para salir.");
            }
        }
    }

    /**
     * Método: faseCanalizacionActiva
     * Requiere el comando 'LANZARSE' con validación repetitiva para evitar errores.
     */
    public static void faseCanalizacionActiva(Scanner lector) {
        System.out.println("\n--- [FASE 0: CANALIZACIÓN ACTIVA] ---");
        System.out.println(">> EL SISTEMA ESTÁ GENERANDO EL ENTORNO VIRTUAL...");
        
        System.out.println("[##########..........] 50% CARGADO");
        System.out.println("[####################] 100% COMPLETADO");
        
        System.out.println("\n>> ADVERTENCIA: Una vez dentro, no hay vuelta atrás.");
        System.out.println(">> Debes sincronizar tu pulso con el código del Oráculo.");
        
        String comando = "";
        boolean sincronizado = false;

        while (!sincronizado) {
            System.out.println("\nEscribe el comando 'LANZARSE' para entrar al portal:");
            System.out.print("> ");
            
            comando = lector.nextLine().trim();

            if (comando.equalsIgnoreCase("LANZARSE")) {
                sincronizado = true; 
                System.out.println("\n>> ¡DESCOMPRESIÓN DE DATOS EXITOSA!");
                System.out.println(">> Te has lanzado al vacío digital...");
                dilemaDelOraculo(lector);
            } 
            else {
                System.out.println(">> [ERROR DE SINCRONIZACIÓN]: Comando '" + comando + "' desconocido.");
                System.out.println(">> El portal requiere la palabra clave exacta para abrirse.");
            }
        }
    }

    /**
     * Método: dilemaDelOraculo
     * Punto de ramificación principal del juego con validación de ruta ROJA/AZUL.
     */
    public static void dilemaDelOraculo(Scanner lector) {
        System.out.println("\n===========================================================");
        System.out.println("            EL DILEMA DEL ORÁCULO: ELIGE TU DESTINO        ");
        System.out.println("===========================================================");
        System.out.println("El Oráculo aparece ante ti con dos fragmentos de memoria.");
        System.out.println("\n1. PÍLDORA ROJA: La verdad amarga. (Retos lógicos complejos)");
        System.out.println("2. PÍLDORA AZUL: La ignorancia feliz. (Protocolos de seguridad)");
        
        String eleccion = "";
        boolean rutaElegida = false;

        // Bucle de validación para asegurar la elección correcta de la píldora
        while (!rutaElegida) {
            System.out.print("\n¿Qué camino eliges? (ROJA/AZUL): ");
            eleccion = lector.nextLine().trim();

            if (eleccion.equalsIgnoreCase("ROJA") || eleccion.equalsIgnoreCase("AZUL")) {
                rutaElegida = true;
                System.out.println("\n>> Has elegido la ruta: " + eleccion.toUpperCase());
                System.out.println(">> CARGANDO SECUENCIAS DE LA PÍLDORA " + eleccion.toUpperCase() + "...");
                
                // Aquí mañana conectaremos con los retos específicos
            } else {
                System.out.println(">> ERROR: '" + eleccion + "' no es una ruta reconocida por el Oráculo.");
                System.out.println(">> Solo puedes elegir entre 'ROJA' o 'AZUL'.");
            }
        }
    }
}