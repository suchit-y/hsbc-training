package com.practical.view;

import java.util.Scanner;

import com.practical.dao.ProductDao;
import com.practical.service.ProductFactoryMethod;
import com.practical.service.ProductService;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a user interaction interface
 *
 */
public class ProductApplicatioin {

	public static void main(String[] args) {

		System.out.print("Enter product category(food items/apparel/electronics): ");

		Scanner scanner = new Scanner(System.in);
		String category = scanner.nextLine();

		ProductDao dao = ProductFactoryMethod.connectProduct(category);
		ProductService ps = new ProductService(dao);

		boolean menu = true;
		int option;

		do {
			System.out.println();
			System.out.print("Enter option (1-register, 2-display, 3-display by quantity 4-exit): ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				if (category.equals("food items"))
					ps.registerFoodItem();
				else if (category.equals("apparel"))
					ps.registerApparel();
				else if (category.equals("electronics"))
					ps.registerElectronics();
				break;
			case 2:
				if (category.equals("food items"))
					ps.displayFoodItemList();
				else if (category.equals("apparel"))
					ps.displayApparelList();
				else if (category.equals("electronics"))
					ps.displayElectronicsList();
				break;
			case 3:
				ps.displayByQuantity(3);
				break;
			case 4:
				menu = false;
				break;
			}
		} while (menu);
	}

}
