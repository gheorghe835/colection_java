package vehicle;

public class Printer {
    public static void main(String[] args) {
        int range1, range2;
        Vehicle minivan = new Vehicle(7, 16,21);
        Vehicle sportcar = new Vehicle(2,14,12);

        // Atribuirea valorilor câmpurilor din minivan

        range1 = minivan.range();
        range2 = sportcar.range();
        System.out.println("Un minivan poate transporta " + minivan.passengers +
                " de pasageri pe o distanță " + range1 + " kilometri.");
        System.out.println("Un sportcar poate transporta " + sportcar.passengers +
                " de pasageri pe o distanță " + range2 + " kilometri.");
        System.out.println(" //////////////////////////////////////// ");
        int [] nums = { 1, 2 , 3, 4, 5, 6 , 7, 8 , 9 , 10 };
        int summ = 0;
        for (int i: nums
             ) {

            //summ  += i;
            System.out.println(" Elementul :: " + i);
            if (i == 10)continue;
            if(i == 5)break;

            summ  += i;
        }
        System.out.println(" Suma elementelor :: " + summ);

        String str = """
                  Blocurile de text facilitează lucrul cu mai multe
                                                       linii deoarece
                                   elimină necesitatea de a utiliza
                                                              control
                                      pentru a indica o nouă linie.
                  Ca urmare, blocurile de text ușurează munca programatorului!
                                            și și și și și și și și
                                   -- it și.
                                                                                           
                                                                                           
                """;

        System.out.println(str);


    }
}
