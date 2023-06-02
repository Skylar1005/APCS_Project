import java.io.*;
import java.util.*;
public class starter {
    //probelm currently finding the row and column so that values[0] matches the name and not all the names
  public static void main(String[] args) {
    String file = "loldle.csv";
    BufferedReader reader = null;
    int rand = (int)(Math.random() * 165) + 1;
    try{
        reader = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(System.in);
        String ln = "";
        int counter = 0;
        String[] arr = new String[8];
        int lineIndex = 1;
        boolean done = false;
        while(done == false){
            while((ln = reader.readLine()) != null){
                if(lineIndex == rand){
                    String str = ln;
                    String demarcation = ",";
                    int startIndex = 0, endIndex;
                    endIndex = str.indexOf(demarcation, startIndex);
                    while(endIndex != -1){
                        String parts = str.substring(startIndex, endIndex);
                        arr[counter] = parts;
                        startIndex = endIndex + 1;
                        endIndex = str.indexOf(demarcation, startIndex);
                        counter++;
                    }
                    String parts = str.substring(startIndex);
                    arr[counter] = parts;
                    done = true;
                }
                lineIndex++;
            }
        }
        done = false;
        int sum = 0;
        ln = "";
        counter = 0;
        int counter2 = 0;
        lineIndex = 1;
        String[] total = new String[9];
        String champion = "";
        ArrayList<String> champions = new ArrayList<>();
        System.out.println("Welcome to LOLDLE a wordle based on League Of Legends!");
        while(done == false){
            total = new String[9];
            Scanner input = new Scanner(new File("loldle.csv"));
            champions = new ArrayList<>();
            input.useDelimiter(",|\n");
            while(input.hasNext()){
                champion = input.next();
                champions.add(champion);
            }
            System.out.println("State a champion!:");
            String name = sc.nextLine();
            for(int i = 0; i < champions.size(); i++){
                if(name.equals(champions.get(i))){
                    sum = counter + 8;
                    for(int l = counter; l < sum; l++){
                        total[counter2] = champions.get(l);
                        counter2++;
                    }
                }
                counter++;
            }
            if(arr[0].equals(total[0])){
                done = true;
                System.out.println("You Finished the LOLDLE!");
                break;
            }
            if(arr[1].equals(total[1])){
                System.out.println("Gender = correct   Gender = " + total[1]);
            }
            if(!arr[1].equals(total[1])){
                System.out.println("Gender = incorrect   Gender = " + total[1]);
            }
            if(arr[2].equals(total[2])){
                System.out.println("Position = correct   Position = " + total[2]);
            }
            if(!arr[2].equals(total[2])){
                System.out.println("Position = incorrect   Position = " + total[2]);
            }
            if(arr[3].equals(total[3])){
                System.out.println("Species = correct   Species = " + total[3]);
            }
            if(!arr[3].equals(total[3])){
                System.out.println("Species = incorrect   Species = " + total[3]);
            }
            if(arr[4].equals(total[4])){
                System.out.println("Resource = correct   Resource = " + total[4]);
            }
            if(!arr[4].equals(total[4])){
                System.out.println("Resource = incorrect Resource = " + total[4]);
            }
            if(arr[5].equals(total[5])){
                System.out.println("Rangetype = correct   Rangetype = " + total[5]);
            }
            if(!arr[5].equals(total[5])){
                System.out.println("Rangetype = incorrect Rangetype = " + total[5]);
            }
            if(arr[6].equals(total[6])){
                System.out.println("Region = correct   Region = " + total[6]);
            }
            if(!arr[6].equals(total[6])){
                System.out.println("Region = incorrect   Region = " + total[6]);
            }
            if(arr[7].equals(total[7])){
                System.out.println("Release year = correct   Release year = " + total[7]);
            }
            if(!arr[7].equals(total[7])){
                System.out.println("Release year = incorrect   Release year = " + total[7]);
            }
            champions.clear();
            counter = 0;
            counter2 = 0;
            champion = "";
            sum = 0;
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        try{
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
  }
}