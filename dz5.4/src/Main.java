//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int []massive ={2, 8, 44, 32, 27, 101, 0, -10};
    int a=0;
    int b=0;
    int resultat=0;
    for (int i =1; i< massive.length; i++){
        a=massive[resultat];
        b=massive[i];
        if (b>a){
            resultat=i;
        }
        }
        System.out.println(resultat);
        }

    }