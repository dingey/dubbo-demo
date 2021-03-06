package com.d.base;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.d.base.SqlProvider.Id;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author d
 */
public abstract class BaseService<D extends BaseMapper<T>, T extends BaseEntity<T>> implements IBaseService<D, T>{
	@Autowired
	protected D mapper;
	private T entity;
	private Class<T> entityClass;
	private Field entityId;

	public T get(long id) {
		T t = newEntity();
		if (t != null) {
			t.setId(id);
			return this.get(t);
		} else {
			return null;
		}
	}

	public T get(T t) {
		return mapper.get(t);
	}

	public List<T> findAll() {
		return mapper.findAll(getEntity());
	}

	public PageInfo<T> findAllPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<T> datas = findAll();
		return new PageInfo<>(datas);
	}

	public List<T> findByIds(Iterable<Long> ids) {
		StringBuilder sql = new StringBuilder("SELECT * FROM ");
		sql.append(SqlProvider.camel2Underline(getEntityClass().getSimpleName()));
		sql.append(" WHERE ").append(SqlProvider.camel2Underline(getEntityId().getName())).append(" IN(");
		if (ids == null || !ids.iterator().hasNext()) {
			sql.append(0).append(",");
		} else {
			for (Long id : ids) {
				sql.append(id).append(",");
			}
		}
		sql.deleteCharAt(sql.length() - 1).append(")");
		return mapper.findBySql(sql.toString());
	}

	public int countAll() {
		return mapper.countAll(getEntity());
	}

	public int save(T entity) {
		if (entity.isNewRecord()) {
			return mapper.insert(entity);
		} else {
			return mapper.update(entity);
		}
	}

	public int delete(long id) {
		T t = newEntity();
		if (t != null) {
			t.setId(id);
			return mapper.delete(t);
		} else {
			return 0;
		}
	}

	public int delete(T entity) {
		return mapper.delete(entity);
	}

	private T getEntity() {
		if (entity != null) {
			return entity;
		} else {
			this.entity = newEntity();
		}
		return entity;
	}

	private T newEntity() {
		try {
			return this.getEntityClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private Class<T> getEntityClass() {
		if (this.entityClass == null) {
			this.entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
					.getActualTypeArguments()[1];
		}
		return entityClass;
	}

	private Field getEntityId() {
		if (entityId == null) {
			for (Field f : SqlProvider.getFields(getEntityClass())) {
				if (f.isAnnotationPresent(Id.class)) {
					entityId = f;
					break;
				}
			}
		}
		return entityId;
	}
}
