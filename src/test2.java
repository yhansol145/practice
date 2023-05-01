import java.util.Arrays;

/**
 * Programmers level1 by Java
 * 예산
 *
 */
public class test2 {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;
        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget<0){
                break;
            }
            result ++;
        }
        return result;
    }
}
