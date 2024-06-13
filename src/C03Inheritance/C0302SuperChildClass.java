package C03Inheritance;

public class C0302SuperChildClass extends SuperParents{

    int a;
    int c;

    public C0302SuperChildClass() {
//        부모 클래스의 생성자를 의미
//        super.변수명: 부모 클래스의 변수명을 의미
        super(30);
        a = 10;
        c = 20;
    }

    public static void main(String[] args) {
        C0302SuperChildClass c1 = new C0302SuperChildClass();
        c1.display2();
    }
    void display2() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

class SuperParents {
    int a;

    public SuperParents(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("부모 클래스 입니다.");
    }
}
