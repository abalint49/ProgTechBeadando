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
        return  "id=" + id +
                ", teacherId=" + teacherId +
                ", tessonName='" + lessonName + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'';
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
