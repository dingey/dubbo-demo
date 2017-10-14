package com.d.base;

/**
 * @author di
 */
public interface IBaseService<D extends BaseMapper<T>, T extends BaseEntity<T>> {
	T get(long id);
	T get(T t);
	int save(T entity);
}
