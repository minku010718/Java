import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
        int size = list.size();
        System.out.println("총 개수 : " + size);
        System.out.println();

        //2번 인덱스의 객체 얻기
        String skill = list.get(2);
        System.out.println(skill);
        System.out.println();

        //요소 제거??
        list.remove(2);
        list.remove("JDBC");
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }

    }
}
