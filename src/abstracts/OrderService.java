package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public interface OrderService {
	void getOrder(Customer customer, Game game, Campaign campaign);
}
