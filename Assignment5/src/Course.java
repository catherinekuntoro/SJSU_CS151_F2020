public class Course {

    private String courseName;
    private String courseDescription;
    private String courseDepartment;
    private String time;
    private String weekday;

    public Course(String courseName, String courseDescription,
                  String courseDepartment, String time, String weekday) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDepartment = courseDepartment;
        this.time = time;
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        return "Course Name: " + getCourseName() +
                ", Course Description: " + getCourseDescription() +
                ", Course Department: " + getCourseDepartment() +
                ", Course Time: " + getTime() +
                ", Course Weekday: " + getWeekday();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
