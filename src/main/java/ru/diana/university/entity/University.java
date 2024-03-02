package ru.diana.university.entity;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Professor> workers;
    private List<Student> clients;
    private String name;

    public University (String name){
        this.name = name;
        this.workers = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    public String getNameUniversity () {
        return name;
    }

    public void addWorker (Professor worker) {
        workers.add(worker);
    }

    public void addClient (Student client) {
        clients.add(client);
    }

    public void informationUniversity() {
        System.out.println("Название университета: " + name);
        System.out.println("В университете работают: " );
        for (Professor worker: workers) {
            System.out.println(worker.getNameProfessor());
        }
        System.out.println("В университете учатся: ");
        for (Student client: clients) {
            System.out.println(client.getNameStudents());
        }
        System.out.println();
    }
}
