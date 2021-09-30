import hw02.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String[] line = sc.nextLine().split(" ");
            addStudent(students, line);
        }

//        202100001 유재석 무용학과 01053559999
//        202100002 강호동 사회체육학과 01027440001
//        202100003 이경규 신문방송학과 01029853344

        System.out.printf("첫번째 학생: %s \n", students.get(0).toString());
        System.out.printf("두번째 학생: %s \n", students.get(1).toString());
        System.out.printf("세번째 학생: %s \n", students.get(2).toString());

    }

    private static void addStudent(ArrayList<Student> students, String[] line) {
        int number = Integer.parseInt(line[0]);
        String name = line[1];
        String major = line[2];
        String phoneNum = line[3];
        phoneNum = phoneNum.substring(0, 3) + '-' + phoneNum.substring(3, 7)
                + '-' + phoneNum.substring(7, 11);

        Student s = new Student(number, name, major, phoneNum);
        students.add(s);
    }
}
