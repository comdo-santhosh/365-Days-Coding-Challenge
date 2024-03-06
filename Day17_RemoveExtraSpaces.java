import java.util.ArrayList;
import java.util.Arrays;

public class Day17_RemoveExtraSpaces {
    public static void main(String[] args) {
        String str =  "        Coding                is           fun";
    //    String word[] =  str.trim().split("\\s+");
    //    for (String string : word) {
    //     System.out.print(string+" ");
    //    }

    boolean inword = false;
    int startIndex = 0;
    ArrayList<String> wordList = new ArrayList<>();
    for(int i = 0 ; i  < str.length(); i++)
    {
        char currentChar = str.charAt(i);
        if(Character.isWhitespace(currentChar)){
            if(inword){
                String word = str.substring(startIndex,i);
                wordList.add(word);
                inword = false;
            }
        }else{
            if(!(inword)){
                startIndex = i;
                inword = true;
            }
        }
    }
        if(inword){
            String lastword = str.substring(startIndex);
            wordList.add(lastword);
        }

        for(String result : wordList){
            System.out.print(result+" ");
        }

    }

    }    
