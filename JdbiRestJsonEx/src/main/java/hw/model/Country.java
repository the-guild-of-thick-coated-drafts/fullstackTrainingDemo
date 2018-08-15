package hw.model;

public class Country {
	private int id;
	private String countryName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + "]";
	}
	public Country(int id, String countryName) {
		super();
		this.id = id;
		this.countryName = countryName;
	}
	public Country(){
		
	}
}
