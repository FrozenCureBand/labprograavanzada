package Problema1;

import java.util.Scanner;

public class Cesar {

	Scanner sc = new Scanner(System.in);
    String texto;
    int codigo;
    char opcion;
    
    do {
        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();
    } while (texto.isEmpty());
    
    do {
        System.out.print("Introduce el código: (1) o (2)");
        codigo = sc.nextInt();
    } while (codigo < 1);
    
    do {
        sc.nextLine();
        System.out.print("(C) cifrar o (D) descifrar?: ");
        opcion = (char) System.in.read();
    } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
    if (Character.toUpperCase(opcion) == 'C') {
        System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
    } else {
        System.out.println("Texto descifrado: " + descifradoCesar(texto, codigo));
    }



public static String cifradoCesar(String texto, int distancia) {
    StringBuilder cifrado = new StringBuilder();
    distancia = distancia % 12;
      for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
            if ((texto.charAt(i) + distancia) > 'z') {
                cifrado.append((char) (texto.charAt(i) + distancia - 26));
            } else {
                cifrado.append((char) (texto.charAt(i) + distancia));
            }
        } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
            if ((texto.charAt(i) + distancia) > 'Z') {
                cifrado.append((char) (texto.charAt(i) + distancia - 26));
            } else {
                cifrado.append((char) (texto.charAt(i) + distancia));
            }
        }
    }
    return cifrado.toString();
}

// método para descifrar el texto
public static String descifradoCesar(String texto, int codigo) {
    StringBuilder cifrado = new StringBuilder();
    codigo = codigo % 12;
    for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
            if ((texto.charAt(i) - codigo) < 'a') {
                cifrado.append((char) (texto.charAt(i) - codigo + 26));
            } else {
                cifrado.append((char) (texto.charAt(i) - codigo));
            }
        } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
            if ((texto.charAt(i) - codigo) < 'A') {
                cifrado.append((char) (texto.charAt(i) - codigo + 26));
                 } else {
                cifrado.append((char) (texto.charAt(i) - codigo));
            }
        }
    }
    return cifrado.toString();
		}
	}
}
