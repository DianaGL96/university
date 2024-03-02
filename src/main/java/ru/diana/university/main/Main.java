package ru.diana.university.main;

import ru.diana.university.entity.Professor;
import ru.diana.university.entity.Student;
import ru.diana.university.entity.University;
import ru.diana.university.service.StudyStart;

public class Main {
    public static void main (String[] args) {
        University university = new University("Moscow State University");
        Student student1 = new Student("Alexandr");
        Professor professor1 = new Professor("prof. Popov");
        student1.setPlaceOfStudy(university);
        student1.setTeacher(professor1);
        professor1.setLearner(student1);
        professor1.setPlaceOfWork(university);
        Student student2 = new Student("Diana");
        Professor professor2 = new Professor("prof. Petrov");
        student2.setPlaceOfStudy(university);
        student2.setTeacher(professor2);
        professor2.setPlaceOfWork(university);
        professor2.setLearner(student2);

        university.addClient(student1);
        university.addClient(student2);
        university.addWorker(professor1);
        university.addWorker(professor2);

        StudyStart studyStart = new StudyStart();
        
        university.informationUniversity();
        student1.informationStudent();
        studyStart.makeStudying(student1);
        studyStart.makePublishWork(student1);
        professor1.informationProfessor();
        studyStart.makeTeaching(professor1);
        studyStart.makePublishWork(professor1);
        student2.informationStudent();
        studyStart.makeStudying(student2);
        studyStart.makePublishWork(student2);
        professor2.informationProfessor();
        studyStart.makeTeaching(professor2);
        studyStart.makePublishWork(professor2);
    }
}
