//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class A
{
    //중첩 클래스(0)
    class B {
        int field1;
        static int field2;  //class 공용 변수
        void method1(){
            System.out.println("B클래스의 method1()!");
        }
    }
    //정적 멤버 클래스(0)
    static class C {
        int field1;
        static int field2;
        C(){
            System.out.println("정적 멤버 클래스 객체가 생성됨!!!");
        }
        void method() {
            System.out.println("정적 멤버 클래스의 method() 실행");
        }
        static void method2(){
            System.out.println("정적 멤버 클래스의 static method() 실행");
        }
    }
    //로컬 클래스 , 메소드 안에 들어 있는 클래스
    void method() {
        //로컬 클래스
        class D {
            D(){
                System.out.println("로컬 클래스의 생성자 실행!!");
            }
            int field1;
            void method(){
                System.out.println("로컬 클래스의 내의 메소드 실행!!!");
            };
           static int field2;
           //static void method2(){     }
        }//end of D
        D d = new D();
        d.field1 = 3;
        d.method();
    }//end of method()
}//end of A class

public class Main
{
    public static void main(String[] args) {
        A a = new A();
        //중첩 클래스 생성
        A.B b = a.new B(); //B객체 생성
        b.field1 = 100;
        A.B.field2 = 200;
        b.method1();
        System.out.println(b.field1);

        //정적 멤버 클래스
        A.C c = new A.C();
        c.field1 = 3;
        c.method();
        A.C.field2 = 7;
        A.C.method2();
        //로컬 클래스
        a.method();

    }
}
