package fr.ensim.info.zoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.ensim.info.zoo.exception.LimiteVisiteurException;
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

}
