package SurvivalStore;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Importing and reading my CSV file
 * Created by kim on 7/1/2015.
 */
public class CsvReader {
    public static List<Product> readInventory() {

        String csvFile = "Resources/survival_store_inventory";
        BufferedReader br = null;
        String line = "";
        //String cvsSplitBy = ",";
        List<Product> inventory = new ArrayList<Product>();
        List<String> itemList = new ArrayList<>();

        // Break CSV file down into an array of lines
        try {

            br = new BufferedReader(new FileReader(csvFile));
            itemList = new ArrayList<String>();
            br.readLine();
            while ((line = br.readLine()) != null) {
                itemList.add(line);
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // break lines down into an array of components
        for(String item : itemList){
            String[] itemComponents = item.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
//            for(String itemComponent : itemComponents){
//                System.out.println( itemComponent);
//            }

            // Assign components to product variable;
            Product product = new Product();
            product.setName(itemComponents[1]);
            product.setCategory(itemComponents[0]);
            product.setPrice(Double.parseDouble(
                    itemComponents[2].replace(",","").replaceAll("\"","").substring(1)));
            product.setQuantity(Integer.parseInt(itemComponents[3]));


            // add Product to inventory
            inventory.add(product);
        }


        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inventory;
    }


}

