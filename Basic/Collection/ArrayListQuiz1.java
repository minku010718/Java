import java.util.ArrayList;
import java.util.List;
class Person
{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        Person p1 = new Person("홍길동");
        Person p2 = new Person("김철수");
        Person p3 = new Person("이영희");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        for(Person p : list){
            System.out.println(p.getName());
        }

        list.remove(1);
        System.out.println("현재 요수 개수 : " + list.size() );

        for(Person p : list){
            System.out.println(p.getName());
        }
    }
}
