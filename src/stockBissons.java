import java.util.HashMap;

public class stockBissons {
	
	private HashMap<String, Integer> stock; 
	
	
	
	
	public stockBissons(HashMap<String, Integer> stock) {
		this.stock = stock;
	}

	public HashMap<String, Integer> getStock() {
		return stock;
	}

	public void setStock(HashMap<String, Integer> stock) {
		this.stock = stock;
	}

	private void distribuerBoisson(String boisson){
		stock.put(boisson, stock.get(boisson)-1);
	}
	
	private void alimenterStock(String boisson){
		stock.put(boisson, stock.get(boisson)+1);
	}

}
