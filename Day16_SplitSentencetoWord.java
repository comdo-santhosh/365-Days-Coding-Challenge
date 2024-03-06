import java.util.ArrayList;

public class Day16_SplitSentencetoWord {


    public static String[] splitsstring(String str) {
        
        int startIndex = 0;
        boolean isword = false;
        ArrayList<String> wordlist = new ArrayList<>();
        
        for(int i = 0 ; i  < str.length(); i++ ){
            char currentChar = str.charAt(i);
            if(Character.isWhitespace(currentChar)){
                if(isword){
                String word = str.substring(startIndex, i);
                wordlist.add(word);
                isword = false;
            }
        }else{
            if(!(isword)){
                startIndex = i;
                isword = true;
            }
        }
        }

        if(isword){
            String lastword = str.substring(startIndex);
            wordlist.add(lastword);
        }
        String words[] = new String[wordlist.size()];
    return wordlist.toArray(words);
    }
    public static void main(String[] args) {

        String str = " coding is fun  ";

        // String word[] = str.trim().split("\s+");

        // for(String res : word){
        //     System.out.println(res);
        // }

        String output[] = splitsstring(str);
        for(String result  : output){
            System.out.println(result);
        }

 }
}
