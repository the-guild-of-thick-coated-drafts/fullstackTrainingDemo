package hw.service;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

import hw.model.Country;
import hw.service.CountryDetails;
import hw.model.Status;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/countries")
public class CountryRestService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountries()
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();
		return listOfCountries;
	}

	@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id") int id)
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();;

		for (Country country: listOfCountries) {
			if(country.getId()==id)
				return country;
		}
		
		return null;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response  insertOneCountry(Country cty) {
		System.out.println("this is insert one country ");
			System.out.println("input arg" + cty);
		CountryDetails cd = new CountryDetails();
		Country ctnew = cd.insertOneCountry( cty.getId(),cty.getCountryName());
		System.out.println( ctnew );
		Status s = new Status();
		s.setSt("success");
        return Response.status(200).entity(s).build();
		//return ctnew;
	}
	/*
		public String postworks(){
		String str = "{\"id\":\"1\", \"name\":\"hello\"}";
		System.out.println("this is plain text");
		//String str = "Hello it woriks";
		return str;
	}
	*/
// pass only country name via postman and set the id inside the method
/*
	@PUT
    @Path("/{id}")
 	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Country  updateCountry(@PathParam("id") int id,Country cty) {
		System.out.println("id is "+ id);
			CountryDetails cd = new CountryDetails();
		cty.setId(id);

		Country ctnew = cd.updateCountry( cty.getId(),cty.getCountryName());
		System.out.println(ctnew);
		return ctnew;
	}
*/
	@POST
    @Path("/{id}")
 	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Country  updateCountry(@PathParam("id") int id) {
	
		System.out.println("xxx post id" + id);
		return null;
	}

// Utiliy method to create country list.
	public List<Country> createCountryList()
	{
		
		CountryDetails cd = new CountryDetails();
		List<Country>listOfCountries= cd.getCountryList();
        
        for ( Country a : listOfCountries){
        	System.out.println(a);
        }
		return listOfCountries;
	}
}
