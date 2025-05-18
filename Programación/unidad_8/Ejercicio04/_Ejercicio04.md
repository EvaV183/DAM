## Ejercicio 4.
Supongamos que tienes una lista de conexiones entre varios puntos en un mapa. Cada
conexión se representa por un par de números (por ejemplo, la conexión entre el punto
2 y el punto 3 se puede representar como 2,3). Crea una matriz de adyacencia para
representar estas conexiones.

Por ejemplo la matriz de adyacencia de los puntos {1, 2}, {2, 3}, {3, 1}, {4, 5}, {5, 1} es:


|  | 1 | 2 | 3 | 4 | 5 |
|--|---|---|---|---|---|
| 1 | 0 | 1 | 1 | 0 | 1 |
| 2 | 1 | 0 | 1 | 0 | 0 |
| 3 | 1 | 1 | 0 | 0 | 0 |
| 4 | 0 | 0 | 0 | 0 | 1 |
| 5 | 1 | 0 | 0 | 1 | 0 |

