package hw02;

public class Student {
    private int number;
    private String name;
    private String major;
    private String phoneNum;

    public Student(int number, String name, String major, String phoneNum) {
        this.number = number;
        this.name = name;
        this.major = major;
        this.phoneNum = phoneNum;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return number +
                " " + name +
                " " + major +
                " " + phoneNum;
    }
}
