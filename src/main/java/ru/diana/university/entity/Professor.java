package ru.diana.university.entity;

public class Professor implements Teaching, Scientificwork {
    private String learner;
    private String placeOfWork;
    private String name;

    public Professor (String name, String placeOfWork, String learner) {
        this.name = name;
        this.placeOfWork = placeOfWork;
        this.learner = learner;
    }

    public void getNameProfessor() {
        System.out.println(name);
    }

    public void informationProfessor() {
        System.out.println(name + " работает в " + placeOfWork + " и занимается с " + learner);
    }

    @Override
    public void teach() {
        System.out.println("Я - профессор, и я преподаю");
        giveLectures();
    }

    private void giveLectures() {
        System.out.println("Чтобы преподавать, мне нужно читать лекции студентам");
    }

    @Override
    public void publishWork() {
        System.out.println("Я помогаю своему студенту опубликовать научную работу");
        check();
    }

    private void check() {
        System.out.println("Чтобы студент мог опубликовать научную работу, мне нужно проверить её\n");
    }
}
