package bai1;

import java.util.ArrayList;
import java.util.List;

public class EditStudent {
    public static void main(String[] args) {
        equal student1 = new equal("123", "Cong", "cong@gmail.com", 22);
        equal student2 = new equal("123", "Cong", "cong@gmail.com", 22);
        equal student3 = new equal("456", "Dung", "dung@gmail.com", 18);

        // tạo danh sách student
        List<equal> listStudents = new ArrayList<>();

        // thêm các đối tượng student vào listStudents
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        // tạo các đối tượng student chỉ có thuộc tính ID
        equal searchStudent1 = new equal("123");
        equal searchStudent4 = new equal("789");

        // tìm kiếm student trong danh sách
        System.out.println("Search student1: "
                + listStudents.contains(searchStudent1));
        System.out.println("Search student4: "
                + listStudents.contains(searchStudent4));
    }
}
