package bai1;

import java.util.ArrayList;
import java.util.List;

public class EditStudent {
    public static void main(String[] args) {
        equal student1 = new equal("123", "Thanh", "thanh@gmail.com", 22);
        equal student2 = new equal("123", "Khai", "khai@gmail.com", 22);
        equal student3 = new equal("456", "Dao", "dao@gmail.com", 18);


        List<equal> listStudents = new ArrayList<>();


        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        equal searchStudent1 = new equal("123");
        equal searchStudent4 = new equal("789");

        System.out.println("Search student1: "
                + listStudents.contains(searchStudent1));
        System.out.println("Search student4: "
                + listStudents.contains(searchStudent4));
    }
}
