                      /**Jana alyamani and Sarah almalki's project*/ 


public class AcademicSchedule {
    
    /*The course attribute holds the course name.*/    
    private String course ;
    /*The day attribute holds the submition day of the week.*/    
    public String day;
    /*This attribute holds the type of the task: assignment, examination, project.*/
    private int taskType ;
 
    /**
     * Constructor 
     * @param course the course name in the AcademicSchedule.
     * @param day the day of the task in the AcademicSchedule.
     * @param taskType the taskType of AcademicSchedule.
     */
    public AcademicSchedule(String course, String day, int taskType) {
        this.course = course;
        this.day = day;
        this.taskType = taskType;
    }
    /**
     * The setCourse method stores a value in the 
     * course field.
     * @param course the value to store in course.
     */
    public void setCourse(String course) {
        this.course = course;
    }
    /**
     * The setDay method stores a value in the 
     * day field.
     * @param day the value to store in day.
     */
    public void setDay(String day) {
        this.day = day;
    }
    /**
     * The setTaskType method stores a value in the 
     * TaskType field.
     * @param taskType the value to store in taskType. 
     */
    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }
    /**
     * The getCourse method returns a AcademicSchedule
     * object's course.
     * @return The value in the course field.
     */
    public String getCourse() {
        return course;
    }
    /**
     * The getDay method returns a AcademicSchedule
     * object's day.
     * @return The value in the day field.
     */
    public String getDay() {
        return day;
    }
    /**
     * The getTaskType method returns a AcademicSchedule
     * object's TaskType.
     * @return The value in the TaskType field.
     */
    public int getTaskType() {
        return taskType;
    }
    /**
     * toString method
     * @return A string containing the AcademicSchedule object's  information. 
     */
    @Override
    public String toString() {
        return "course" + course 
                + "\nday=" + day 
                + "\ntaskType" + taskType ;
    }
    
    
} 
