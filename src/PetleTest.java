public class PetleTest {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            //wczytuje goscia z bazy
            if(i == 5) {
                continue;
            }

            //jakie rzeczy z tym klientem
            System.out.println(i);
        }
    }
}
