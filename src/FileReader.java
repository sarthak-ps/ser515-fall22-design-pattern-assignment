import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReader {

    static Map<String, String> buyerCredentialsList = new HashMap<>();
    static Map<String, String> sellerCredentialsList = new HashMap<>();

    public static void readBuyerCredentials() {
        try (BufferedReader bufferedReader =
                new BufferedReader(new java.io.FileReader("src/BuyerInfo.txt"))){
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
                new BufferedReader(new java.io.FileReader("src/SellerInfo.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split(":");
                sellerCredentialsList.put(tokens[0], tokens[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
