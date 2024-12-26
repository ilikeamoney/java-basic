package class1;

/*
* 클래스 정의한다는 것은 원하는 제품의 설계도를 작성하는 것이다.
* 붕어빵 틀로 비유할 수 있다. 그리고 클래스를 통해 생성 되어서 메모리에 올라간
* 실제 제품을 인스턴스 객체라고 한다. 즉 붕어빵인셈이다.
* 즉 붕어빵틀을 만든다 클래스를 정의한다.
* 붕어빵 재료 반죽, 팥 같은 것은 멤버변수 필드라고 한다.
* 그리고 그 값들을 모두 넣어서 붕어빵을 생성을 하면 그것을 인스턴스, 객체 라고 한다.
*
* 인스턴스가 생성되면 메모리 일정 공간에 생성되고
* 그 인스턴스에 접근할 수 있는 주소 값을 반환한다.
* 그리고 사용자는 그 주소해 접근해서 생성한 인스턴스 값에 접근한다.
* */

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 70;

        System.out.printf("이름 = %s 나이 = %d 점수 = %d", student1.name, student1.age, student1.grade);
        System.out.printf("이름 = %s 나이 = %d 점수 = %d", student2.name, student2.age, student2.grade);
    }
}
