public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Coco", "James");
        Cat cat=new Cat("Rockey","Willams");
        Fish fish=new Fish("Illisha","Bangladesh");
        PetSystem petSystem=new PetSystem();
        petSystem.addPetToSystem(dog);
        petSystem.addPetToSystem(cat);
        petSystem.addPetToSystem(fish);
        petSystem.getPetSystemInformatin();
    }
}
