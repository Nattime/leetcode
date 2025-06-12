package Q_1000_1999;

/**
 * 1910. Remove All Occurrences of a Substring
 */
public class RemoveAllOccurrencesOfASubstring{
    public String removeOccurrences(String s, String part){
        int len = s.length();
        int pLen = part.length() - 1;
        int pL = pLen + 1;

        char lastLetter = part.charAt(pLen);
        String ps = part.substring(0, pLen);

        char[] ret = new char[len];
        int retI = 0;
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c == lastLetter){
                if(pL <= retI + 1){
                    if(index(ret, retI, ps)){
                        retI -= pLen;
                    }else{
                        ret[retI++] = c;
                    }
                }else{
                    ret[retI++] = c;
                }
            }else{
                ret[retI++] = c;
            }
        }
        return new String(ret, 0, retI);
    }
    private boolean index(char[] arr, int ind, String part){
        int i = ind - 1;
        int j = part.length() - 1;
        if(ind < j){
            return false;
        }
        for(; j >= 0; j--, i--){
            if(arr[i] != part.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
