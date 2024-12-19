package book;

public class Printer {
    public static void main(String[] args) {
        int type1 , type2;
        Book book1 = new Book("Amintiri din copilarie","Ion creanga",347);
        Book book2 = new Book("Versuri","Mihai Eminescu",87);

       // type1 = book1.typeBook();

        System.out.println("  Cartea :: " + book1.title + ", scrisa de " + book1.author + " ce contine " +
                           book1.numberPages + " de pagini " + book1.typeBook() );
        System.out.println("  Cartea :: " + book2.title + ", scrisa de " + book2.author + " ce contine " +
                           book2.numberPages + " de pagini " + book2.typeBook() );
    }


}
