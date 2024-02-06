//Ashley Gutierrez Carreto
//Janaury 31st, 2024
//Patron Class
//Contains the varaibles of the given Patron such ad theri address, name, 
//library card. There are also accesor methods. 
public class Patron 
{
    private String name;
    private int libraryCardNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public Patron(String newName, int newLibraryCardNumber, 
    String newStreetAddress, String newCity, String newState, String newZipCode) 
    {
        name = newName;
        libraryCardNumber = newLibraryCardNumber;
        streetAddress = newStreetAddress;
        city = newCity;
        state = newState;
        zipCode = newZipCode;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLibraryCardNumber()
    {
        return libraryCardNumber;
    }
    public String getStreetAddress()
    {
        return streetAddress;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
    public String getZipCode()
    {
        return zipCode;
    }
}