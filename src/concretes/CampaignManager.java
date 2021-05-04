package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getDiscount() + " Kadar Kampanya Yapýldý.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya Güncellendi..");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya Silindi.");
		
	}

}
