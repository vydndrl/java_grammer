package C01Basic;

import javax.naming.LinkLoopException;
import java.util.*;

public class C10Set {

    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println("mySet = " + mySet);

//        폰켓몬 - 프로그래머스
//        int[] nums = {3, 1, 2, 3};

//        Set<Integer> mySet = new HashSet<>();

//        for (int num : nums) {
//            mySet.add(num);
//        }

//        return Math.min(mySet.size(), nums.length / 2);

//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("basketball");

//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println("mySet = " + mySet);

//        String[] arr = {"baseball", "baseball", "basketball", "basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("baseball");
//        System.out.println("mySet2 = " + mySet2);

//        전화번호 목록 - 프로그래머스
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        boolean answer = true;
//        Set<String> phone_numbers = new HashSet<>();

//        for (String phone : phone_book) {
//            phone_numbers.add(phone);
//        }

//        for (String phone : phone_numbers) {
//            for (int i = 0; i < phone.length(); i++) {
//                if (phone_numbers.contains(phone.substring(0, i))) {
//                    answer = false;
//                    break;
//                }
//            }
//        }

//        System.out.println("answer = " + answer);

//        집합 관련 함수: 교집합(retailAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java", "html", "css"));

//        set1.retainAll(set2);
//        set1.addAll(set2);
//        set1.remove(set2);
//        System.out.println("set1 = " + set1);

//        관련문제: 뉴스 클러스터링 - 프로그래머스

//        LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello1");
        System.out.println("mySet = " + mySet);

//        두 개 뽑아서 더하기 : 배열, 리스트, TreeSet

    }
}
