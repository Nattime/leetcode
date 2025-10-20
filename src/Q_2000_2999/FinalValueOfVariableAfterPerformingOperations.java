package Q_2000_2999;

/**
 * 2011. Final Value of Variable After Performing Operations
 */

public class FinalValueOfVariableAfterPerformingOperations{
    public int finalValueAfterOperations(String[] operations){
        int ret = 0;
        for(String iter : operations){
            if(iter.charAt(1) == '+'){
                ret++;
            }else{
                ret--;
            }
        }
        return ret;
    }
}