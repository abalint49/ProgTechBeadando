package com.example.progtechbeadando;
import java.util.ArrayList;

public class lesson {
    int id;
    int teacherId;
    String lessonName;
    String location;
    String time;

    @Override
    public String toString() {
        return " " + id + ", " + lessonName + " (" + LoginForm.users.GetUserFromId(teacherId) + ") - " + location + ", " + time;
    }

    public lesson(int id, int teacherId, String lessonName, String location, String time) {
        this.id = id;
        this.teacherId = teacherId;
        this.lessonName = lessonName;
        this.location = location;
        this.time = time;
    }

    public lesson() {
    }
}
