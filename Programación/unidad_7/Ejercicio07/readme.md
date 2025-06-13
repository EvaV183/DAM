## Ejercicio 7

Desarrolla una aplicación de un sistema para un banco que ofrece varios tipos de
cuentas: cuenta de ahorro, cuenta corriente y cuenta de inversión. Todas las cuentas
tienen un número de cuenta, un titular y un saldo. Sin embargo, cada tipo de cuenta
tiene diferentes maneras de calcular el interés.

Crea una clase abstracta Cuenta con las características comunes de todas las
cuentas y un método abstracto calcularInteres. Luego, crea las clases CuentaAhorro,
CuentaCorriente y CuentaInversion que extienden a Cuenta y proporciona una
implementación para el método calcularInteres en cada una de estas subclases.

Finalmente, escribe un programa de prueba que cree al menos un objeto de cada
subclase, calcule el interés para cada cuenta e imprima la información de la cuenta
junto con el interés calculado. 