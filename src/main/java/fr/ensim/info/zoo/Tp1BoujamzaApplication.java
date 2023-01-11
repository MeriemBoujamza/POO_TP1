package fr.ensim.info.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.ensim.info.zoo.exception.LimiteVisiteurException;
import fr.ensim.info.zoo.model.Animal;
import fr.ensim.info.zoo.model.TypeAnimal;
import fr.ensim.info.zoo.model.Zoo;

@SpringBootApplication
public class Tp1BoujamzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1BoujamzaApplication.class, args);
		
		
		Zoo zoo =  new Zoo(2 );
		
		zoo.ajouterSecteur(TypeAnimal.chien);
		
		zoo.ajouterSecteur(TypeAnimal.chat);
		
		try {
			zoo.nouveauVisiteur();
		} catch (LimiteVisiteurException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("le nombre des visiteurs pour le moment: "+ zoo.getVisiteurs());
		
		Animal a1 = new Animal("lulu", TypeAnimal.chat);
		Animal a2 = new Animal("eggy", TypeAnimal.chien);
		
		zoo.nouvelAnimal(a1);
		zoo.nouvelAnimal(a2);

		System.out.println("le nombre des animaux " + zoo.nombreAnimaux());

	}

}
