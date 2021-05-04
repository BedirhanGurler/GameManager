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
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " �simli Kullan�c� Sisteme Kaydedildi.");
		}
		else {
			System.out.println("B�yle Bir Kullan�c� Yok!!!");
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.print("Yeni �sim Ve Soyisim Girin: ");
		String yeniBilgi = s.nextLine();
		System.out.println(customer.getFirstName() + " Adl� Kullan�c�n�n �sim Ve Soyisim Bilgisi " + yeniBilgi + " Olarak G�ncellendi.");
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " �simli Kullan�c� Silindi.");
		
	}
	
}
