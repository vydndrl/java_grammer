package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스를 2개 제공: Comparable, Comparator
//        Comparable 인터페이스에는 compareTo 메서드 선언
//        Comparator 인터페이스에는 compare 메서드 선언

//        String 클래스에  compareTo 내장(Comparable 구현)
//        String 클래스 외에 java의 많은 내장 클래스에서 Comparable 구현
//        String a = "hello";
//        String b = "horld";
//        두 문자열의 각 자리를 순차적으로 비교
//        문자열의 비교는 유니코드 값의 차이를 반환
//        System.out.println(a.compareTo(b));

//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));

//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList);
//        System.out.println("myList = " + myList);
//        Collections.sort(myList, Collections.reverseOrder());
//        System.out.println("myList = " + myList);
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

//        student 객체 5개 정도 담기
        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 24));
        students.add(new Student("lee", 21));
        students.add(new Student("park", 35));
        students.add(new Student("choi", 15));
        students.add(new Student("kim", 30));
//        방법1. Student 객체에서 Comparable 을 구현 => compareTo 메서드를 오버라이딩
//        Collections.sort(students);
        for (Student s : students) {
            System.out.println("이름은 " + s.getName() + " 나이는 " + s.getAge());
        }

//        방법2. Comparator 를 구현한 익명 객체를 sort 에 주입
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
//                return o1.getName(). compareTo(o2.getName());
            }
        };

        students.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(students);

//        아래 문자열을 글자길이 순서로 내림차순 정렬하여라
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr, Comparator.reverseOrder());
//        Arrays.sort(stArr, (a, b) -> b.length() - a.length()); // 내림차순이라 b가 앞
//        System.out.println("stArr = " + Arrays.toString(stArr));

//        [4, 5], [1, 2], [5, 0], [3, 1]
//        위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째를
//        기준으로 배열을 내림차순으로 정렬
//        만약에 1번째 같으면 0번째로 내림차순
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4, 5});
//        myList.add(new int[]{1, 2});
//        myList.add(new int[]{5, 0});
//        myList.add(new int[]{3, 1});
//        myList.sort((a, b) -> b[1] - a[1]);
//
//        for (int[] a : myList) {
//            System.out.println("a = " + Arrays.toString(a));
//        }

    }
}

//class Student implements Comparable<Student> {
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    모든 클래스의 조상 클래스인 Object 클래스의 toString 메서드를 Override 하여
//    객체 호출시에 자동으로 toString 메서드 호출

    @Override
    public String toString() {
        return "이름: " + this.name + ", 나이: " + this.age;
    }



//    @Override
//    public int compareTo(Student s) {
//        return s.getName().compareTo(this.name);
//        return this.age - s.getAge();
}

