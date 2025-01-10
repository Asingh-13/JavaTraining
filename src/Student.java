public class Student {
    int rollNo;
    String name;
    String classNAme;
    int phNo;
    String email;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNAme() {
        return classNAme;
    }

    public void setClassNAme(String classNAme) {
        this.classNAme = classNAme;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int rollNo, String name, String classNAme, int phNo, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.classNAme = classNAme;
        this.phNo = phNo;
        this.email = email;
    }
}
