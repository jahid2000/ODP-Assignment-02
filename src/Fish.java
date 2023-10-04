public class Fish extends Pet {
    public Fish(String Name,String ownerName){
        super(Name, ownerName);
    }
    @Override
    public void findName() {
        System.out.println("Eatting");
    }

}