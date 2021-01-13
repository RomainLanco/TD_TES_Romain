package ressources;

import java.util.ArrayList;

public class Panier {

	private ArrayList<Orange> panier = new ArrayList();
	private int maxCont;
	
	public ArrayList<Orange> getPanier() {
		return panier;
	}

	public int getMaxCont() {
		return maxCont;
	}

	public  Panier(int maxCont) {
		this.maxCont = maxCont;
	}
	
	public boolean estPlein() {
		if (panier.size()>=(maxCont)) {
			return true;
		}else return false;
	}
	
	public boolean estVide() {
		if (panier.size()==0) {
			return true;
		}else return false;
	}
	
	public void ajoute(Orange o) {
		
		if(this.estPlein()) {
//			System.out.println("le panier est plein");
		}else {
			this.panier.add(o);
		}
		
	}
	
	public void retire() {
		if(this.estVide()) {
//			System.out.println("le panier est vide");
		}else {
			this.panier.remove(panier.size()-1);
		}
	}
	
	public double getPrix() {
		double s=0;
		for(Orange o : this.getPanier()) {
			s+=o.getPrix();
		}
		return s;
	}
	
	public void boycotteOrigine(String origine) {
		Panier panier2=new Panier(this.maxCont);
		for(int i=0;i<this.panier.size();i++) {
			if(!panier.get(i).getOrigine().equals(origine)) {
				panier2.ajoute(panier.get(i));
			}
		}
		this.panier = panier2.getPanier();
	}
	
	public String toString() {
		String s="le panier contient \n";
		for (Orange o : panier) {
//			s+="une orange d'origine :"+o.getOrigine()+" à "+o.getPrix()+" euros\n";
			s+=o+"\n";
		}
		return s;
	}


	
	public boolean equals(Panier p) {
		boolean test=false;
		if(p.getPanier().size()!=this.panier.size()) {
			return false;
		}
		
		
		
		for(Orange o : p.getPanier()) {
			test=false;
			for(Orange o2 : this.getPanier()) {
				if(o.equals(o2)) {
					test=true; 
					break;
					}
			}
			
			if (!test) return false;

		}
		return true;
		
	}
	
}
