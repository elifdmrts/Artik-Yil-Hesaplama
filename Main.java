import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yıl;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yıl=scanner.nextInt();
        if (yıl %4==0){
            System.out.println(yıl+" Bir Artık Yıldır!");
        }else System.out.println(yıl+" Bir Artık Yıl Değildir!");
    }
}