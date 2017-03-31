
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static ArrayList<boisson> ListeBoissons;
	static ArrayList<Integer> ListeMonaies = new ArrayList<Integer>(Arrays.asList(10, 20, 50));
	
	public static void main(String[] args) {
		
		ListeBoissons= new ArrayList<boisson>();
		
		ListeBoissons.add(new boisson(1,"Coca-Cola",100));
		ListeBoissons.add(new boisson(2,"Fanta",80));
		ListeBoissons.add(new boisson(3,"Hamoud",60));
		ListeBoissons.add(new boisson(4,"Pepsi",70));
		ListeBoissons.add(new boisson(5,"Miranda",50));
		ListeBoissons.add(new boisson(6,"Ramy",100));
		
		
		
		System.out.println("Liste des Boissons Disponibles:\n");
		for(boisson b:ListeBoissons){
			System.out.println(String.format("{%s}- %s [%sDA]", b.getId(),b.getNom(),b.getPrix()));
		}
		
		
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		System.out.println("\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
		System.out.println("Entrez votre choix: ");
		sc.nextLine();
		
		sc.close();
	}

}
