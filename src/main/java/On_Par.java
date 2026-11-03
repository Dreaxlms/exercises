import java.util.Scanner;

public class On_Par {

    static Scanner input = new Scanner(System.in);



    public static int scores() {
        int total = 0;
        for (int i = 1; i <= 18; i++){
            System.out.println("Enter Par for Hole "+i);
            int par = input.nextInt();
            System.out.println("Enter scores for Hole "+i);
            int score = input.nextInt();

            int diff = score - par;
            total = total + diff;
            System.out.println(total);
        }
        return total;

    }

}

void main() {
    int method = On_Par.scores();
    System.out.println(method);
}