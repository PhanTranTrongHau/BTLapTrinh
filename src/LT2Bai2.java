import java.util.Scanner;

public class LT2Bai2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 so a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.print("Phuong trinh vo so nghiem");
            }
            else{
                System.out.print("Phuong trinh vo nghiem ");
        }
    } 
    else
 
        if(a != 0){
            double Delta = Math.pow(b, 2) - 4 * a * c;
            if(Delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            if(Delta == 0){
                double x = -b/(2*a);
                System.out.printf("Phuong trinh co nghiem kep: %.2f", x);
            }else
            if(Delta > 0){
                double x1 = (-b + Math.sqrt(Delta))/(2*a);
                double x2 = (-b - Math.sqrt(Delta))/(2*a);
                System.out.printf("Pt co nghiem kep %.2f %.2f",x1, x2);
            }
            }
        } 
    }
}

