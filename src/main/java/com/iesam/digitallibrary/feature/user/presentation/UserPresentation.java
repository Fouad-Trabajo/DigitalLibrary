package com.iesam.digitallibrary.feature.user.presentation;

import com.iesam.digitallibrary.feature.user.data.UserDataRepository;
import com.iesam.digitallibrary.feature.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.feature.user.domain.CreateUserUseCase;
import com.iesam.digitallibrary.feature.user.domain.DeleteUserUseCase;
import com.iesam.digitallibrary.feature.user.domain.User;

import java.util.Scanner;

public class UserPresentation {


    static Scanner sc = new Scanner(System.in);

    public static void showNewUser() {
        System.out.print("Introduce el id: ");
        String id = sc.nextLine();
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Introduce el dni: ");
        String dni = sc.nextLine();
        System.out.print("Introduce el fechaInscripcion: ");
        String fechaInscripcion = sc.nextLine();
        User user = new User(id, nombre, apellido, dni, fechaInscripcion);
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(new UserDataRepository(new UserFileLocalDataSource()));
        createUserUseCase.execute(user);
    }

    public static void delelteUser(){
        System.out.print("Introduce el id del usuario que quieres borrar: ");
        String id=sc.nextLine();
        DeleteUserUseCase deleteUserUseCase= new DeleteUserUseCase( new UserDataRepository(new UserFileLocalDataSource()));
        deleteUserUseCase.execute(id);
        System.out.println("El usuario con id " + id + " ha sido borrado correctamente");


    }


}
