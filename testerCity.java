import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CityNotFoundException extends Exception {

	public CityNotFoundException(String message) {

		super(message);
	}
}

class city {

    Map <Integer, String> map;

    city()
    {
        map = new HashMap<>();
        map.put(400019, "Mumbai");
		map.put(700002, "Kolkata");
		map.put(100025, "Delhi");
		map.put(500004, "Hyderabad");
    }

    public String findCityByZipCode(int zipCode) throws CityNotFoundException
    {
        if(map.containsKey(zipCode))
        {
            String value = map.get(zipCode);
            return value;
        }
        else
        {
            throw new CityNotFoundException("City not found");
        }
    }
}

    public class testerCity {

    public static void main(String[] args) throws CityNotFoundException{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the zipcode of the city you want to find : ");
        int zipCode = sc.nextInt();
        city c = new city();
        String city = c.findCityByZipCode(zipCode);
        System.out.println("The city is : " + city);
    }
    
}
