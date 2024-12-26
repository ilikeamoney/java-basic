package class1;

/*
* 클래스를 사용하는 이유
*
* 단순이 변수에 담아서 사용을 하면
* 값이 추가 될때마다 많은 코드들이 반복적으로 입력되어야 해서
* 불편하다.
* */

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        String student3Name = "학생3";
        int student3Age = 18;
        int student3Grade = 70;

        System.out.printf("이름 = %s 나이 = %d 성적 = %d", student1Name, student1Age, student1Grade);
        System.out.printf("이름 = %s 나이 = %d 성적 = %d", student2Name, student2Age, student2Grade);
        System.out.printf("이름 = %s 나이 = %d 성적 = %d", student3Name, student3Age, student3Grade);
    }
}
