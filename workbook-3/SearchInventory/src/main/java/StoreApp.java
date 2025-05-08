import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();

    }

    public static List<Product> getInventory(){


       List<Product> inventory = new ArrayList<>();

       try {
           BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

           String line;

           while((line = bufferedReader.readLine()) != null)

           String[] parts = line.split("\\|")

           int id = Integer.parseInt(parts[0]);

           bufferedReader.close();

       } catch (Exception e) {

           System.out.println("File could not be read");

       }

        // we put code here

        return inventory;

    }

    public static void listAllProducts(List<Product> productsList){

        System.out.println("We carry the following inventory");

        for (Product product : productsList){

            System.out.println(product);

        }
    }


}
