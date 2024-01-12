package repository;

import java.util.List;

public interface IRepository<T>{
    List<T> getList();
    void add(T obj);
    void edit(List<String> stringList);
    void delete(List<String> stringList);
}
