package bai1;

public class equal {
    String id ;
    String name ;
    String email ;
    int age;

    public equal(String id) {
        this.id = id;
    }

    public equal(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
        return studentInfo;
    }
    public boolean equals(Object obj) {
        if (obj instanceof equal) {
            equal another = (equal) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
        }
        return false;
    }
}
