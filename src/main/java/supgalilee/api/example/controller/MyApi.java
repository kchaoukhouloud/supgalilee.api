package supgalilee.api.example.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import supgalilee.api.example.entity.Etudiant;

@RestController
public class MyApi {
	
	public static ArrayList<Etudiant> liste = new ArrayList<>();
	
	static {
		liste.add(new Etudiant(0,"Koussay",19) );
		liste.add(new Etudiant(1,"Khouloud",19) );
		liste.add(new Etudiant(2,"Maryem",19.5) );
		liste.add(new Etudiant(3,"Ikram",18) );

	}
	
	@GetMapping(value="/getAllEtudiant")
	public ArrayList<Etudiant> getAllEtudiant() {
		return liste;
	}
	
	// Get renvoie d'une ressource
	// POST créer une nouvelle ressource
	// PUT modifier une resource
	// DELET supprimer une ressource
	
	@GetMapping(value="/getEtudiant")
	public Etudiant getEtudiantById(int identifiant) {
		return liste.get(identifiant);
	}
	

	@PostMapping(value="/addEtudiant")
	public Etudiant addEtudiant(Etudiant etudiant){
		liste.add(etudiant) ;
		return etudiant;}
	
	@DeleteMapping(value="/deleteEtudiant")
	public void deleteEtudiant(int identifiant){
		liste.remove(identifiant) ;
		System.out.println("etudiant supprimé avec succès");}
	
	@PutMapping(value="/modifierEtudiant")
	public void deleteEtudiant(int identifiant, String nom){
		liste.get (identifiant).setNom(nom) ;
		}
	
	@GetMapping(value="/b")
	public String bonjour() {
		return "Bonjour!";
	}

	
	@GetMapping(value="/bn")
	public String bonsoir() {
		return "Bonsoir!";
	}
	
	@GetMapping(value="/etudiant")
	public Etudiant getEtudiant() {
		return new Etudiant(1,"Khouloud",19);
	}
	
	@GetMapping(value="/somme")
	public double somme(double a, double b){
		return a+b; 
	}
}
