

interface A { }
interface B { }
class ClassA {}
class ClassB {}

//Java는 상속은 1개, 인터페이스는 다중구현이 가능하다.
class Test extends ClassA implements A, B
{
}

public class Main extends ClassB implements B, A{
    public static void main(String[] args) {
        
    }
}
