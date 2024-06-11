package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println("myMap = " + myMap);
//        System.out.println(myMap.get("soccer"));
//        myMap.put("baseball", "크리켓");
//        baseball을 map에서 검색하는 복잡도 O(1)
//        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");
//        System.out.println(myMap);
//        putIfAbsent: 비어있으면 put
//        myMap.putIfAbsent("basketball", "배구");
//        System.out.println(myMap);
//        getOrDefault : key가 없으면 default 값 return
//        System.out.println(myMap.getOrDefault("baseball", "비어있음"));
//        System.out.println(myMap.containsKey("baseball"));

//        String[] arr = {"농구", "농구", "배구", "야구", "배구"};
//        농구:2, 배구:2, 야구:1
//        Map<String, Integer> myMap = new HashMap<>();
//        for (String s : arr) {
//            if (myMap.containsKey(s)) {
//                myMap.put(s, myMap.get(s) + 1);
//            } else {
//                myMap.put(s, 1);
//            }
//            myMap.put(s, myMap.getOrDefault(s, 0) + 1);
//        }
//        System.out.println(myMap);

//        keySet(): 키 목록을 반환
//        values(): value 목록을 반환

//        enhanced for문을 통해 key 값 하나씩 출력
//        for (String a : myMap.keySet()) {
//            System.out.println(a + ": " + myMap.get(a));
//        }
//        for (int a : myMap.values()) {
//            System.out.println(a);
//        }

//        iterator를 통해 key 값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
//        next() 메서드는 데이터를 하나씩 소모 시키면서 return
//        System.out.println(myIter.next());

//        hasNext(): iterator 안에 값이 있는지 없는지 boolean return
//        while (myIter.hasNext()) {
//            System.out.println(myIter.next());
//        }

//        완주하지 못한 선수 - 프로그래머스

//        의상 - 프로그래머스

//        LinkedHashMap : 데이터 삽입 순서 유지
//        Map<String, Integer> likedMap = new LinkedHashMap<>();
//        likedMap.put("hello5", 1);
//        likedMap.put("hello4", 1);
//        likedMap.put("hello3", 1);
//        likedMap.put("hello2", 1);
//        likedMap.put("hello1", 1);
//        System.out.println("likedMap = " + likedMap);

//        TreeMap : key를 통해 데이터를 정렬 (최적화)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 1);
//        treeMap.put("hello3", 1);
//        treeMap.put("hello2", 1);
//        treeMap.put("hello1", 1);
//        System.out.println("treeMap = " + treeMap);

//        문자열 내 맘대로 정렬하기 - 프로그래머스
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;

//        Map<String, String> map = new TreeMap<>();

//        for (String a : strings) {
//            map.put(a.charAt(n) + a, a);
//        }

//        String[] answer = new String[strings.length];
//        int count = 0;

//        for (String a : map.values()) {
//            answer[count] = a;
//            count++;
//        }



    }
}
