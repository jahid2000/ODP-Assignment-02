public class Cat extends Pet {
    public Cat(String Name,String ownerName){
        super(Name, ownerName);
    }
    @Override
    public void findName() {
        System.out.println("Feeding");
    }
}
