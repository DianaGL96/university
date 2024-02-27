package ru.diana.university.entity;

public class Student implements Studying,Scientificwork {
    private String teacher;
    private String placeOfStudy;
    private String name;

    public Student (String name, String placeOfStudy, String teacher) {
        this.name = name;
        this.placeOfStudy = placeOfStudy;
        this.teacher = teacher;
    }

    public void getNameStudents() {
        System.out.println(name);
    }

    public void informationStudent() {
        System.out.println(name + " учится в " + placeOfStudy + " на кафедре у " + teacher + "\n");
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
