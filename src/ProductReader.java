import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductReader {
    public static void main(String[] args) {
        try (Scanner fileReader = new Scanner(new File("ProductTestData.txt"))) {
            System.out.println("ID\t\tName\t\tDescription\t\tCost");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] product = line.split(", ");
                String ID = product[0];
                String Name = product[1];
                String Description = product[2];
                double Cost = Double.parseDouble(product[3]);
                System.out.printf("%s\t\t%s\t\t%s\t\t%.1f\n", ID, Name, Description, Cost);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file: " + e);
        }
    }
}
