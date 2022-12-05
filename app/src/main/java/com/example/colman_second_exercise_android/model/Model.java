package com.example.colman_second_exercise_android.model;

import java.util.LinkedList;
import java.util.List;

public class Model {

    private static final Model _instance = new Model();

    public static Model instance(){
        return _instance;
    }
    private Model(){
//
    }

    static List<Student> data = new LinkedList<>();
    public List<Student> getAllStudents(){
        return data;
    }

    public static void addStudent(Student st){
        data.add(st);
    }
}
