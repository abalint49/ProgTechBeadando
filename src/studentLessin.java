public class studentLessin {

    Lessons lessons = new Lessons();
    Users users = new Users();

    int lessonId;
    String lessonName;
    String teacherName;
    String location;
    String time;

    @Override
    public String toString() {
        return "lessonName='" + lessonName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'';
    }

    public studentLessin(int lessonId, String lessonName, String teacherName, String location, String time) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.teacherName = teacherName;
        this.location = location;
        this.time = time;
    }
}
