package C04Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyInterface m1 = new MyImplements();
        m1.methodA();
//        MyImplements 에 my_constant 변수가 상속 (static final)
        System.out.println(MyImplements.my_constant);
    }
}

interface MyInterface {

    void methodA();
}

class MyImplements implements MyInterface {

    public static final int my_constant = 0;

    @Override
    public void methodA() {
    }
}
