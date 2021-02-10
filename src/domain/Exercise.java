package domain;
/**This class calculate Ackerman functions
 * @see TestResult

 */
public class Exercise {
    /**
     * 
     * @param n first positive number
     * @param m second positive number
     * @return integer value of Calculate
     */
    public static int Calculate(int n, int m){

    if ((n==1)&&(m==1)) return 1;
    else
        if (n>1)
            return Calculate(n-1,m)+m;
        else
            return Calculate(n,m-1)+1;
    }
}
