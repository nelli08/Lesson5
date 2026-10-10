//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] massiv = {2, 4, 12, 6, 22, 8};
            for (int i = 0; i < massiv.length; i++){
                sum += massiv[i];
            }
        System.out.println( "Среднее значение чисел: " + sum/ massiv.length);
        }
    }