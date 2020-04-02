import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] inp = {"practice", "makes", "perfect", "coding", "makes"};
//      shortWordDist(inp, "coding","practice");
    //  shortWordDist(inp, "makes","coding");
        System.out.println(shortWordDist(inp, "makes","coding"));
    }
    public static int shortWordDist(String[] words, String word1, String word2){
//        List<String> listOfWords = new LinkedList<String>();
//        int wordslength =words.length-1;
//        int counter=0;
//        int distance=0;
//        while(counter<=wordslength){
//            listOfWords.add(words[counter]);
//            System.out.println(listOfWords);
//            ++counter;
//        }
//        if(listOfWords.contains(word1) && listOfWords.contains(word2)){
//            int index = listOfWords.indexOf(word1);
//            int index2 = listOfWords.indexOf(word2);
//            distance = index-index2;
//            System.out.println(distance);
//        }

        //if both words present- hashmap
        //index of words
        //distance
//        if(word1){}

//return distance;

        int i1 = -1;
        int i2 = -1;
        int minDistance = words.length;
        int currentDistance;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
            } else if (words[i].equals(word2)) {
                i2 = i;
            }

            if (i1 != -1 && i2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(i1 - i2));
            }
        }
        return minDistance;
    }
    }

