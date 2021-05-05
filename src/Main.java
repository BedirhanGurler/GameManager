import adapters.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.CustomerManager;
import concretes.GameManager;
import concretes.OrderManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;
import entities.Ordes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "bgurler001@gmail.com", "12345", "Bedirhan", "Gürler", 2001, "11120071610");
		/*customerManager.addCustomer(customer);
		customerManager.deleteCustomer(customer);*/
		
		GameManager gameManager = new GameManager();
		Game game = new Game(1, "GTA 5", 260);
		//gameManager.addGame(game);
		//gameManager.updateGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Bahar Kampanyasý", 1 , true);
		//campaignManager.addCampaign(campaign);
		
		OrderManager orderManager = new OrderManager();
		orderManager.getOrder(customer, game, campaign);

	}

}
