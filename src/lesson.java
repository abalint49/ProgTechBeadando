import java.util.ArrayList;

public class lesson {
    int id;
    int teacherId;
    String tessonName;
    String location;
    String time;

    @Override
    public String toString() {
        return  "id=" + id +
                ", teacherId=" + teacherId +
                ", tessonName='" + tessonName + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'';
    }

    public lesson(int id, int teacherId, String tessonName, String location, String time) {
        this.id = id;
        this.teacherId = teacherId;
        this.tessonName = tessonName;
        this.location = location;
        this.time = time;
    }

    public lesson() {
    }
}
