import java.util.Scanner;

public class convert {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số: ");
            int so = sc.nextInt();
            String[] soThanhChu = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "" +
                    "Chín"};
            if (so < 10) {
                System.out.println(soThanhChu[so]);
            } else if (so < 100) {
                int hangChuc = so / 10;
                int hangDonVi = so % 10;
                if (hangChuc == 1) {
                    if (hangDonVi == 0) {
                        System.out.println("Mười");
                    } else if (hangDonVi == 5) {
                        System.out.println("Mười Lăm");
                    } else {
                        System.out.println("Mười " + soThanhChu[hangDonVi]);
                    }
                } else {
                    if (hangDonVi == 0) {
                        System.out.println(soThanhChu[hangChuc] + " mươi");
                    } else {

                        System.out.println(soThanhChu[hangChuc] + " mươi " + soThanhChu[hangDonVi]);
                    }
                }
            } else if (so <1000){
                int hangDonvi = so % 10;
                int hangChuc = (so /10) %10;
                int hangTram = so / 100;
                if (hangChuc == 1){
                    if (hangDonvi == 0){
                        System.out.println(soThanhChu[hangTram]+"trăm" + "mười");
                    } else {
                        System.out.println(soThanhChu[hangTram]+"trăm"+ "mười" +soThanhChu[hangDonvi]);
                    }
                } else {
                    if (hangDonvi==0) {
                        System.out.println(soThanhChu[hangTram]+"trăm"+soThanhChu[hangDonvi]+"mươi");
                    } else {
                        System.out.println(soThanhChu[hangTram] + " trăm " + soThanhChu[hangChuc] + " mươi " + soThanhChu[hangDonvi]);

                    }
                }

            }
        }
    }