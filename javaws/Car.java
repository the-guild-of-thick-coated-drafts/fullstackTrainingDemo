public class Car {
    static int carCount =0 ;
    private int price, mileage, speed;

    //static methods needs to call the static varaibles
    //instance method can call static variables.
    static int  GetCarCount(){
        return carCount;
    }
    void incCarCount(){
        carCount++;
    }
    Car(){
        this(2500,15,100);
        System.out.println("constructor chaining");
    }

    Car(int price){
        System.out.println("single parameter called");
        this.price = price;
        incCarCount();
    }
    Car( int price, int mileage, int speed){
        System.out.println("THREE parameter called");
        this.price = price;
        this.mileage = mileage;
        this.speed = speed;
        incCarCount();
        
    }
public String toString(){
    String str;
    str = "price :"+ price + 
          " mileage "+ mileage + " speed "+ speed;
    return str;
}
public static void main( String[] args){
    Car c1;
    c1 = new Car(3000);
    System.out.println(c1.toString());
    Car c3;
    c3 = new Car(4000,20,200);
    System.out.println(c3.toString());

    Car c0 = new Car();
    System.out.println(c0.toString());
    
    System.out.println(" Number of Cars created " + 
        Car.GetCarCount());
    //Array of cars
    Car[] carArray = new Car[5];
    carArray[0] = new Car();
    carArray[1] = new Car();
    carArray[2] = new Car(5000);
    carArray[3] = new Car(6000,45,300);
    carArray[4] = new Car(7000,77,777);
    System.out.println(" display the array data");
    for( Car c : carArray)
        System.out.println(c.toString());
    
    System.out.println(" Number of Cars created " + 
        Car.GetCarCount());


}

}