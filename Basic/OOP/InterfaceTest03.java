

interface RemoteControl
{
    public static int MAX_VALUE = 100;
    int MIN_VALUE = 0;

    void turnOn();

    //default 메소드, JAVA15부터.
    default void turnOff() {
        System.out.println("해당 제품의 전원을 끕니다."); //코딩내용
    }
}
class TV extends Object implements RemoteControl
{
    @Override
    public void turnOn() {
        System.out.println("해당 제품의 전원을 켭니다.");
    }
}
public class Main {
    public static void main(String[] args) {
        TV myTv = new TV();
        myTv.turnOn();
        myTv.turnOff();
        System.out.println(RemoteControl.MAX_VALUE);
        System.out.println(RemoteControl.MIN_VALUE);
    }
}
