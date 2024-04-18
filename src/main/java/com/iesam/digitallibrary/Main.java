package com.iesam.digitallibrary;

import com.iesam.digitallibrary.feature.user.presentation.UserPresentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("********** MENÚ **********");
                System.out.println("1. Crear usuario");
                System.out.println("2. Opción n");
                System.out.println("3. Salir");
                System.out.println("**************************");
                System.out.print("Elige una opción: ");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado crear un usuario.");
                        UserPresentation.showNewUser();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción n.");
                        break;
                    case 3:
                        System.out.println("Has seleccionado salir. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                        break;
                }
            } while (opcion != 3);

            scanner.close();



    }
}