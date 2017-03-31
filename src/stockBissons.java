import java.util.ArrayList;
import java.util.HashMap;

public class stockBissons {
	
	private HashMap<boisson, Integer> stock;
	ArrayList<boisson> ListeBoissons;


	public stockBissons(HashMap<boisson, Integer> stock, ArrayList<boisson> listeBoissons) {
		super();
		this.stock = stock;
		ListeBoissons = listeBoissons;
	}

	public ArrayList<boisson> getListeBoissons() {
		return ListeBoissons;
	}

	public void setListeBoissons(ArrayList<boisson> listeBoissons) {
		ListeBoissons = listeBoissons;
	}

	public HashMap<boisson, Integer> getStock() {
		return stock;
	}

	public void setStock(HashMap<boisson, Integer> stock) {
		this.stock = stock;
	}

	public void distribuerBoisson(boisson b){
		stock.put(b, stock.get(b)-1);
	}
	
	public void alimenterStock(boisson b,int nbr){
		stock.put(b, stock.get(b)+nbr);
	}

}
