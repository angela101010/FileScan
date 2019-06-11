import java.util.Scanner;
import java.io.*;

class Filescan{

    public static void main(String[] args) {
        File f = new File("quiz answers.csv");
        try {
            Scanner input = new Scanner(f);
            String[] key = null;
            input.nextLine();
            while(input.hasNext()){
                String str = input.nextLine();
                String[] value = str.split(",");
                
                if(value[0].equals("Answer Key")) {
                    key = value;
                    
                }
                   int grade = 0;
                for(int i = 1; i< value.length; i++) {
                    if(value[i].equals(key[i])){
                        grade++;
                    }
                }
                System.out.println(value[0]+":");  
                System.out.println(grade+"/8");

            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}