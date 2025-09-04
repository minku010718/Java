class A
{
    class B     //중첩 클래스(0)
    {
    }
    interface C //중첩 인터페이스(0)
    {
    }
}
class View {
    public interface OnClickListener {
        public void onClick(View v);
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        View view = new View();
    }
}
