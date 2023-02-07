import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProductWriter {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        String ID = "";
        String Name = "";
        String Description = "";
        double Cost;

        ID = SafeInput.getRegExString(UserInput, "Enter your ID Number: ", "(M|m\\d{8})");

        Name = SafeInput.getNonZeroLenString(UserInput , "What is your name: ");

        Description = SafeInput.getNonZeroLenString(UserInput , "Enter a Description: ");

        Cost = SafeInput.getDouble(UserInput, "Enter the cost: ");


        try (PrintWriter fileWriter = new PrintWriter(new File("ProductTestData.txt"))) {
            fileWriter.println(ID + ", " + Name + ", " + Description + ", " + Cost);
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e);
        }
    }
}











