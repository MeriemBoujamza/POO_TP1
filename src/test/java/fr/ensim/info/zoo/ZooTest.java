package fr.ensim.info.zoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.ensim.info.zoo.exception.LimiteVisiteurException;
import fr.ensim.info.zoo.model.Animal;
import fr.ensim.info.zoo.model.TypeAnimal;
import fr.ensim.info.zoo.model.Zoo;

class ZooTest {

	@Test
	void testErrorThrow() {
		Zoo zoo = new Zoo(20);
		
		
		LimiteVisiteurException thrown = Assertions.assertThrows(LimiteVisiteurException.class, () -> {
			zoo.nouveauVisiteur();
		});
		
		Assertions.assertEquals("nombre de visiteurs a exceder la capacite max", thrown.getMessage());
	}
	
	
	@Test
	void testBonSecteur() {
		Zoo zoo = new Zoo(20);
		zoo.ajouterSecteur(TypeAnimal.chat);
		zoo.ajouterSecteur(TypeAnimal.chien);
		
		Animal a1 = new Animal("lulu", TypeAnimal.chat);
		
		zoo.nouvelAnimal(a1);
		

		
		
		
		Assertions.assertEquals(zoo.getSecteur(TypeAnimal.chat).getNombreAnimaux(), 1);
	}

}
