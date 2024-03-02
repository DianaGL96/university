package ru.diana.university.entity;

public class Student implements Studying,Scientificwork {
    private Professor teacher;
    private University placeOfStudy;
    private String name;

    public Student (String name) {
        this.name = name;
    }

    public void setPlaceOfStudy(University placeOfStudy) {
        this.placeOfStudy = placeOfStudy;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }

    public String getNameStudents() {
        return name;
    }

    public void informationStudent() {
        System.out.println(name + " учится в " + placeOfStudy.getNameUniversity() + " на кафедре у " + teacher.getNameProfessor() + "\n");
    }

    @Override
    public void study() {
        System.out.println("Я - студент, и я учусь");
        attendsLectures();
    }

    private void attendsLectures() {
        System.out.println("Чтобы учиться, мне нужно ходить на лекции");
    }

    @Override
    public void publishWork() {
        System.out.println("Я занимаюсь публикацией научной работы");
        write();
    }

    private void write() {
        System.out.println("Чтобы мне опубликовать научную работу, мне нужно написать её\n");
    }
}
