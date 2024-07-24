import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınız:");
            userName = inp.nextLine();
            System.out.print("Şifreniz:");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı:");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                    break;
                } while (select != 4);
                    System.out.println("İşleminiz tamamlanmıştır,tekrar görüşmek üzere.");
                    break;
            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı,tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur,lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }

            }


        }
    }
}