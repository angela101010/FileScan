import java.util.Scanner;
import java.io.*;

class Filescan{

    public static void main(String[] args) {
        File f = new File("quiz answers.csv");
        try {
            Scanner input = new Scanner(f);
            
            while(input.hasNext()){
                String str = input.nextLine();
                String[]value = str.split(",");
                if(value[0].equals("Answer Key")) {
                  String[]key = value;
                }
                  int grade = 0;
                  for(int i = 1; i<key.length; i++) {
                      if(value[i].equals(key[i])){
                         grade++;
                        }
                    }
                  System.out.println(value[0]);  
                  System.out.print(grade+"/8");
                
                }
                
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}