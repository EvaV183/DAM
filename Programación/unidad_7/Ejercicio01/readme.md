## Ejercicio 1

Desarrolla una aplicación que tenga una representación de un sistema de gestión de
inventario para un almacén de componentes informáticos.

Deberás crear una clase base llamada "Componente" que tiene tres atributos: referencia
(tipo long), marca (tipo String) y modelo (tipo String). Deberás incluir en esta clase un
constructor que inicialice estos tres atributos, métodos de acceso (getters y setters) para
cada uno de ellos, y el método toString().

Además, se pide que desarrolles dos clases que heredan de la clase "Componente",
estas clases son "DiscoDuro" y "Microprocesador".

La clase "DiscoDuro" debe tener un atributo adicional: capacidad (tipo int). Deberás
incluir un constructor en esta clase que inicialice los cuatro atributos (los tres de la clase
"Componente" y el nuevo atributo), métodos de acceso para este nuevo atributo y el
método toString().

La clase "Microprocesador" debe tener un atributo adicional: frecuencia (tipo int).
Deberás incluir un constructor en esta clase que inicialice los cuatro atributos (los tres
de la clase "Componente" y el nuevo atributo), métodos de acceso para este nuevo
atributo, y el método toString().

Finalmente, crea una clase principal denominada “Ej1” que contenga un método main,
crea instancias de estas clases, invoca sus métodos y muestra los resultados.