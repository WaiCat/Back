package org.example.pr2;

import java.util.*;

public class StudentManager {
    private List<Student> students;
    private Set<String> studentsNames;
    private Map<String, Integer> scoreMap;

    public StudentManager(){
        students = new ArrayList<>();
        studentsNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student, int score){
        if(!studentsNames.contains(student.getName())){
            students.add(student);
            studentsNames.add(student.getName());
            scoreMap.put(student.getName(), score);

            System.out.println("새로운 학생이 등록되었습니다:" + student);
        } else {
            System.out.println("Student with the same name already exists.");
        }
    }

    public void removeStudent(String name){
        Student target = null;
        for(Student student : students){
            if(student.getName().equals(name)){
                target = student;
                break;
            }
        }

        if(target== null){
            System.out.println("해당 학생이 없습니다.");
            return;
        }

        students.remove(target);
        studentsNames.remove(name);
        scoreMap.remove(name);
        System.out.println("학생 " + name + "이 삭제되었습니다.");

    }

    public void printAllStudents() {
        System.out.println("=== 학생 목록 ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void printScore(String name) {
        Integer score = scoreMap.get(name);
        if (score != null) {
            System.out.println("[Info] " + name + "의 점수: " + score);
        } else {
            System.out.println("[Error] 점수를 찾을 수 없습니다.");
        }
    }

}
