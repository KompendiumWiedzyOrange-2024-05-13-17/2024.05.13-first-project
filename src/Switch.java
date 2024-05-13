public class Switch {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        switch(a) {
            case 1:
                System.out.println("To jest 1 !!!");
                break;
            case 2:
                System.out.println("To jest 2 !!!");
                break;
            case 3:
                System.out.println("To jest 3 !!!");
                break;
            default:
                System.out.println("Nie wiadomo co to !!!");
                break;
        }

        int k = 5;
        switch (k) {
            case 1:
                System.out.println("Krok 1");
            case 2:
                System.out.println("Krok 2");
            case 3:
                System.out.println("Krok 3");
            case 4:
                System.out.println("Krok 4");
            case 5:
                System.out.println("Krok 5");
        }
    }
}
