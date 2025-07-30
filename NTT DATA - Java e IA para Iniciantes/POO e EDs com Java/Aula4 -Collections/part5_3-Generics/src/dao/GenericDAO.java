package dao;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T> {

    private List<T> db = new ArrayList<>();

    public T save(T domain){
        db.add(domain);
        return domain;
    }

    public T update(T domain){
       var stored = db.stream().filter(d -> d.equals(domain)).
               findFirst().orElseThrow();

       db.remove(stored);
       db.add(domain);
       return save(domain);
    }

    public boolean delete(T domain){
        return db.remove(domain);
    }


}
