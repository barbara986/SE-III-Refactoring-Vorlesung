package refactored;
// Aus Klasse HUman extrahierte Klasse
public class Address {
	public String country;
	public String city;
	public String street;
	public String house;

	public Address() {
	}
	
	public String getFullAddress() {
        StringBuilder result = new StringBuilder();
        return result
                        .append(country)
                        .append(", ")
                        .append(city)
                        .append(", ")
                        .append(street)
                        .append(", ")
                        .append(house).toString();
    }
}