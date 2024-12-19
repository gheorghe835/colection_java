package book;

public class Book {
/*    Clasa Carte
 Creează o clasă numită Carte cu următoarele atribute: titlu (String), autor (String), numarPagini (int).
Adaugă un constructor pentru inițializarea atributelor.
Creează o metodă care verifică dacă cartea are mai mult de 300 de pagini.*/
    String title;
    String author;
    int numberPages;

    public Book(String title, String author, int numberPages) {
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }
    String typeBook(){

        if(numberPages < 300){
            return (" - este o carte mica");
        }
        else return (" - este o carte mare");

    }
}
