## Ejercicio 6

Desarrolla una aplicación de un sistema de gestión de productos para una tienda que
vende varios tipos de productos: electrónicos, alimentos y ropa. Todos los productos
tienen algunas características en común: un código de identificación, un nombre y
un precio. Sin embargo, cada tipo de producto tiene diferentes maneras de calcular
su precio final para el cliente.

Para los productos electrónicos, se agrega una tarifa de reciclaje al precio; para los
alimentos, se agrega un impuesto sobre las ventas; y para la ropa, si es de una
determinada marca, se añade un precio adicional.

Crea una clase abstracta Producto con las características comunes de todos los
productos y un método abstracto calcularPrecioFinal. Luego, crea las clases
Electronico, Alimento y Ropa que extienden a Producto y proporciona una
implementación para el método calcularPrecioFinal en cada una de estas subclases.

Finalmente, escribe un programa de prueba que cree al menos un objeto de cada
subclase, calcule el precio final para cada producto e imprima la información del
producto junto con su precio final. 