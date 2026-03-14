package edu.ijse.layered.fx.orm.dao;

import java.util.ArrayList;

public interface CrudDAO<T> extends SuperDAO{

    String save(T t) throws Exception;
    String update(T t) throws Exception;
    String delete(Integer id) throws Exception;
    T search(Integer id) throws Exception;
    ArrayList<T> getAll() throws Exception;

}
