package hexweb.services;
public class Product{
  private int id;
  private String name;
  private float price;

  Product(int argId, String argName,float argPrice){
    this.id = argId;
    this.name = argName;
    this.price = argPrice;
  }
 
  Product(){
  }
  public int getId(){ return id;}
  public void setId( int id){ this.id = id;}
  public String getName(){return name;}
  public void setName(String name ){this.name = name;}
  public float getPrice(){return price;}
  public void setPrice(float price){this.price = price;}

  public String toString(){
    String str = "Id is "+ id + "name is " + name + 
                 "price is "+ price;
    return str;
  }
}