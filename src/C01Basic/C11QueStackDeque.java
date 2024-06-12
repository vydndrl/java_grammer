package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {

    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); //10
//        System.out.println("myQue = " + myQue);
//        System.out.println(myQue.poll()); //10
//        System.out.println("myQue = " + myQue);

//        LinkedList와 ArrayList 비교
//        LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++) {
//            list1.add(0, 10);
//        }

//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist의 중간 삽입: " +(endTime - startTime));

//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++) {
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입: " +(endTime2 - startTime2));

//        LinkedList<Integer> list3 = new LinkedList<>();
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++) {
//            list1.get(i);
//        }

//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedlist의 조회: " +(endTime3 - startTime3));

//        ArrayList<Integer> list4 = new ArrayList<>();
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++) {
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 조회: " +(endTime4 - startTime4));

//        프린터기 예시
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//        }

//        ArrayBlockingQueue: 길이제한 큐
//        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        add를 사용하면 길이제한 초과 시 예외 발생
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40");

//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");

//        System.out.println("queue = " + queue);

//        우선순위 큐: 데이터를 꺼낼 때 정렬된 데이터 pop
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);

//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

//        더 맵게 - 프로그래머스: 특정 숫자들을 꺼내서 재조립해서 다시 집어놓고, 그 다음 가장 작은 값을 꺼내고

//        stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//        pop: 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(st1.pop());
//        System.out.println(st1.peek());
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());

//        String 객체 5개 정도 Stack 추가 후에 while 문을 통해 출력
//        Stack<String> strings = new Stack<>();
//        strings.push("h");
//        strings.push("e");
//        strings.push("l");
//        strings.push("l");
//        strings.push("o");
//        while (!strings.isEmpty()) {
//            System.out.println(strings.pop());
//        }

//        올바른 괄호 - 프로그래머스

//        Deque
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        System.out.println("d1 = " + d1);
//        d1.addLast(30);
//        System.out.println("d1 = " + d1);
//        System.out.println("d1.peekFirst() = " + d1.peekFirst());
//        System.out.println("d1.peekLast() = " + d1.peekLast());
//        System.out.println("d1.pollFirst() = " + d1.pollFirst());
//        System.out.println("d1.pollLast() = " + d1.pollLast());

//        다리를 지나는 트럭 - 프로그래머스



    }
}
