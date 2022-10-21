import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileDataManager {

    static Map<String, String> buyerCredentialsList = new HashMap<>();
    static Map<String, String> sellerCredentialsList = new HashMap<>();
    static ClassProductList productsList = new ClassProductList();
    static String currentSessionUsername;

    public static void readBuyerCredentials() {
        try (BufferedReader bufferedReader =
                new BufferedReader(new java.io.FileReader("src/database_files/BuyerInfo.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split(":");
                buyerCredentialsList.put(tokens[0], tokens[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readSellerCredentials() {
        try (BufferedReader bufferedReader =
                new BufferedReader(new java.io.FileReader("src/database_files/SellerInfo.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split(":");
                sellerCredentialsList.put(tokens[0], tokens[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewUser(UserInfoItem userInfoItem){
        FileWriter fileWriter = null;
        try {
            if (userInfoItem.getUserType() == 0) {
                fileWriter = new FileWriter("src/database_files/BuyerInfo.txt", true);
                buyerCredentialsList.put(userInfoItem.getUsername(), userInfoItem.getPassword());
            } else {
                fileWriter = new FileWriter("src/database_files/SellerInfo.txt", true);
                sellerCredentialsList.put(userInfoItem.getUsername(), userInfoItem.getPassword());
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(userInfoItem.getUsername() + ":" + userInfoItem.getPassword());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readProductInfo() {
        try (BufferedReader bufferedReader =
                new BufferedReader(new java.io.FileReader("src/database_files/ProductInfo.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(":");
                productsList.add(new Product(tokens[0], tokens[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewProduct(Product product) {
        try (FileWriter fileWriter = new FileWriter("src/database_files/ProductInfo.txt", true)) {
            productsList.add(product);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(product.getType() + ":" + product.getName());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewProductBid(String productName, double bidPrice) {
        File file = new File("src/database_files/UserProduct.txt");
        try (FileWriter fileWriter = new FileWriter("src/database_files/UserProduct.txt", true)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (file.length() != 0){
                bufferedWriter.newLine();
            }
            bufferedWriter.write(FileDataManager.currentSessionUsername + ":" + productName + ":" + bidPrice);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
