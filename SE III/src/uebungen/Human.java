package uebungen;
// Refactoring technique: Extract Class, Move Method
public class Human {
    private String name;
    private String age;
    // Ganz schön viel Info in einer Klasse. Man kann doch die Adressdaten doch sicher auch in einer eigenen 
    // Klasse bündeln und auch die Methode dahin machen, wo sie am besten hinpasst oder?
    private String country;
    private String city;
    private String street;
    private String house;

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
