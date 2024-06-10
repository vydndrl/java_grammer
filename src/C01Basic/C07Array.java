package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        배열 표현식1: 리터럴 방식
//        int[] intArr1 = {1,2,3,4,5};

//        배열 표현식2: 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); // 0으로 초기화
//        for (int j : intArr2) {
//            System.out.println(j);
//        }

//        표현식 3
//        int[] intArr3 = new int[] {1,2,3,4};

//        표현식 4: 불가 -> 배열의 길이는 사전에 지정되어야 함.
//        int[] intArr4 = new int[];

//        String[] stArr1 = new String[5];
//        stArr1[0] = "hello";
//        stArr1[1] = "java";
//        null pointer exception
//        System.out.println(stArr1[2].length());

//        String[] stArr2 = new String[5];
//        배열에 값 한꺼번에 세팅
//        Arrays.fill(stArr2, "java");
//        System.out.println(stArr2[3]);

//        85, 65, 90인 int 배열을 선언하고, 총합, 평균을 구해보자
        /*
        int[] arr = {85, 65, 90};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        */

//        최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0]; //Integer.MIN_VALUE 로도 세팅 가능
//        int min = arr[0]; //Integer.MAX_VALUE 로도 세팅 가능
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);

//        배열의 자리 바꾸기
//        int[] arr2 = {10, 20, 30, 40, 50};
//        for (int i = 0; i < arr2.length-1; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i + 1];
//            arr2[i + 1] = temp;
//        }
//        System.out.println("arr2 = " + Arrays.toString(arr2));

//        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        새로운 배열에 위 arr을 뒤집은 값 세팅
//        int[] result = new int[arr.length];

//        for (int i = 0; i < arr.length; i++) {
//            result[i] = arr[arr.length - i - 1];
//        }
//        System.out.println("result = " + Arrays.toString(result));

//        숫자 뒤집기
//        문자열과 관련된 풀이로 풀기
//        int num = 1234;
//        String stNum = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int cnt = stNum.length()-1;
//        for (int i = 0; i < stNum.length(); i++) {
//            sb.append(stNum.charAt(cnt - i));
//        }
//        String answer = sb.toString();
//        System.out.println("answer = " + answer);

//        정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr); // 오름차순 정렬이 기본
//        System.out.println("arr = " + Arrays.toString(arr));

//        문자 정렬
//        아스키 코드 기준으로 => 대문자가 소문자보다 아스키 코드 숫자가 낮다
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println("fruits = " + Arrays.toString(fruits));

//        문자열의 index 순서로 비교
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//        System.out.println("fruits2 = " + Arrays.toString(fruits2));


//        내림차순
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());

//        기본형 타입은 Comparator 로 처리 불가
//        int[] intArr = {5,1,2,7,3,1,2};
//        Arrays.sort(intArr);
//        int[] result = new int[intArr.length];
//        오름차순 정렬 후 배열 뒤집기
//        for (int i = 0; i < intArr.length; i++) {
//            result[i] = intArr[intArr.length -i - 1];

//        System.out.println("result = " + Arrays.toString(result));

//        방법2. streamapi, lamda 를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(intArr) // intArr를 대상으로 Stream 객체
//                        .boxed() //int 요소를 Integer로 형변환 시키는 메서드
//                        .sorted(Comparator.reverseOrder())
//                        .mapToInt(a->a) // Integer를 int로 형변환
//                        .toArray(); // 배열로 변환

//        K번째 수 - 프로그래머스

//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];

//        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0];
//            int end = commands[i][1];
//            int value = commands[i][2] - 1;
//            int[] temp =  new int[end - start];
//            int count = 0;
//            for (int j = start; j < end; j++) {
//                temp[count] = array[j];
//                count++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[value];
//        }
//        System.out.println("answer = " + Arrays.toString(answer));

//        선택정렬 알고리즘
//        int[] arr = {17, 20, 19, 25, 12};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("arr = " + Arrays.toString(arr));
        
//        숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때,
//        만들어질수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        for (int i = 0; i < intArr.length - 1; i++) {
//            for (int j = i + 1; j < intArr.length; j++) {
//                int sum = intArr[i] + intArr[j];
//                System.out.println(intArr[i] + " + " + intArr[j] + " = " + sum);
//            }
//        }

//        배열의 복사
//        copyOf(배열, length), copyOfRange(배열, start, end)
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        System.out.println("newArr = " + Arrays.toString(newArr1));

//        int[] newArr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println("newArr2 = " + Arrays.toString(newArr2));
        
//        배열의 중복 제거
//        int[] temp = {10, 10, 5, 7, 40, 40, 10, 10};
//        5, 7, 10, 10, 10, 40, 40
//        list, set 도 쓰지말고 중복 제거
//        hint: 옆에 숫자와 같은지, 안 같은지 비교
//        새로운 배열의 길이는 넉넉하게 temp 길이로 배정 후 추후 copyOfRange
//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int num = 0;
//        for (int i = 0; i < temp.length - 1; i++) {
//            if (i == 0 || temp[i] != temp[i - 1]) {
//                newTemp[num] = temp[i];
//                num++;
//            }
//        }
//        System.out.println("newTemp = " + Arrays.toString(newTemp));
//        int[] answer = Arrays.copyOfRange(newTemp, 0, num);
//        System.out.println("answer = " + Arrays.toString(answer));

//        프로그래머스 - 두 개 뽑아서 더하기

//        배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 8) {
//                System.out.println("i = " + i);
//            }
//        }

//        이진 검색(Binary Search) - 이분 탐색
//        복잡도 0(logn)
//        int[] arr = {1, 3, 6, 8, 9, 11, 15};
//        사전에 오름차순 정렬이 되어 있어야 이진 검색 가능
//        System.out.println(Arrays.binarySearch(arr, 15));

//        배열 간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1 == arr2);
//        Arrays.equals: 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

//        2차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;

//        리터럴 방식으로 할당
//        int[][] arr2 = {{1,2,3}, {4,5,6}};
//        {{1,2,3}, {4,5,6}}

//        2차원 배열의 출력
//        System.out.println("arr2 = " + Arrays.deepToString(arr2));

//        2차원 가변 배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];


//        가변 배열 리터럴 방식
//        int[][] arr2 = {{10, 20}, {10, 20, 30}};

//        [3][4] 사이즈 배열을 선언한 뒤
//        1~12까지 숫자값 각 배열에 할당 후 출력

//        int[][] arr = new int[3][4];
//        int num = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = num;
//                num++;
//                System.out.println("arr" + "["+ i + "]" + "["+ j + "] = "+ arr[i][j]);
//            }
//        }
//        System.out.println("arr = " + Arrays.deepToString(arr));

//        행렬의 덧셈 - 프로그래머스
//        int[][] arr1 = {{1,2}, {2,3}};
//        int[][] arr2 = {{3,4}, {5,6}};
//            int[][] answer = new int[arr1.length][arr1[0].length];
//            for (int i = 0; i < arr1.length; i++) {
//                for (int j = 0; j < arr1[i].length; j++) {
//                    answer[i][j] = arr1[i][j] + arr2[i][j];
//                }
//            }
//        System.out.println("answer = " + Arrays.deepToString(answer));

//        가변 배열 실습: 행의 길이 (전체 배열의 길이) 5 => {{10}, {20,20}, {30,30,30}, .... 50까지 }

//        int[][] arr1 = new int[5][];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = new int[i+1];
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr1[i][j] = 10 * (i + 1);
//            }
//        }
//        System.out.println("arr1 = " + Arrays.deepToString(arr1));
    }
}

