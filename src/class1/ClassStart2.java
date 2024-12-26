package class1;

/*
* 클래스를 사용하는 이유
*
* 배열을 사용 했을때 각 학생의 데이터가 분리되어 있기 때문에
* 새로운 정보를 삭제하거나 추가할때 인덱스를 실수하게 되면
* 데이터가 전부 꼬여 버리는 일이 발생하게 된다.
* 사람이 관리하기에는 좋은 데이터가 아니다.
* */

public class ClassStart2 {
    public static void main(String args[]) {
        String[] student = {"학생1", "학생2"};
        int[] age = {17, 18};
        int[] grade = {90, 70};

        for (int i = 0; i < student.length; i++) {
            System.out.printf("이름 = %s 나이 = %d 성적 = %d", student[i], age[i], grade[i]);
            System.out.println();
        }

    }
}
