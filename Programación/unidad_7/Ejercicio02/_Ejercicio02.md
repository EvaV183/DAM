## Ejercicio 2.
Realiza una aplicación para gestionar vehículos que permita saber si están arrancados o
no. Para ello crea una clase “Vehículo” que tenga los atributos marca, modelo, precio y
estaArrancado. Esta clase debe tener:
- Un constructor que tome tres argumentos para inicializar estos valores y
estaArrancado como false.
- Un método arrancar() y parar() que cambie el estado de estaArrancado y que
imprima si el vehículo está arrancado o apagado. Estos métodos deben ser capaz
de reconocer que clase hija le llama para mostrar un mensaje diferente, según
el tipo de vehículo. Por ejemplo, “El [coche/moto/camión/etc..] está arrancando
o parado”  
- El método toString().

Crea dos subclases: Coche y Moto. El coche solo tiene un sistema de arranque eléctrico,
en cambio, la moto puede ser arrancada manualmente o de forma eléctrica, la lógica
de la moto debe ser capaz de distinguir estos dos tipos de arranque.
Ambas clases deben tener:
- Un constructor que tome los mismos atributos que tiene la clase Vehículo.
- Métodos arrancar() según los sistemas de arranque que tengan. Deben llamar al
método arrancar() de Vehículo y mostrar un mensaje inicial con el mensaje “(El
coche/La moto) ha utilizado el encendido (manual/eléctrico)”.  
- Un método parar(). Debe llamar al método parar() de Vehículo.  
- El método toString().
Finalmente, crea una clase principal denominada “Ej2” que contenga un método main,
crea instancias de estas clases, invoca sus métodos y muestra los resultados.