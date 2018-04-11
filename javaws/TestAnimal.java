public class TestAnimal{


    public static void main( String[] args){
        Girafee g1 = new Girafee("wildAnimal");
        g1.setName("brownie");
        System.out.println(g1.getName());
        g1.run();
        g1.eat(" leaves");
        g1.GirafeesSpFn();
        g1.sleep();

        Animal a1 = new Girafee("zooAnimal");
        a1.setName(" wowow ");
        System.out.println(a1.getName());
        a1.run();
        a1.eat(" bananas");
        a1.sleep();


    }
}