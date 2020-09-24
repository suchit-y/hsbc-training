package com.practical.service;

import java.util.Scanner;

import com.practical.dao.ProductDao;
import com.practical.entity.Apparel;
import com.practical.entity.Electronics;
import com.practical.entity.FoodItems;

/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class is a service class to invoke implementation class
 *
 */
public class ProductService {
	ProductDao dao;

	public ProductService(ProductDao dao) {
		this.dao = dao;
	}

	public void registerFoodItem() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("id: ");
		int itemId = Integer.parseInt(scanner.nextLine());

		System.out.print("item name: ");
		String itemName = scanner.nextLine();

		System.out.print("unit price: ");
		double unitPrice = Double.parseDouble(scanner.nextLine());

		System.out.print("quantity: ");
		int quantity = Integer.parseInt(scanner.nextLine());

		System.out.print("DOM: ");
		String dateOfManufacture = scanner.nextLine();

		System.out.print("DOE: ");
		String dateOfExpiry = scanner.nextLine();

		System.out.print("vegetarian?: ");
		boolean vegetarian = Boolean.parseBoolean(scanner.nextLine());

		FoodItems fi = new FoodItems(itemId, itemName, unitPrice, quantity, dateOfManufacture, dateOfExpiry,
				vegetarian);

		try {
			dao.register(itemId, fi);
		} catch (RuntimeException e) {
			System.out.println("Food item " + itemId + " exists...");
		}
	}

	public void displayFoodItemList() {
		try {
			dao.display();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public void registerApparel() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("id: ");
		int itemId = Integer.parseInt(scanner.nextLine());

		System.out.print("item name: ");
		String itemName = scanner.nextLine();

		System.out.print("unit price: ");
		double unitPrice = Double.parseDouble(scanner.nextLine());

		System.out.print("quantity: ");
		int quantity = Integer.parseInt(scanner.nextLine());

		System.out.print("size(large/medium/small): ");
		String size = scanner.nextLine();

		System.out.print("material(cotton/wool): ");
		String material = scanner.nextLine();

		Apparel a = new Apparel(itemId, itemName, unitPrice, quantity, size, material);

		try {
			dao.register(itemId, a);
		} catch (RuntimeException e) {
			System.out.println("Apparel " + itemId + " exists...");
		}
	}

	public void displayApparelList() {
		try {
			dao.display();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public void registerElectronics() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("id: ");
		int itemId = Integer.parseInt(scanner.nextLine());

		System.out.print("item name: ");
		String itemName = scanner.nextLine();

		System.out.print("unit price: ");
		double unitPrice = Double.parseDouble(scanner.nextLine());

		System.out.print("quantity: ");
		int quantity = Integer.parseInt(scanner.nextLine());

		System.out.print("warranty: ");
		int warranty = Integer.parseInt(scanner.nextLine());

		Electronics a = new Electronics(itemId, itemName, unitPrice, quantity, warranty);

		try {
			dao.register(itemId, a);
		} catch (RuntimeException e) {
			System.out.println("Electronics " + itemId + " exists...");
		}
	}

	public void displayElectronicsList() {
		try {
			dao.display();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	public void displayByQuantity(int limit) {
		try {
			dao.displaySortedQuantity(limit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
