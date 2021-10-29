package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		// Procurar departamento pelo ID
		System.out.println("=== Teste 1: department findById ===");
		Department department = departmentDao.findById(3);

		System.out.println(department);

		// Listar todos os departamentos
		System.out.println("\n=== TEST 2: department findByAll ===");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
