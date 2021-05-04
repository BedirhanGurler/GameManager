package concretes;

import java.util.Scanner;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService{
	Scanner s = new Scanner(System.in);
	
	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void addCustomer(Customer customer) {
		if(customerCheckService.checkCustomer(customer)) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Ýsimli Kullanýcý Sisteme Kaydedildi.");
		}
		else {
			System.out.println("Böyle Bir Kullanýcý Yok!!!");
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.print("Yeni Ýsim Ve Soyisim Girin: ");
		String yeniBilgi = s.nextLine();
		System.out.println(customer.getFirstName() + " Adlý Kullanýcýnýn Ýsim Ve Soyisim Bilgisi " + yeniBilgi + " Olarak Güncellendi.");
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Ýsimli Kullanýcý Silindi.");
		
	}
	
}
