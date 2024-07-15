package java0712;
import java.util.*;

public class LottoEx {

	public static void main(String[] args) {
         Random rand = new Random();
         Set<Integer> lottoset = new HashSet<>(); //중복을 허용하지 않는 set 사용
         
         while(lottoset.size() < 6) {
        	 int number = rand.nextInt(45) + 1;
        	 lottoset.add(number);
         }
         
//         lottoset.add(7);
//         lottoset.add(14);
//         lottoset.add(14);
//         System.out.println(lottoset.size());
         System.out.println(lottoset);
 }
}
