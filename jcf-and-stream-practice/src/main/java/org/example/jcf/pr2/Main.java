package org.example.jcf.pr2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        int menu = 0;

        while (menu != 5) {
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 보기");
            System.out.println("4. 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.print("입력: ");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("새로운 이름 입력: ");
                    String newName = sc.nextLine();
                    System.out.print("새로운 나이 입력: ");
                    int newAge = sc.nextInt();
                    sc.nextLine(); // consume the leftover newline
                    System.out.print("새로운 점수 입력: ");
                    int newscore = sc.nextInt();
                    sc.nextLine();

                    Student newStudent = new Student(newName, newAge);
                    studentManager.addStudent(newStudent, newscore); // Assuming the addStudent method is defined in StudentManager
                    System.out.println("학생이 추가되었습니다!");
                    break;
                case 2:
                    System.out.print("이름 입력: ");
                    String Name = sc.nextLine();
                    System.out.println("정말 이 학생을 삭제하시겠습니까? (Y/N)");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {
                        studentManager.removeStudent(Name);
                        System.out.println("학생이 삭제되었습니다!");
                    } else {
                        System.out.println("학생이 삭제되지 않았습니다!");
                    }
                    break;
                case 3:
                    System.out.println("학생 목록:");
                    studentManager.printAllStudents();
                    break;
                case 4:
                    System.out.print("이름 입력: ");
                    String searchName = sc.nextLine();
                    studentManager.printScore(searchName);
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
