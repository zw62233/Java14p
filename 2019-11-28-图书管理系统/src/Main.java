import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = login();

        while(true){
            System.out.println("欢迎"+user.name+"8848图书管理系统");
            user.Menu();
            System.out.println("请选择要使用的功能：");
            int select = scanner.nextInt();
            user.Operation(select);
        }
    }

    private static User login() {
        System.out.println("请输入用户名：");

        System.out.println("请选择用户身份：");



        return  u;
    }
}
