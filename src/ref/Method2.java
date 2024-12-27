package ref;

public class Method2 {
    /*
    클래스에 생성자 메서드가 왜 생겼는지 이유를 알 수 있는 수업
     */
    public static void main(String[] args) {
        Student s1 = createStudent("학생1", 15, 90);
        Student s2 = createStudent("학생2", 16, 80);

        printStudent(s1);
        printStudent(s2);
    }

    public static void printStudent(Student s) {
        System.out.println("이름 = " + s.name + " 나이 = " + s.age + " 성적 = " + s.grade);
    }

    public static Student createStudent(String name, int age, int grade) {
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.grade = grade;

        return s;
    }
}