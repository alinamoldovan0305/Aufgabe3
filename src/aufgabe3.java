public class aufgabe3 {
    //Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
    //Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
    public static int[] summe2Arrays(int zahl1[], int zahl2[]) {
        int[] ergebnis = new int[zahl1.length + 1];
        int übertrag = 0;

        for (int i = zahl1.length - 1; i >= zahl1[0]; i--) {
            int summe = zahl1[i] + zahl2[i] + übertrag;
            ergebnis[i + 1] = summe % 10;
            übertrag = summe / 10;
        }
        ergebnis[0]=übertrag;
        return ergebnis;
    }

}
