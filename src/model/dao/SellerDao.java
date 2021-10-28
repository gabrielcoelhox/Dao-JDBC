package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);         // Inserir no BD o obj que for passado como par�metro
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);     // Consultar no BD um obj com esse id
	
	List<Seller> findAll();
}
