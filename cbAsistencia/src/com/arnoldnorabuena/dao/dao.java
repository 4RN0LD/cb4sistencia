package com.arnoldnorabuena.dao;

import java.util.List;

/**
 *
 * @author Arnold Alfredo Norabuena Aranda
 * @version 1.0
 * @param <T>
 */
public interface dao<T> {
    public int insert(T object);
    public int update(T object);
    public int delete(T object);
    public List<T> selectAll();
    public T selectBy(T object);
}
