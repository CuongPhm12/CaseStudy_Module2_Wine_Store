package controller;

public interface General<T> {
    void add(T t);
    void edit(int index,T t);
    void remove(int index);
    void save();
    void read();
}
