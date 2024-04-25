package com.iesam.digitallibrary.feature.user.domain;

public class DeleteUserUseCase {
    public UserRepository userRepository;

    public DeleteUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute (String id){
        userRepository.deleteUser(id);
    }
}
