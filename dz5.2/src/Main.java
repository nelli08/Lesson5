//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] massiv = {-2, 4, -12, 6, 22, -8};
        for (int i = 0; i < massiv.length; i++){
            System.out.print(massiv[i]+"\t"); ;
        }
        for (int i = 0; i < massiv.length; i++) {
            int z;
            //massiv[i]= int z;
            if (massiv[i] < 0) {
                z = massiv[i] * -1;
                massiv[i] = z;
                //System.out.println(z * -1); ;
            }
        }
        System.out.println();
        for (int i = 0; i < massiv.length; i++){
            System.out.print(massiv[i]+"\t"); ;
        }
    }
}