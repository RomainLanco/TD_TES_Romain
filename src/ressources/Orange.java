package ressources;

public class Orange {

	private double prix;
	private String origine;
	
	
	public Orange(double prix, String origine) throws Exception  {
		super();
		if (prix<0) throw new Exception("prix négatif");
		else this.prix = prix;
		
		this.origine = origine;
	}


	public double getPrix() {
		return prix;
	}


	public String getOrigine() {
		return origine;
	}


	


	
	public boolean equals(Orange o) {
		
		if (o.getPrix()==this.prix && o.getOrigine().equals(this.getOrigine())){
			return true;
		}else return false;
	}


	@Override
	public String toString() {
		return "Orange [prix=" + prix + ", origine=" + origine + "]";
	}
	
	
}
