package Application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Seller seller = sellerDao.findById(2);
		System.out.println("First Test - FindById: ");
		System.out.println(seller);
		
		System.out.println("\nSecound Test - FindByDepartment: ");
		List<Seller> list = new ArrayList<>();
		list = sellerDao.findByDepartment(new Department(1, null));
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
