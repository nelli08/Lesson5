//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum;
        int[][] z =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                };
        for (int i = 0; i < z.length; i++) {
            sum = 0;
            for (int j = 0; j < z[i].length; j++) {
                sum += z[i][j];
            }
            System.out.println(sum);
        }
    }
}