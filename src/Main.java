import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 9;

        //1-ter Unterpunkt
        System.out.println("Summe von zwei Arrays: "+ Arrays.toString(aufgabe3.summe2Arrays(zahl1,zahl2)));

        //2-ter Unterpunkt
        System.out.println("Differenz von zwei Arrays: "+ Arrays.toString(aufgabe3.diff2Arrays(zahl1,zahl2)));

        //3-ter Unterpunkt
        System.out.println("Multiplikation von ein Array mit eien Zahl: "+ Arrays.toString(aufgabe3.multiplikation(zahl1,ziffer)));

    }
}
