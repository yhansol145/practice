/**
 * Programmers level1 by Java
 * 평균
 *
 */
public class test3 {

    public double solution(int[] arr) {
        double sum = 0;
        double avg = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        avg = sum/(arr.length);
        return avg;
    }

}