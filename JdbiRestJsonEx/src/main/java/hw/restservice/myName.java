package hw.restservice;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;


@Path("/myname")  
public class myName{  
    @GET  
    @Produces("text/html")
    public Response getMyName(  
            @QueryParam	("namekey") String namevalue )  
            {  
   
       String str = "My Name is " + namevalue;  
   
       return Response.status(200)  
        .entity(str)  
        .build();  
    }  
 }  