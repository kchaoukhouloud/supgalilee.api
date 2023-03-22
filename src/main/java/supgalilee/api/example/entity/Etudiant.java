package supgalilee.api.example.entity;

public class Etudiant {
	
	private int identifiant;
	private String nom;
	
	private double moyenne;

	public Etudiant(int identifiant, String nom, double moyenne) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.moyenne = moyenne;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	
	
}
