import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 95);
        map.put("이순신", 85);
        map.put("강장군", 80);

        //Key정렬이 필요하다면 Treemap으로 변경하자!!!
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        for(Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println("\t" + e.getKey() + " : " + e.getValue());
        }
    }
}
