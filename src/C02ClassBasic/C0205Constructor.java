package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calendar cal = new Calendar("2024", "06", "12");

        System.out.println(cal.getYear() + "년 " + cal.getMonth() + "월 "
        + cal.getDay() + "일 입니다.");

    }
}

 class Calendar {
    private String year;
    private String month;
    private String day;

//    생성자: 클래스명과 동일, 초기화하고 싶은 변수명 나열
//     별도의 생성자를 만들 경우, 초기 생성자를 따로 선언 필요
      Calendar(String year, String month, String day) {
         this.year = year;
         this.month = month;
         this.day = day;
     }

//     같은 클래스 내의 다른 생성자 호출 시 this() 사용
     Calendar(String year, String month) {
          this(year, month, null);
      }

     Calendar() {

     }

     public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}

