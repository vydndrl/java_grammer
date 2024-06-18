package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {

    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr, 0, 1);
        System.out.println("stArr = " + Arrays.toString(stArr));
        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println("intArr = " + Arrays.toString(intArr));
        genericChange(stArr, 1, 2);
        System.out.println("stArr = " + Arrays.toString(stArr));

        Person p1 = new Person();
        p1.setValue("pyowoongi");

        GenericPerson<Integer> p2 = new GenericPerson<>();
        p2.setValue(20);
        System.out.println("p2.getValue() = " + p2.getValue());

//        제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");

//        컴파일 후 제네릭 소거
//        List<String> myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");


    }

//    제네릭 메서드 생성: 반환 타입 왼쪽에 <T> 선언
//    유의점 : 제네릭은 객체 타입이 들어와야 함
    static <T> void genericChange (T[] stArr, int a, int b) {
        T temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    private static void stChange(String[] stArr, int a, int b) {
        String temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    private static void intChange(Integer[] intArr, int a, int b) {
        Integer temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = temp;
    }
}

//제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


class Person {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
