<1.0> - <2024-02-08>
Sprint learnings
Los aprendizajes generales fueron:

Conceptos básicos de java.
Cómo hacer test unitarios con JUnit Jupiter.
Saber leer los errores y lograr arreglarlos, incluyendo los warnings.

Added
Los test unitarios, el arrayList con las suposiciones del human player y del computer player.

Changed
Realice cambios en algunas clases simples en algunas clases por ejemplo de private a public porque el test me lo pedía.

Fixed
Los bugs solucionados:

Todos los warnings que me mostraba la consola fueron eliminados.

El mensaje de error "Method call expected" me indicaba que el método assertTrue() esperaba una llamada a un método como su primer parámetro, pero al parecer se está pasando una cadena de texto en su lugar.
La solución fue: que el primer parámetro fuese una llamada a un método que devolviera un booleano.

TargetNumber es una variable privada en la clase GuessTheNumberGame por lo que no podía acceder directamente a ella fuera de esa clase. Me tocó modificar el enfoque de la siguiente manera.
Agregué el método getTargetNumber en GuessTheNumberGame para que devuelva el número generado.

Removed

No se removieron funcionalidades.