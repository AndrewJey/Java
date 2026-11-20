

<!-- local-development:start -->
# Desarrollo local

Puedes abrir este repositorio en VS Code, Antigravity o Sublime Text. El compilador y los servicios necesarios dependen del componente indicado abajo.

## Archivos ignorados

`.gitignore` excluye credenciales locales, estado del editor y salidas de las herramientas detectadas. No deja de versionar archivos que ya estaban en Git. Los manifiestos, archivos de bloqueo, recursos fuente y scripts de esquema forman parte del código.
<!-- local-development:end -->

<!-- platform-tools:start -->
## Herramientas para otros componentes

### Java sin proyecto del IDE

Los archivos Java no tienen un proyecto Ant, Maven o Gradle detectado. Crea un proyecto Java en NetBeans usando una copia de estos fuentes, respeta sus carpetas de paquetes e identifica la clase `main` y sus dependencias antes de ejecutarlo.
<!-- platform-tools:end -->

<!-- improvements-20261119:start -->
## Mejoras y verificación — 2026-11-19 (Corrección de errores de compilación y algoritmos clásicos)

- Corregido `ReverseString.java` (error de compilación `reverseString` y `NullPointerException` en `str.isEmpty() || str == null`).
- Corregido off-by-one `i <= limit` en la Criba de Eratóstenes (`FindingPrimes.java`, antes marcaba 25 como primo), añadidos `factorialBig` y protección contra overflow/negativos en `Factorial.java`, y soporte de `0`/negativos sin overflow en `DecimalToOctal.java`.
- Validación: compilación JDK 17 y 14 aserciones automatizadas cubriendo todos los algoritmos corregidos.
<!-- improvements-20261119:end -->
