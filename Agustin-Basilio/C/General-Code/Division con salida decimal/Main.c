#include <stdio.h>

int main()
{
	int a, b, c;
	float resultado;
	a = 5; b = 7; c = 3;

	//Cuando C hace una operacion aritmetica el tipo de dato que elije para el resultado es el mas grande (el que mas abarca)
	//dentro de los tipos de dato de los elementos que integran la operacion.
	//Por lo tanto si vamos a hacer una operacion donde nuestro resultado puede quedar con coma incluso aunque nuestros elementos sean ambos enteros
	//Tenemos que convertir al menos uno de los elementos que integran la operacion a float o double.

	float auxiliar;
	auxiliar = a;

	resultado = b / auxiliar;

	printf("El primer resultado es: %f\n\n", resultado);

	resultado = resultado / c;

	printf("El segundo resultado es: %f\n\n", resultado);

	//El formateador %f tiene una cantidad de numeros despues de la coma pre definida que es 6
	//Si queremos cambiar eso se utiliza %.cf (siendo "c" los digitos que queremos despues de la coma) o %cd si es double
	//Tambien podemos setear las cifras significativas para limitarlas o ampliarlas usando %nt.cf (siendo "t" la cantidad de cifras significativas Y "n" el
	//caracter o numero para rellenar el espacio de las cifras no significativas).

	printf("El segundo resultado con 1 decimal es: %.1f\n\n", resultado);

	printf("El segundo resultado con 2 decimales es: %.2f\n\n", resultado);

	printf("Un numero de prueba es: %f\n\n", 000341.856);

	printf("Un numero de prueba con 4 cifras significativas y 0 decimales es: %04.0f\n\n", 000341.856);

	//Estas son las reglas de formateo para cualquier tipo de dato nada mas que no tiene sentido agregarle digitos decimales a un entero

	system("Pause");
	return 0;
}