# universitario-java-el-oraculo-de-neon 🌌

###  Descripción
En este proyecto de programación, desarrollamos un simulador de **Escape Room** en Java. El software utiliza lógica de control y estructuras condicionales para crear una experiencia interactiva en consola llamada "El Oráculo de Neón".

---

###  Narrativa: El Oráculo de Neón
> En una cámara silenciosa, iluminada por luces de neón pulsantes y pantallas suspendidas en el aire, despiertas sin memoria pero con una certeza: solo hay una salida. Frente a ti, una figura digital aparece envuelta en distorsiones visuales. Es el Oráculo de Neón, una inteligencia antigua y omnipresente que controla el entorno. 
> 
> “No saldrás hasta que demuestres que ves más allá de la ilusión.”

Para obtener tu libertad, deberás superar las siguientes pruebas:

* **🔹 Primera validación: “El Número del Alma”**
    Elegir entre las cifras 7, 9 y 4. Un acierto otorga el símbolo `∆`.
* **🔹 Segunda validación: “El Eco Digital”**
    Replicar el patrón binario `beep-boop-beep` para obtener el símbolo `◇`.
* **🔹 Validación opcional: “La Elección”**
    Decidir entre la **Pastilla Roja** (verdad compleja) o la **Pastilla Azul** (ruta simple/estricta).
* **🔹 Tercera validación: “La Clave del Alma”**
    Resolver el acertijo lógico: *“Tu destino es la suma entre lo que fallaste y lo que creíste al inicio”*.

---

###  Estructura Lógica del Proyecto
A continuación, se presenta el flujo técnico y los conceptos de Java aplicados:

1. **Inicialización:** Declaración de variables, Clase `Scanner` y `System.out.println`.
2. **Fase I (Numérica):** Estructura condicional `if-else` para validar el `int numeroAlma`. Los fallos activan el acumulador `errores++`.
3. **Fase II (Cadenas):** Comparación de Strings con `.equals()`. Uso de bucle `do-while` para el reinicio del patrón.
4. **Fase III (Booleana):** Bifurcación basada en la elección de la pastilla que altera el flujo narrativo.
5. **Fase IV (Aritmética):** Aplicación de operadores para la ecuación final: `int claveCorrecta = errores + numeroAlma`.

---

###  Tecnologías utilizadas
* **Java 17:** Lenguaje principal.
* **Visual Studio Code:** Editor de código.
* **Git & GitHub:** Control de versiones.

---

###  Autor
* **GitHub:** [202marko](https://github.com/202marko)
* **Proyecto:** Universitario - Java Fundamentals.

---

_Proyecto realizado para el aprendizaje de lógica y fundamentos en Java - 2026_