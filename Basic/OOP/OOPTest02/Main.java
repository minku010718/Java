

public class Main
{
    public static void main(String[] args)
    {
        Dog mary = new Dog();

        mary.name = "메리"; //생성 후 초기화
        System.out.println("메리의 이름 : " + mary.name);
        System.out.println("메리의 나이 : " + mary.age);

        Dog boobbi = new Dog("뽀삐");
        System.out.println("뽀삐의 이름 : " + boobbi.name);
        System.out.println("뽀삐의 색 : " + boobbi.color);

        Dog bob = new Dog(5, "밥", "검은색");
        System.out.println("밥의 이름 : " + bob.name);
        System.out.println("밥의 색 : " + bob.color);
        System.out.println("밥의 나이 : " + bob.age);

        System.out.println(bob.Run());
        System.out.println(bob.Eat());
        System.out.println(bob.Bark());
    }
}
