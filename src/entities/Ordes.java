package entities;

import java.util.Date;

import abstracts.Entity;

public class Ordes implements Entity{
	private int id;
	private int customerId;
	private int gameId;
	private int campaignId;
	private Date date;
	
	public Ordes(int id, int customerId, int gameId, int campaignId, Date date) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
