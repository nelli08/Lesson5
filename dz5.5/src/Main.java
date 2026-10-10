//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int result = 0;
        int f=0;
        int[] massive = {3, 22, 56,  11, 4, 22};
        for (int i = 0; i < massive.length-1; i++) {
            for ( int j=i+1; j < massive.length; j++) {
                a = massive[i];
                b = massive[j];
                if (a == b) {
                    result = 1;
                }

            }
        }
        if (result == 1) {
            System.out.println("В массиве есть повторяющиеся элементы");
        } else {
            System.out.println("В массиве нет повторяющихся элементов");
        }
    }
}