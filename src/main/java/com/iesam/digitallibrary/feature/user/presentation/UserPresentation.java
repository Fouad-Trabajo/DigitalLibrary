package com.iesam.digitallibrary.feature.user.presentation;

import com.iesam.digitallibrary.feature.user.data.UserDataRepository;
import com.iesam.digitallibrary.feature.user.domain.CreateUserUseCase;
import com.iesam.digitallibrary.feature.user.domain.User;

public class UserPresentation {

    public static void createUser(User user){
        UserDataRepository userDataRepository = new UserDataRepository();
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userDataRepository);
        createUserUseCase.execute(user);
    }



}
