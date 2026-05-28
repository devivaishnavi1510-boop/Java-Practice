import java.io.*;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            try (FileWriter fw = new FileWriter("names.txt")) {
                System.out.println("Enter 5 names:");

                for (int i = 1; i <= 5; i++) {
                    String name = sc.nextLine();
                    fw.write(name + "\n");
                }
            }

            
            try (BufferedReader br = new BufferedReader(new FileReader("names.txt"))) {
                String line;
                System.out.println("\nNames stored in file:");

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
    
}
