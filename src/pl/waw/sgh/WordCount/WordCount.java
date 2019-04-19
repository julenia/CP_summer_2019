package pl.waw.sgh.WordCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        String path="C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\Australia_dingo_attack.txt";
        File file = new File(path);
        Scanner fileScanner = new Scanner(file);
        Map<String, Integer> myMapWord=new HashMap<>();
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            line = line.toLowerCase();
            line = line.replace(".","");
            line = line.replace(",","");
            line=line.replace("-","");
            line=line.replace("?","");
            line=line.replace("'","");
            line=line.replace("\"","");
            line=line.replace("/","");
            line=line.replace(":","");


            String[] words = line.split(" ");

            for(String word : words){
                if(myMapWord.containsKey(word)){
                    myMapWord.put(word, myMapWord.get(word)+1);
                }
                else{
                    myMapWord.put(word,1);
                }
            }

        }
        for(String k:myMapWord.keySet()){
            System.out.println(k+" : "+ myMapWord.get(k));
        }


    }
}
