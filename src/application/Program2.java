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
		System.out.println("=== Teste 1: findById ===");
		Department department = departmentDao.findById(3);

		System.out.println(department);

		// Listar todos os departamentos
		System.out.println("\n=== TEST 2: findByAll ===");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

//		// Inserir um departamento
//		System.out.println("\n=== TEST 3: Insert ===");
//		Department newDepartment = new Department(null, "Food");
//		departmentDao.insert(newDepartment);
//
//		System.out.println("Inserted! New id = " + newDepartment.getId());

		// Update de um departamento
		System.out.println("\n=== TEST 4: Update ===");
		department = departmentDao.findById(1);
		department.setName("Smartphones");
		departmentDao.update(department);
		System.out.println("Update complete!");

		// Deletar um departamento
		System.out.println("\n=== TEST 5: Delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();
	}
}
