import java.util.Scanner;

/*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

 */
public class main {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("üçgenin a kenarını giriniz: ");
        int a = scanner.nextInt();

        System.out.println("Üçgenin b kenarını giriniz : ");
        int b = scanner.nextInt();

        System.out.println("üçgenin c kenarını giriniz :");
        int c = scanner.nextInt();


        int cevre = (a + b + c)/2;
        int u = cevre;
        int alan =  u * ( u - a )*(u - b)*(u-c);
        System.out.println("Üçgenin alanı : " + u);

    }
}
