package Q_3000_3999;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import javafx.util.Pair;

/**
 * 3170. Lexicographically Minimum String After Removing Stars
 */

public class LexicographicallyMinimumStringAfterRemovingStars{
    public String clearStars(String s){
        StringBuilder str = new StringBuilder(s);
        PriorityQueue<Integer>[] arr = new PriorityQueue[26];
        for(int i = 0; i < 26; i++){
            arr[i] = new PriorityQueue<>((x, y) -> y - x);
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '*'){
                for(int j = 0; j < 26; j++){
                    if(!arr[j].isEmpty()){
                        str.setCharAt(arr[j].poll(), ' ');
                        break;
                    }
                }
                str.setCharAt(i, ' ');
            }else{
                arr[(c - 'a')].add(i);
            }
        }
        return str.toString().replaceAll(" ", "");
    }
}
