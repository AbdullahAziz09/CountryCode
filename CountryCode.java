import java.util.Scanner;
import java.util.HashMap;

public class CountryCode {
    
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<>();

        countries.put("PK", "Pakistan");
        countries.put("IN", "India");
        countries.put("UK", "United Kingdom");
        countries.put("USA", "United States Of America");

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter CountryCode eg: PK ");
        String code = sc.nextLine().toUpperCase();

        if (countries.containsKey(code)) {
            System.out.println("Country:  " + countries.get(code));
        }else{
            System.out.println("Code not Found");
        }
    }

}
