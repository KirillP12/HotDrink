

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        HotVendingMachine hotVendingMachine = new HotVendingMachine();
        Product product1 = new Product("Twix",100);
        Product product2 = new Product("Coca-cola",110);
        Product product3 = new Product("Lays",80);
        Product product4 = new HotDrink("Tea", 60, 40, 40 );
        Product product5 = new HotDrink("coffee", 100, 50, 50 ); 


        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);
        

        System.out.println(product1.name);
        System.out.println(product1.price);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4); // вот так можно получить полное описание объекта
        System.out.println(vendingMachine);
        System.out.println(hotVendingMachine); // напитки почему не перечисляются?????? 


        // @Override // аннотация это комметнарий для компилятора, новая реализация для существуещего метода
        // public String toString() {
        //     return "name:" + name + ", price: " + price + "p.";
        //     // return super.toString(); // super как и this но только super возвращает ссылку на родительский объект,
        //     // а this на текущий
        // }
        
        



    }
    
}
