package view;

import java.util.Scanner;

public class UserView {
    private final Scanner scanner;
    public UserView(Scanner scanner){
        this.scanner=scanner;
        
    }

    public void insert() {
        System.out.println("== 전화번호 등록 ==");
        // 이름 : 무조건 한글만. 중간 공백 없이
        System.out.println("이름 : ");
        String name = scanner.next();
        // 나이 : 0세~120세 사이값
        System.out.println("나이 : ");
        int age = scanner.nextInt();
        // 주소
        System.out.println("주소 : ");
        String address = scanner.next();
        // 전화번호(010-xxxx-xxxx)
        System.out.println("전화번호 : ");
        String phone = scanner.next();

    }

    public void update() {
    }

    public void delete() {
    }

    public void searchAll() {
    }

    public void searchOne() {
    }
}
