/*

 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class ejercicioPotencia {
  
    public static String potencia2(int exp) {
        if (exp == 0) {
            return "0";
        } else {
            List<Integer> digits = new ArrayList<>();
            digits.add(1);
            int size = 1;
            int tmp;
            int ac = 0;
            for (int i = 0; i < exp; i++) {
                for (int c = 0; c < size; c++) {
                    tmp = digits.get(c);
                    tmp *= 2;
                    tmp += ac;
                    if (tmp > 9) {
                        tmp -= 10;
                        ac = 1;
                    } else {
                        ac = 0;
                    }
                    digits.set(c, tmp);
                }
                if (ac == 1) {
                    digits.add(ac);
                    size++;
                    ac = 0;
                }
            }
            String s = "";
            for (int i = digits.size() - 1; i >= 0; i--) {
                s += digits.get(i);      
            }
            return s;
        }
    }
}
