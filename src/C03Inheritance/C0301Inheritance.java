package C03Inheritance;

//extends 키워드를 통해 상속 관계를 표현
public class C0301Inheritance extends Parents {
    int c = 30;
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        자식 클래스라 하더라도 private 변수는 상속 및 접근 불가
        System.out.println("c1.a = " + c1.a);
        System.out.println("c1.a = " + c1.c);
//        메서드 상속
        c1.parentMethod();
    }

//    부모 메서드 재정의: overriding
//    성능의 최적화를 위해 붙여 주는게 좋은 것으로 알려져 있음
    @Override
    void parentMethod() {
        System.out.println("부모 클래스가 아니라 자식 클래스 입니다.");
    }

    void childMethod() {
        System.out.println("자식 클래스 입니다.");
    }
}

class Parents {
//    변수, 메서드의 static 여부 확인
    int a = 10;
    private int b = 20;
    void parentMethod(){
        System.out.println("부모 클래스입니다.");
    }
}
