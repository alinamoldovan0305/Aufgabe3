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
    public static int VergleichenvonArrays(int[] zahl1, int[] zahl2) {
        for (int i = 0; i < zahl1.length; i++) {
            if (zahl1[i] > zahl2[i]) return 1;
            if (zahl1[i] < zahl2[i]) return -1;
        }
        return 0;
    }

    public static int[] diff2Arrays(int zahl1[], int zahl2[]) {
        int cmp = VergleichenvonArrays(zahl1,zahl2);
        int[] ergebnis = new int[zahl1.length + 1];
        int ausleihen = 0;
        int[] unten,oben;
        if (cmp == 0) {
            return new int[zahl1.length]; // toate 0
        }
        if(cmp == 1) {
            oben=zahl1;
            unten=zahl2;
        } else {
            oben=zahl2;
            unten=zahl1;
        }
        for (int i=oben.length-1; i>=0; i--) {
            int diff=oben[i]-ausleihen;
            int untenZahl=unten[i];

            if (diff<untenZahl) {
                diff+=10;
                ausleihen=1;
            } else {
                ausleihen=0;
            }

            ergebnis[i]=diff-untenZahl;
        }
        return ergebnis;
    }
}
