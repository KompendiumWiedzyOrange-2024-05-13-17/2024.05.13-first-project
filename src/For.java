public class For {
    public static void main(String[] args) {
        int[] tab = new int[1000];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = (i+1)*2;
        }

        for(int element : tab) {
            System.out.println(element);
        }
    }
}
