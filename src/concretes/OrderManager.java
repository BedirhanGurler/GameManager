package concretes;

import abstracts.OrderService;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class OrderManager implements OrderService{

	@Override
	public void getOrder(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " Ýsimli Oyun " + customer.getFirstName() 
		+ " Ýsimli Kullanýcýya " + game.getGamePrice(campaign) + " Fiyatýyla Satýldý.");
		
	}

}
