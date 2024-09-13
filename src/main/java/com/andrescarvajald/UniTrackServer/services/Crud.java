package com.andrescarvajald.UniTrackServer.services;

import java.util.List;

public interface Crud<T> {
    public List<T> getAll();
    public T create(T t);
    public T update(int id, T t);
    public void delete(T t);
}
