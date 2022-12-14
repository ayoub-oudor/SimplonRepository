package simplonSky.serviceInterface;

import java.util.List;

public interface InterfaceService<T> {
	void save(T items);
	List<T> getAll();
	T getById(long id);
	void update(T items, long id);
	void delete(long id);
}
