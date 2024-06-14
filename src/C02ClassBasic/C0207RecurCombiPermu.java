package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecurCombiPermu {
    static List<Integer> myList;
    static List<List<Integer>> answer;
    static int count;
    public static void main(String[] args) {

//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> combinations = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i = 0; i < myList.size() - 1; i++) {
//            temp.add(myList.get(i));
//            for(int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                combinations.add(temp);
//                temp.remove(myList.size() - 1);
//            }
//            temp.remove(myList.size() - 1);
//        }
        myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        answer = new ArrayList<>();
        combi(answer, new ArrayList<>(), myList, 2, 0);
        permu(answer, new ArrayList<>(), myList, 2, new boolean[myList.size()]);
        System.out.println("answer = " + answer);
    }

    static void combi(List<List<Integer>> answer, List<Integer> temp ,List<Integer> myList, int count, int start) {
        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(answer, temp, myList, count, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    static void permu(List<List<Integer>> answer, List<Integer> temp ,List<Integer> myList, int count, boolean[] visited) {

        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < myList.size(); i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}

