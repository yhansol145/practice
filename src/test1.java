import java.util.Arrays;

/**
 * Programmers level1 by Java
 * 완주하지 못한 선수
 *
 */
public class test1 {

    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i=0; i<completion.length; i++) {
            if(!(participant[i].equals(completion[i]))){
                return participant[i];
            }
        }
        return participant[i];
    }
}
