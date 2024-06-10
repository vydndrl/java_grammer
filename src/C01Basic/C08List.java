package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {

//         List 선언 방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();

//         가장 일반적인 List 선언 방법
//         왼쪽엔 인터페이스, 오른쪽엔 구현체(클래스)
//         나중에 인터페이스 다룰 때 더 심화해서 배울 것
//        List<String> myList3 = new ArrayList<>();

//         초기값 생성 방법1 : 하나씩 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");

//         초기값 생성 방법2 : 리스트를 주입
//         Arrays.asList는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java","python","C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> myList6 = new ArrayList<>(List.of(myArr));

//        int[] intArr = {10, 20, 30};
//        List<Integer> myList5 = new ArrayList<>(Arrays.asList(intArr)); // 얘는 안 됨. int[]는 Integer에 담을 수 없음
//        List<Integer> myList5=new ArrayList<>();

//        for(int i:intArr){
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//         add(index,값) : 중간에 값 삽입
//        myList.add(0, 30);
//        System.out.println(myList);

//        특정 리스트의 요소를 모두 add
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(2);
//        myList.addAll(myList2);

//         get : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));

//         for문을 돌려 전체 list cnffur
//         size() : 리스트의 길이(개수) 반환
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }

//        remove: 요소 삭제
//        1) index를 통한 삭제 2) value를 통한 삭제
//        System.out.println(myList);
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);


//        set(index, value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size() - 1, 10); // size -1: 마지막 자리
//        System.out.println("myList = " + myList);

//        indexOf : 특정 값이 몇 번째 index에 위치한지 return
//        가장 먼저 나오는 값의 index return
//        System.out.println("myList.indexOf(10) = " + myList.indexOf(10));

//        전체 삭제 : clear()

//        isEmpty : 값이 비어있는지, 안 비어있는지
//        contains : 특정 값이 있는지, 없는지 확인
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        System.out.println(list.contains(20));
//        System.out.println(list.isEmpty());

//        이중 리스트(리스트 안에 리스트)
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(10);
//        myList.get(0).add(20);
//        myList.get(1).add(1);
//        myList.get(1).add(2);
//        System.out.println("myList = " + myList);

//        리스트 안에 배열: 배열 사이즈 2, 3, 4개 짜리 배열 3개 들어가는 것으로 add
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[]{1, 2});
//        myList2.add(new int[]{10, 20, 30});
//        myList2.add(new int[]{100, 200, 300, 400});

//        리스트 정렬 : Collections.sort(), 리스트객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);

//        정렬1. Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());

//        정렬2. 리스트객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
        
//        프로그래머스 - n의 배수 고르기

//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

//        ArrayList<Integer> answerList = new ArrayList<>();
//        for (int i = 0; i < numlist.length; i++) {
//            if (numlist[i] % n == 0) {
//                answerList.add(numlist[i]);
//            }
//        }

//        int[] answer = new int[answerList.size()];
//        for (int i = 0; i < answerList.size(); i++) {
//            answer[i] = answerList.get(i);
//        }

//        System.out.println("answer = " + Arrays.toString(answer));
        
//        두 개 뽑아서 더하기 <- List를 사용

//        배열과 List 간의 변환
//        1. String 배열을 List<String>으로 변환
        String[] stArr = {"java", "python", "C++"};
//        1-1. Arrays.asList
        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
//        1-2. for문을 통해 담기
//        1-3. streamApi(참고만)
        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());

//        2. List<String>을 String 배열로 변환
//        2-1. for문을 통해 담기
//        2-2. toArray
        String[] stArr2 = stList2.toArray(new String[stList1.size()]);

//        3. int 배열을 List<Integer>로 변환
//        3-1. for문을 통해 담기
//        3-2. streamApi 사용
        int[] intArr = {10, 20, 30, 40};
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());



    }
}