import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class puzzle1part1 {
    public static void main(String[] args) {
        try {
            File fObj = new File("/Users/prajwnag/workspace/AdventOfCode/src/input.txt");
            Scanner myReader = new Scanner(fObj);
            int count = 0, data2;
            int data1 = Integer.parseInt(myReader.nextLine());
            while(myReader.hasNextLine()) {
                data2 = Integer.parseInt(myReader.nextLine());
                if(data2 - data1 > 0) {
                    //increased
                    count++;
                }
                data1 = data2;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
