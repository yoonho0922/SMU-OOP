import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework08 {

    public static Map<String, String> idMap;

    public static void main(String[] args) {
        initMap();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!idMap.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String pwd = sc.nextLine().trim();

            if (idMap.get(id).equals(pwd)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else{
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            }
        }
    }

    private static void initMap() {
        idMap = new HashMap<>();
        idMap.put("myId", "myPass");
        idMap.put("myId1", "myPass2");
        idMap.put("myId2", "myPass3");
    }

}
