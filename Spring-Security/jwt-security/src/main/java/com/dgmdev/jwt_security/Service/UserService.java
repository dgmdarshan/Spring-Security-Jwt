package com.dgmdev.jwt_security.Service;

import com.dgmdev.jwt_security.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User("1","Darshan","darshan@gmail.com"));
        store.add(new User("2","Jhon","jhon@gmail.com"));
        store.add(new User("3","Maxii","maxii@gmail.com"));

    }

    public List<User> getUsers() {
        return this.store;
    }
}
