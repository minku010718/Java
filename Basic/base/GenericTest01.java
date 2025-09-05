

class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }
}
class Apple {}
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("홍길동");
        String name = (String)box.get();
        System.out.println(name);

//        Apple apple = new Apple();
//        box.set(new Apple());
        box.set(new Apple());
        Apple apple2 = (Apple) box.get();

    }
}
