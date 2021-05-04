package concretes;

import java.util.Scanner;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{
	Scanner s = new Scanner(System.in);
	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " Adlý Oyun Eklendi.");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.print("Yeni Oyun Ýsmi Giriniz: ");
		String yeniOyunIsimi = s.nextLine();
		System.out.println(game.getGameName() + " Ýsimli Oyun " + yeniOyunIsimi + " Olarak Güncellendi.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " Ýsimli Oyun Kaldýrýldý.");
		
	}

}
