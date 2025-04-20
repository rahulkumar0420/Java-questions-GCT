import java.util.ArrayList;

class course {
    String courseName;
    ArrayList<String> enrolledStudents = new ArrayList<>();
    static int maxCapacity = 30;

    course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Cannot enroll. Max capacity reached.");
        }
    }

    void unenrollStudent(String studentName) {
        if (enrolledStudents.remove(studentName)) {
            System.out.println(studentName + " unenrolled from " + courseName);
        } else {
            System.out.println(studentName + " is not enrolled.");
        }
    }

    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    public static void main(String[] args) {
        course javaCourse = new course("Java Programming");
        javaCourse.enrollStudent("Alice");
        javaCourse.enrollStudent("Bob");

        javaCourse.unenrollStudent("Alice");
        course.setMaxCapacity(50);
    }
}
