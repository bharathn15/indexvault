package com.index.vault.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    public User SaveUser(User user){
        return userRepo.save(user);
    }
}

