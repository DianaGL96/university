package ru.diana.university.service;

import ru.diana.university.entity.*;

public class StudyStart {
    public void makeTeaching (Teaching teaching) {
        teaching.teach();
    }

    public void makeStudying (Studying studying) {
        studying.study();
    }

    public void makePublishWork (Scientificwork scientificwork) {
        scientificwork.publishWork();
    }
}
