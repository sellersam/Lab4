package Lab4;

/**
 * Faculty.java
 * Date Modified: 02-12-2018
 * @author Alex Sellers
 *
 * Faculty is a child class of Employee. It specifically describes UNK employees who work as professors, and stores the
 * courses that they teach.
 */
public class Faculty extends Employee {

    private String[] courses;

    /**
     * Primary Faculty Constructor
     * Uses super constructor to set Faculty name and salary, and also stores the courses taught by instance of Faculty
     *
     * @param name - Faculty name
     * @param salary  - Faculty salary
     * @param courses - Faculty courses
     */
    public Faculty(String name, int salary, String[] courses) {

        // use Employee constructor to set first two fields
        super(name, salary);

        // instantiate array of appropriate size to store Faculty's courses
        this.courses = new String[courses.length];

        // copy each course into Faculty's courses array
        for (int i = 0; i < courses.length; i++) {

            this.courses[i] = courses[i];
        }
    }

    /**
     * getName Method
     *
     * @return name - obtained from Employee parent class, with "Professor " appended to the beginning
     */
    public String getName() {

        return String.format("Professor %s", super.getName());
    }

    /**
     * getCourses Method
     *
     * @return coursesCopy - an array identical to the one storing the Faculty's courses
     */
    public String[] getCourses() {

        String[] coursesCopy = new String[courses.length];

        for (int i = 0; i < courses.length; i++) {

            coursesCopy[i] = courses[i];
        }

        return coursesCopy;
    }

    /**
     * getCourseNames Method
     *
     * @return courseNames - a string containing the name of each of the Faculty's courses
     */
    public String getCourseNames() {

        String courseNames = "";

        for (int i = 0; i < courses.length; i++) {

            // add each course name to the string
            courseNames += String.format("%-4s", courses[i]);
        }

        return courseNames;
    }

    /**
     * setCourses Method
     *
     * @param addCourses - new Faculty course list to replace the old one
     */
    public void setCourses(String[] addCourses) {

        // courses references a new array of the size of the one passed in
        courses = new String[addCourses.length];

        for (int i = 0; i < addCourses.length; i++) {

            // add each of the new courses to the new array
            courses[i] = addCourses[i];
        }
    }

    /**
     * toString Method
     *
     * @return String containing all information specific to Faculty (their name including title and the courses that
     * they teach)
     */
    public String toString() {

        return String.format("Faculty Name: %s\nFaculty Courses: %s\n", getName(), getCourseNames());
    }
}
