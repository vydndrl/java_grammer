package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        int num = 3;

        boolean smallNum = isPrime(num);
        System.out.println("smallNum = " + smallNum);
        isPrimePrint(num);
    }

    private static boolean isPrime(int num) {
//        소수면 true
        boolean answer = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
//                answer = false;
//                break;
//                메서드는 return 을 만나면 바로 메서드를 종료
//                void 리턴 타입에서도 메서드 강제 종료를 위해 return 사용
                return false;
            }
        }
        return answer;
    }

    private static void isPrimePrint(int num) {
//        소수면 true
        boolean answer = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수 입니다.");
    }
}
