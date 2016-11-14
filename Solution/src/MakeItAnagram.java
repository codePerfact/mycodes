/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class MakeItAnagram {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        char[] a1 = myScan.next().toCharArray();
        char[] a2 = myScan.next().toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (char c = 'a'; c <= 'z'; c++) {
            map1.put(c, 0);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            map2.put(c, 0);
        }

        for (int i = 0; i < a1.length; i++) {
            int value = map1.get(a1[i]);
            map1.put(a1[i], value + 1);
        }
        for (int i = 0; i < a2.length; i++) {
            int value = map2.get(a2[i]);
            map2.put(a2[i], value + 1);
        }

        int counter = 0;
        Set<Character> set = map1.keySet();
        for (char c : set) {
            if (map1.get(c) != map2.get(c)) {
                if (map1.get(c) > map2.get(c)) {
                    int value1 = map1.get(c);
                    int value2 = map2.get(c);
                    counter += value1 - value2;
                    map1.put(c, value2);
                } else {
                    int value1 = map1.get(c);
                    int value2 = map2.get(c);
                    counter += value2 - value1;
                    map2.put(c, value1);
                }
            }
        }
        System.out.println(counter);
    }
}
