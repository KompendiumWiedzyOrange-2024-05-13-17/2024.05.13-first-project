public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[1000];
        int[] liczby = new int[100];
        double[] liczbyZmiennoprzecinkowe = new double[10];

        // komentarz
        // komentarz 2
        imiona[0] = "Mateusz"; // komentuje konkretna linie !!!
        imiona[100] = "Janusz";
        imiona[49] = "Karol";

        /*
        kjashgdgfasdf
        lsidkufygklhjsdfg
        sldfkjhgsdfg
        sldkfujhgksjhdgfgsd
        sdlkfjhglksdjhflkgjgsdf
         */
        System.out.println(imiona[0]);
        System.out.println(imiona[100]);

        System.out.println(imiona.length);

        int[] tablica = {1,2,3,4,5,6,7,8};

        System.out.println(tablica[3]);

        String[] tablica2 = {"jaki", "jakis inny", "cos"};

        System.out.println(tablica2[2]);

        int a;
        int[] tab = new int[5];
        int[][] tab2 = new int[5][10];

        tab2[0][1] = 7;

        int[][][] tab3D = new int[3][3][3];

        tab3D[0][0][0] = 4;

        int[] miniTab = tab2[2];
        System.out.println(miniTab[0]);

        int[][][][][][][][][][] tabXD = new int[3][3][3][3][3][3][3][3][3][3];
    }
}
