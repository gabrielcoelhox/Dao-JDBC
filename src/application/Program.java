package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		// Procurar vendedor pelo ID
		System.out.println("=== Teste 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		// Procurar vendedor pelo departamento
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		// Listar todos os vendedores
		System.out.println("\n=== TEST 3: seller findByAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		// Inserir um vendedor
		System.out.println("\n=== TEST 4: seller Insert ===");
		Seller newSeller = new Seller(null, "Gaviria", "gaviria@gmail.com", new Date(), 5000.0, department);
		sellerDao.insert(newSeller);

		System.out.println("Inserted! New id = " + newSeller.getId());

		// Update de um vendedor
		System.out.println("\n=== TEST 5: seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Delay Dantas");
		seller.setBaseSalary(6000.0);
		sellerDao.update(seller);
		System.out.println("Update complete!");
		
		// Update de um vendedor
		System.out.println("\n=== TEST 6: seller Delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}
}
