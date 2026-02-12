
import java.util.Scanner;

/**
 * CLASES PROYECTO UNIVERSITARIO 1- Clase Principal: El Oráculo de Neón
 * Estudiante: Marco Somarribas - Universidad CENFOTEC Descripción: Simulación
 * de escape room con estética retro-computing y validaciones de flujo
 * completas.
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

    // Método: iniciarJuego Renderiza el mapa estilo consola 80s y gestiona la bienvenida con validación SI/NO.
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
            } else if (respuesta.equalsIgnoreCase("NO")) {
                entradaValida = true;
                System.out.println("\n>> SISTEMA DETENIDO. HASTA LUEGO.");
            } else {
                System.out.println(">> ERROR: '" + respuesta + "' no es un comando válido.");
                System.out.println(">> Escriba 'SI' para continuar o 'NO' para salir.");
            }
        }
    }

    //Método: faseCanalizacionActiva Requiere el comando 'LANZARSE' con validación repetitiva para evitar errores.
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
            } else {
                System.out.println(">> [ERROR DE SINCRONIZACIÓN]: Comando '" + comando + "' desconocido.");
                System.out.println(">> El portal requiere la palabra clave exacta para abrirse.");
            }
        }
    }

    //Método: dilemaDelOraculo Punto de ramificación principal. Ahora bifurca el flujo hacia los retos.
    public static void dilemaDelOraculo(Scanner lector) {
        System.out.println("\n===========================================================");
        System.out.println("            EL DILEMA DEL ORÁCULO: ELIGE TU DESTINO        ");
        System.out.println("===========================================================");
        System.out.println("El Oráculo aparece ante ti con dos fragmentos de memoria.");
        System.out.println("\n1. PÍLDORA ROJA: La verdad amarga. (Retos lógicos complejos)");
        System.out.println("2. PÍLDORA AZUL: La ignorancia feliz. (Protocolos de seguridad)");

        String eleccion = "";
        boolean rutaElegida = false;

        while (!rutaElegida) {
            System.out.print("\n¿Qué camino eliges? (ROJA/AZUL): ");
            eleccion = lector.nextLine().trim();

            if (eleccion.equalsIgnoreCase("ROJA")) {
                rutaElegida = true;
                System.out.println("\n>> Has elegido la ruta: ROJA");
                System.out.println(">> CARGANDO SECUENCIAS DE ALTA COMPLEJIDAD...");
                iniciarRutaRoja(lector); // Conexión real
            } else if (eleccion.equalsIgnoreCase("AZUL")) {
                rutaElegida = true;
                System.out.println("\n>> Has elegido la ruta: AZUL");
                System.out.println(">> CARGANDO PROTOCOLOS DE ESTABILIDAD...");
                iniciarRutaAzul(lector); // Conexión real
            } else {
                System.out.println(">> ERROR: '" + eleccion + "' no es una ruta reconocida.");
                System.out.println(">> Solo puedes elegir entre 'ROJA' o 'AZUL'.");
            }
        }
    }

    //Método: iniciarRutaRoja Gestiona el progreso de los 3 niveles de la Píldora Roja.
    public static void iniciarRutaRoja(Scanner lector) {
        System.out.println("\n--- [ESTADO: ENTRANDO A LA RUTA ROJA] ---");
        System.out.println(">> ADVERTENCIA: Se ha detectado una anomalía en el núcleo.");

        // Llamada al Reto 1
        retoAritmetico(lector);
    }

    //Reto 1: Estabilización de Núcleo (Aritmética Aleatoria)
    public static void retoAritmetico(Scanner lector) {
        // Generamos números aleatorios para que el juego cambie siempre
        int num1 = (int) (Math.random() * 12) + 2;
        int num2 = (int) (Math.random() * 12) + 2;
        int resultadoCorrecto = num1 * num2;

        System.out.println("\n[RETO 1: DESAFÍO MATEMÁTICO]");
        System.out.println(">> Para estabilizar el buffer, resuelva:");
        System.out.println(">> " + num1 + " x " + num2 + " = ?");

        boolean superado = false;
        while (!superado) {
            System.out.print("RESPUESTA: ");

            // Verificamos que sea un número para evitar que el programa explote
            if (lector.hasNextInt()) {
                int respuesta = lector.nextInt();
                lector.nextLine(); // Limpiar el buffer del Scanner

                if (respuesta == resultadoCorrecto) {
                    System.out.println(">> [OK]: Sincronización exitosa.");
                    superado = true;
                    // Aquí llamaremos al Reto 2 en el siguiente paso
                } else {
                    System.out.println(">> [ERROR]: Valor incorrecto. El núcleo se vuelve inestable. Reintente.");
                }
            } else {
                System.out.println(">> [CRITICAL_ERROR]: Solo se aceptan datos numéricos.");
                lector.next(); // Limpiar el dato no válido
            }
        }
    }

    //Método: iniciarRutaAzul Reservado para la lógica de la ruta alternativa.
    public static void iniciarRutaAzul(Scanner lector) {
        System.out.println("\n--- [ESTADO: ENTRANDO A LA RUTA AZUL] ---");
        System.out.println(">> Protocolos de seguridad activados. Bienvenida, consciencia.");
        // Implementaremos esto tras terminar la ruta roja
    }
}
