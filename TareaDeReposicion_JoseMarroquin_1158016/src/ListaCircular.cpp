/*
 * ListaCircular.cpp
 *
 *  Created on: Oct 17, 2017
 *      Author: Jose
 */

using namespace std;

struct listac
{
    int valor;
    listac *sgte;
};

bool vacia(listac *inicio)
{
    bool v=false;
    if(inicio==NULL)
        v=true;
    return v;
}

void ingresar(listac **inicio)
{
    cout<<"Ingrese un numero: ";
    listac *p;
    p = new listac;
    cin>>p->valor;
    cout<<endl;
    if(vacia(*inicio)==true)
    {
        *inicio = p;
    }
    else
    {
        p->sgte = (*inicio)->sgte;
    }
    (*inicio)->sgte = p;
}

void mostrar(listac *inicio)
{
    listac *recorre;
    if (inicio != NULL)
    {
        recorre =  inicio;
        do {
            cout << recorre->valor << " " << endl;
            recorre = recorre->sgte;
        } while (recorre != inicio);
    }
}

int main(int argc, char *argv[])
{
    listac *inicio;
    inicio=NULL;
    for(int i=1;i<=5;i++)
    {
        ingresar(&inicio);
    }
    mostrar(inicio);
    system("PAUSE");
    return EXIT_SUCCESS;
}

