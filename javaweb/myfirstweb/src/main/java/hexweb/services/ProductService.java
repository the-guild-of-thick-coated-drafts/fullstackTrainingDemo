package hexweb.services;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import java.util.List;
import java.util.ArrayList;

@Path("/product")
public class ProductService{
  
  static List<Product> products = new ArrayList<Product>();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Product> getAllProducts(){
    return products;
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Product getProductGivenArrayIndex(
    @PathParam("id") int id  ){
      Product p = products.get(id);
      return p;
    }




  @POST
  @Path("/add")
  @Produces(MediaType.APPLICATION_JSON)
  public Response addProduct(
    @FormParam("id") int id,
    @FormParam("name") String name,
    @FormParam("price") float price ){

      Product p = new Product ( id, name, price );
      products.add(p);
      
       //     String str = " You have added new product "+ p;
      return Response.status(200).entity( p ).build();
    }  

  @POST
  @Path("/addjson")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON) 
  public Product addProductJson(Product argPd){
      products.add(argPd);
      System.out.println(argPd);
      return argPd;    
    }

}