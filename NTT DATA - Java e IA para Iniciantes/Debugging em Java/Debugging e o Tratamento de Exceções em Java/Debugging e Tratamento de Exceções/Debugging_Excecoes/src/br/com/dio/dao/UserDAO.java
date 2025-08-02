package br.com.dio.dao;

import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model){
     model.setId(nextId++);
     models.add(model);
     return model;
    }

    public UserModel update(final UserModel model){

    }

    public UserModel findById(final long id){
        models.stream().filter(u -> u.getId() == id).
                findFirst().orElseThrow(() -> new UserNotFoundException("Não existe usuário com o id %s cadastrado"));
    }

}
