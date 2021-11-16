package hw06;

public class OfflineCourse extends Course{

    public OfflineCourse(String code, String name) {
        super(name, code);
    }

    @Override
    public String toString() {
        String s = "Code: " + super.code + ", Name: " + super.name + ", Type: Offline";
        return s;
    }
}
