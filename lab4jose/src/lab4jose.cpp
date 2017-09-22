//============================================================================
// Name        : lab4jose.cpp
// Author      : jose
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
void sumapunteros(int a, int b, int* resultado){
	*resultado = a+b;
}
int sumar(int a, int b){
	int c = a + b;
	return c;
}
int resta(int a, int b){
	int c = a - b;
	return c;
}
int multiplicacion(int a, int b){
	int c = a * b;
	return c;
}
int division(int a, int b){
	int c = a / b;
	return c;
}

int main() {
	int resultado = -1;
	sumapunteros(8,5,&resultado);
	int resultados = sumar(5,7);
	int resultador = resta(5,7);
	int resultadom = multiplicacion(5,7);
	int resultadod = division(5,7);
	cout << resultados << endl;
	cout << resultador << endl;
	cout << resultadom << endl;
	cout << resultadod << endl;
	return 0;
}
