import java.util.Scanner;
public class ScanerTest {

    public static void main(String[] args) {


        int startCostBonus;
        startCostBonus = 20;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите стоимость билета: ");

        int ticketCost = in.nextInt();
        System.out.println("Количество бонусных миль : " + ticketCost / startCostBonus);
        in.close();

    }
}
