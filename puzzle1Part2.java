import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class puzzle1part2 {
    public static void main(String[] args) {
        try {
            File fObj = new File("/Users/prajwnag/workspace/AdventOfCode/src/input.txt");
            Scanner myReader = new Scanner(fObj);
            List<Integer> sum = new ArrayList<Integer>();
            int count = 0, data2, data3, increaseCount = 0;
            int data1 = Integer.parseInt(myReader.nextLine());
            data2 = Integer.parseInt(myReader.nextLine());
            while(myReader.hasNextLine()) {//continue only if sums of 3 exist else break
                    data3 = Integer.parseInt(myReader.nextLine());
                sum.add(data1 + data2 + data3);

                data1 = data2;
                data2 = data3;
                count++;
            }
            for(int i = 1; i < count; i++) {
                if(sum.get(i) - sum.get(i-1) > 0 ) {
                    increaseCount++;
                }
            }
            System.out.println(increaseCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
