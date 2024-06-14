package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        default 접근 불가
//        System.out.println(c1.s2);
//        protected 접근 불가
//        System.out.println(c1.s3);

        ProtectedMain p1 = new ProtectedMain();
//        default 접근 불가
//        System.out.println(p1.st2);
//        상속한 객체에서 protected 접근 가능
        System.out.println(p1.st3);

    }
}
