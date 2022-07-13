import java.text.DecimalFormat;
import java.util.Scanner;

public class DollarToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Enter value in Dollar:");
        double dlr = Double.parseDouble(scanner.nextLine());
        double bgn = dlr*1.64549;
        System.out.println("Value in BGN: " + df.format(bgn));
    }
}