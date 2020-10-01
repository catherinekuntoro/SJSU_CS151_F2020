public class Course implements Comparable<Course>, Cloneable {

    private String courseName;
    private String courseDescription;
    private String department;
    private String time;
    private String weekday;

    public Course(String courseName, String courseDescription, String department, String time, String weekday) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.time = time;
        this.weekday = weekday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Course that) {

        //compare name
        if (!this.courseName.equals(that.courseName)) {
            return this.courseName.compareTo(that.courseName);
        }
        //compare description
        else if (!this.courseDescription.equals(that.courseDescription)) {
            return this.courseDescription.compareTo(that.courseDescription);
        }

        //compare department
        else if (!this.department.equals(that.department)) {
            return this.department.compareTo(that.department);
        }

        //compare time
        else if (!this.time.equals(that.time)) {
            return this.time.compareTo(that.time);

            // compare weekday
        } else if (!this.weekday.equals(that.weekday)) {
            return this.weekday.compareTo(that.weekday);
        }

        //definitely the same
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        //if null
        if (obj == null) {
            return false;

        }

        //reference equality
        else if (obj == this) {
            return true;
        }

        //not even the same class
        else if (!(obj instanceof Course)) {
            return false;
        }

        //Checking attribute equality
        else {
            Course that = (Course) obj;
            return this.compareTo(that) == 0;
        }
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
