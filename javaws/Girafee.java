public class Girafee extends Animal {

    String animalType;
    
    Girafee(String animalType){
        super();
        this.animalType = animalType;
        System.out.println("GIRAFEE-assigning only animaltype");
    }
    Girafee(){
        System.out.println("GIRAFEE - No args is called");
    }

    @Override
    public void run(){
        System.out.println("Giraffee runs faster");
    } 

    public void GirafeesSpFn(){
        System.out.println("Giraffee special fn"); 
    }
    @Override
    public void sleep(){
        System.out.println("GG sleep");
    }
}