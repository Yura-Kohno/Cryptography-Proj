import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File src = new File("src/test.txt");

        String message = new Scanner(src).useDelimiter("\\Z").next();



            String encryptedMessage = EnCrypt.CaesarCipher(message, 3);
            String decryp = EnCrypt.CaesarCipher(encryptedMessage, -3);


            System.out.println("Crypt in: " + encryptedMessage);

            System.out.println("Crypt out: " + decryp);



    }
}