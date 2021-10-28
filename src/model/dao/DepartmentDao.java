package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);         // Inserir no BD o obj que for passado como parâmetro
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);     // Consultar no BD um obj com esse id
	
	List<Department> findAll();
}
