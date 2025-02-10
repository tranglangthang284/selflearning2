import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Math stepH = new Math();
        stepH.h01();
    }
    void h01() {
        Scanner s = new Scanner(System.in);
        int lotto [] = new int [6];
        int count;
        String onemore;
        int i;

        for (count = 0; count < 6; count++){
            lotto[count] = (int)((Math.random() * 45) +1);
            for (i = 0; i < count; i++){
                if (lotto[count] == lotto[i]) {
                    count--;
                    break;

                }
            }
        }
        System.out.print("The generated lotto numbers are ");
        for(count = 0; count < 6; count++)
            System.out.print(lotto[count] + " ");
        System.out.println();


    }
}
