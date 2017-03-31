/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Tapa Autiomaan
 */
public class Caisse {
    private ArrayList<Integer> ListeMonnaies;
    private int caisse =0;

    public Caisse(ArrayList<Integer> ListeMonnaies) {
        this.ListeMonnaies = ListeMonnaies;
    }
    
    public void encaisser (int prix){ //à l'achat d'une boisson
        this.caisse += prix;
    }

    public void setListeMonnaies(ArrayList<Integer> ListeMonnaies) {
        this.ListeMonnaies = ListeMonnaies;
    }

    
    public void setCaisse(int caisse) { //pour la vider on met caisse=0
        this.caisse = caisse;
    }
    
}
