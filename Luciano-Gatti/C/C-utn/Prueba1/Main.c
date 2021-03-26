#include <stdio.h>

int main()
{
	int a, b, c;

	printf("Ingrese el primer numero: ");
	scanf_s("%i", & a);

	printf("Ingrese el segundo numero: ");
	scanf_s("%i", & b);
	
	printf("Ingrese el tercer numero: ");
	scanf_s("%i", & c);

	int suma = a + b + c;
	int resta = a - b - c;
	double division =  a / b ;
	division = division / c;
	int multiplicaion = a * b * c;

	printf("El resultado de la suma es: %i,\nEl resultado de la resta es: %i\nEl resultado de la division es: %f\nEl resultado de la multiplicaión es: %i.", suma, resta, division, multiplicaion);

	return 0;

}
