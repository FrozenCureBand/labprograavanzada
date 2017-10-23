/*
 * ListaDoblementeEnlazada.cpp
 *
 *  Created on: Oct 17, 2017
 *      Author: Jose
 */

using namespace std;

struct lista_elementos
{
char elem[40];
struct lista_elementos *sig;
struct lista_elementos *ant;
};

typedef struct lista_elementos nodo;

void crear(nodo *registro,nodo *fin,nodo *anterior);
void mostrar(nodo *pt);

main()
{
nodo *prin,*fin;


prin=(nodo*)malloc(sizeof(nodo));
fin=(nodo*)malloc(sizeof(nodo));
crear(prin,fin,NULL);
printf("n");
mostrar(prin);
}

void crear(nodo *registro,nodo *fin,nodo *anterior)
{
printf("Dato (Escribir FIN para terminar): ");
scanf(" %[^n]",registro->elem);

if (strcmp(registro->elem,"FIN")==0)
{
registro->sig=NULL;
registro->ant=anterior;
fin=registro;
}
else
{
registro->sig=(nodo*)malloc(sizeof(nodo));
registro->ant=anterior;
crear(registro->sig,fin,registro);
}
}

void mostrar(nodo *pt)
{
if (pt->sig!=NULL)
{
printf("%sn",pt->elem);
mostrar(pt->sig);
}
}

