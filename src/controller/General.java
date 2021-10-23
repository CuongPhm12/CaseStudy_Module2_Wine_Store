package controller;

public interface General<T> {
    void showAll();
    void add(T t);
    void edit(String id,T t);
    void removeById(String id);
    void findById(String id);
    void findByName(String name);
}
