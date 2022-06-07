package bai1;

import java.util.*;

public class Total {

    public static void main(String[] args) {
//        total();
      bill();
    }
    public static void total(){
        int n;
        int check;
        int sum = 0;
        System.out.println("Tinh tong cac so tu 0-> n");
        System.out.print("Nhap so n: ");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i <= n ; i++ ){
            sum = sum+ i;
        }
        System.out.println("tong cac so tu 0 -> "+ n+ " la: " + sum);
        System.out.println("Ban co muon thoat chuong trinh khong (0(thoat) / 1(tiep tuc)): ");
        check = sc.nextByte();
        if (check == 0){
            return;
        }else {
            total();
        }

    }

    public static void bai2(){
        List<Integer> mylist = new ArrayList<>();
        System.out.println("nhap phan tu cua mang");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("nhap so thu "+(i+1) + ": " );
            mylist.add(sc.nextInt());
        }
        System.out.println("Mang cua ban la");
        System.out.println(mylist.toString());

        int n = mylist.size();
        for ( int i = 0; i < n-1; i++)
            for (int j = i+1; j < n; j++){
                if( mylist.get(i) > mylist.get(j) ){
                     int temp =  mylist.get(j);
                     mylist.set(j,mylist.get(i)) ;
                     mylist.set(i,temp);
                    }
                }
        System.out.println(mylist);
            }

    public static void bill() {
        List<MyBill> myBills = new ArrayList<>();
        MyBill bill1 = new MyBill(1, "bun cha ", 23000, "12/5/2022");

        MyBill bill2 = new MyBill(2, "Bun dau ", 30000, "12/5/2022");

        MyBill bill3 = new MyBill(3, "Com nam ", 20000, "10/5/2022");

        MyBill bill4 = new MyBill(4, "Com suon",40000, "11/5/2022");

        MyBill bill5 = new MyBill(5, "Com tam ", 20000, "10/5/2022");



        myBills.add(bill1);
        myBills.add(bill2);
        myBills.add(bill3);
        myBills.add(bill4);
        myBills.add(bill5);


        System.out.println("Mang ban dau");
        for (int i = 0; i < myBills.size(); i++) {
            System.out.println(myBills.get(i));
        }
        Collections.sort(myBills, new Comparator<MyBill>() {
            @Override
            public int compare(MyBill o1, MyBill o2) {
                return (int) (o1.getMoney()-o2.getMoney());
            }
        });
        System.out.println("Sau khi sap xep");
        for (int i = 0; i < myBills.size(); i++) {
            System.out.println(myBills.get(i));
        }
    }


}


