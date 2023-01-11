package fr.ensim.info.zoo.model;

public class Animal {
	
	protected String nomAnimal ;
	private TypeAnimal typeAnimal;
	
	
	
	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}
	public String getNomAnimal() {
		return nomAnimal;
	}
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	
	
	

}
