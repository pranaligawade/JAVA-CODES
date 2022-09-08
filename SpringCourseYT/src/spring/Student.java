package spring;


public class Student {
    private int studId;
    private String name;
    private String StudAddress;

    public Student() {
    }

    public Student(int studId, String name, String studAddress) {
        this.studId = studId;
        this.name = name;
        StudAddress = studAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", StudAddress='" + StudAddress + '\'' +
                '}';
    }

    public int getStudId() {

        return studId;
    }

    public void setStudId(int studId) {
        System.out.println("student id");
         this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set student name");
        this.name = name;
    }

    public String getStudAddress() {
        return StudAddress;
    }

    public void setStudAddress(String studAddress) {
        StudAddress = studAddress;
    }
}
