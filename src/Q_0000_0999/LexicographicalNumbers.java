package Q_0000_0999;

import java.util.ArrayList;
import java.util.List;

/**
 * 386. Lexicographical Numbers
 */
public class LexicographicalNumbers{
    public List<Integer> lexicalOrder(int n){
        List<Integer> list = new ArrayList<>(n);
        int num = 1;
        for(int i = 0; i < n; i++){
            list.add(num);
            if(num * 10 <= n){
                num *= 10;
            }else{
                while(num % 10 == 9 || num + 1 > n){
                    num /= 10;
                }
                num++;
            }
        }
        return list;
    }
}
