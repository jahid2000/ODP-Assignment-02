import java.util.ArrayList;
public class PetSystem {
    private ArrayList<Pet> pets;
    public PetSystem(){
        pets=new ArrayList<>();

    }
    public void addPetToSystem(Pet pet){
        pets.add(pet);
    }
    public void getPetSystemInformatin(){
        for ( Pet pet:pets){
            System.out.println("Pet Name: "+pet.getName()+" Owner Name: "+pet.getOwnerName());
            pet.findName();
        }
    }
}
