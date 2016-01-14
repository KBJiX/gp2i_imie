package fr.imie.gp2i.model.DAO;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Marius on 14/01/2016.
 */
public abstract class DAO<T> {

    protected Connection connection = ConnectMySQL.getInstance();

    public abstract List<T> findall();
    public abstract T find(int id);
    public abstract T create(T objet);
    public abstract T update(T objet);
    public abstract void delete(T objet);
}
