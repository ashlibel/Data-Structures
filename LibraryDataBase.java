//Ashley Gutierrez Carreto
//January 29, 2024
//Lab 1 Introductory Java Refresher with ArrayList
//This code cotnain an array that holds infromation about 10 members who 
//use the library. The following information is provided by each Patron which 
//are name, library card number, Street Address, City, State, and Zipcode.
import java.util.ArrayList;

public class LibraryDataBase 
{
    public static void main(String[] args) 
    {
       
        ArrayList<Patron> patronList = new ArrayList<Patron>();
        //Instantiate the ArrayList 
        //(Help provided in the textbook with page 309)

        // 10 patrons created by using the .add method provided with the 
        //ArrayList
        patronList.add(new Patron("Ryan Cubas", 483298, "8146 Meadow Lane", "Brooklyn", "NY", "11237"));
        patronList.add(new Patron("Liseth Bravo", 759013, "136 W. Lantern Street", "Brooklyn", "NY", "10002"));
        patronList.add(new Patron("Idabelle Gutierrez", 375927, "671 San Juan St.", "New York", "NY", "10002"));
        
        
        for (int i = 0; i < patronList.size(); i++) 
        {
            Patron currentPatron = patronList.get(i);
            System.out.println(currentPatron.getName() + " " 
                     + currentPatron.getLibraryCardNumber());
        }
        patronList.remove(2);//remove index 2

        patronList.add(new Patron("Luna Garcia", 901385, "686 Shore St.", "Bronx", "NY", "10468"));
        patronList.add(new Patron("Joaquin Rodriguez", 228610, "665 Wagon St", "Forest Hills", "NY", "11375"));
        patronList.add(new Patron("Franco Escamilla", 519372, "43 Marsh St.", "Freeport", "NY", "11520"));
        patronList.add(new Patron("Russ Vitale", 419740, "7 Branch Rd.", "Bronx", "NY", "10460"));

        
        for (int i = 0; i < patronList.size(); i++) 
        {
            Patron currentPatron = patronList.get(i);
            System.out.println(currentPatron.getName() + " " 
                     + currentPatron.getLibraryCardNumber());
        }
        patronList.remove(4);//removes index 4
        
        patronList.add(new Patron("Erykah Badu", 872345, "9 Central Drive", "Corona", "NY", "11368"));
        patronList.add(new Patron("Lauryn Hill", 234674, "33 Greenview St.", "Rome", "NY", "13440"));
        patronList.add(new Patron("Ali Gatie", 724943, "86 Alton St.", "Woodside", "NY", "11377"));  
        
        for (int i = 0; i < patronList.size(); i++) 
        {
            Patron currentPatron = patronList.get(i);
            System.out.println(currentPatron.getName() + " " 
                     + currentPatron.getLibraryCardNumber());
        }
        patronList.remove(7);//removes index 7
 
    }
    
    public static void displayPatronList(ArrayList<Patron> patrons) 
    {
        for (Patron patron : patrons) 
        {
            System.out.println("Name: " + patron.getName());//prints name
            System.out.println("Library Card Number: " 
                             + patron.getLibraryCardNumber());
                             //prints card name
        }
    }
    
   
}