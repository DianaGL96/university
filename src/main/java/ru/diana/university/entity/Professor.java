package ru.diana.university.entity;

public class Professor implements Teaching, Scientificwork {
    private Student learner;
    private University placeOfWork;
    private String name;

    public Professor (String name) {
        this.name = name;
    }

    public String getNameProfessor() {
        return name;
    }

    public void setPlaceOfWork(University placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public void setLearner(Student learner) {
        this.learner = learner;
    }

    public void informationProfessor() {
        System.out.println(name + " работает в " + placeOfWork.getNameUniversity() + " и занимается с " + learner.getNameStudents());
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
