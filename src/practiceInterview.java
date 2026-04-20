import java.util.ArrayList;

public class practiceInterview {
   

   public static int wordsLongerThanLessThan(ArrayList<String> words, int n, int m){
    int counter = 0;
    for(String word : words){
        if(word.length()>n && word.length()<m){
            counter++;
        }
    }
    return counter;
   }

   public static String longestWordGiven(String[] words, char n){
    String longest = "";
    
    for(String word : words){
        char firstLetter = word.charAt(0);
        if(firstLetter == n && word.length() > longest.length()){
            longest = word;
        }
    }
    return longest;
   }

   public static String pigLatin(String sentence){
    StringBuilder sb = new StringBuilder("");
    String[] words = sentence.split(" ");

    for(String word:words){
        if("aeiou".indexOf(word.charAt(0)) != -1){
            sb.append(word);
        } else{
           String alteredWord = word.substring(1) + word.charAt(0)+"ay";
            sb.append(alteredWord);
        }

    }
    return sb.toString();
   }

}
    

