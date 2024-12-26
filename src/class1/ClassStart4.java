package class1;

/*
*
* 이제 클래스를 정의하여 하나의 학생 데이터를 만들게 되었다.
* 하지만 출력문이라던지 뭔가 값을 꺼내오는 상황이 발생하였을때
* 코드를 게속 추가하여야 한다. 그래서 더욱 편허게 데이터에 접근하기 위해서는
* 클래스 타입의 배열을 활용하여 값을 가져오면 좀 더 코드가 간결해진다.
* */

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 70;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            System.out.printf("이름 = %s 나이 = %d 점수 = %d \n", students[i].name, students[i].age, students[i].grade);
        }

        for (Student student : students) {
            System.out.printf("이름 = %s 나이 = %d 점수 = %d \n", student.name, student.age, student.grade);
        }


    }
}
