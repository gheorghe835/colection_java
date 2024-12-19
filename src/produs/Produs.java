package produs;

public class Produs {
   /*  Clasa Produs
Creează o clasă Produs cu atribute: nume (String), pret (double), stoc (int).
Adaugă metode pentru a crește și a scădea stocul.
Adaugă o metodă pentru a aplica un discount asupra prețului.*/
String name;
double price;
int stock;
public Produs(String name, double price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
}
     // Metodă pentru a crește stocul
     public void upStock(int cantitate) {
        if (cantitate > 0) {
            stock += cantitate;
            System.out.println("Stocul a fost crescut cu " + cantitate + ". Stoc actual: " + stock);
        } else {
            System.out.println("Cantitatea trebuie să fie mai mare decât 0.");
        }
     
     }
     //Metoda pentru a scadea stocul
     public void downStock(int cantitate){
        if (cantitate>0 & cantitate<stock) {
            stock -= cantitate;
            System.out.println("Stocul a fost scazut cu " + cantitate
            + ". Stocul actual: " + stock);
        }
        else if(cantitate>stock){
            System.out.println("Stoc insuficient. Stoc actual: " + stock);
        }
        else System.out.println("Cantitatea trebuie sa fie mai mare decit 0.");

     }
     //Metoda pentru a aplica un discount
     public void addDiscount(double precent){
        if (precent>0 & precent<=100) {
            price -= price*(precent/100);
            System.out.println("Discount de " + precent + " % aplicat. Pret actual: " + price);
        }
        else System.out.println("Procentul rebuie sa fie intre 0 si 100 ");
     }
     //Metoda pentru a afisa un produs
     public void showDetails(){
        System.out.println("Produsul: " + name + ", Pretul: " + price + ", Stocul: " + stock);
     }

}
