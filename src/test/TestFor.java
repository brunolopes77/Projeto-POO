package test;

public class TestFor {
    public static void main(String[] args) {

        int count = 0;
        int aux = 0;
        int soPraTest = 0;
        int soPratest2 = 0;

        do {
            for (count = aux; count < aux + 1; count++) {
                soPraTest = 1;
            }
            aux++;
            count = aux;
            soPratest2++;
            System.out.println(count);
        }while(soPratest2 < 3);

    }
}

