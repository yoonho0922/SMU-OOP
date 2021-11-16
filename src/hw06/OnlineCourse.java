package hw06;

public class OnlineCourse extends Course {

    public OnlineCourse(String code, String name) {
        super(name, code);
    }

    @Override
    public String toString() {
        String s = "Code: " + super.code + ", Name: " + super.name + ", Type: Online";
        return s;
    }
}
