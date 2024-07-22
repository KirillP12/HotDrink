

public class Product {
    
    String name;
    double price; // мы используем эту переменную для хранения информации

    public Product(String name, double price) { // метод конструктор пишется с большой буквы, он такой единственный
        this.name = name;
        this.price = price;
    }

    public String getName(){ // пояснения к этому методу, у него нельзя просто взять и вызвать методо, 
        // только если обратимся к конкретному объетку и у него вызвать метод
        return name;
    }
    
    // public void setName(String name) { // эта функция принимает String name и сохраняет его в поле класса
    //     this.name = name; // первый name это поле объекта, а второй name это аргумент метода
    //     // this это обращение к конкретному объекту класса, он возвращает ссылку на текущий объект
    // } // в java  почти все типпы данных ссылочных, кроме примитивных

    public double getPrice(){
        return price;
    }
    
    // public void setPrice(double price) {
    //     this.price = price; // можно для райс добавить единичку, в аргументе, тогда не обязательно писать this.
    //     // тут мы присвоили из аргумента, переменной price 1
    //     // price = price1 но в таком случае и в аргументе надо писать метода setPrice(double price1), тогда 
    //     // имена не совпадают
    // }

    @Override // аннотация это комметнарий для компилятора, новая реализация для существуещего метода
        public String toString() {
            return "name: " + name + ", price: " + price + "p.";
            // return super.toString(); // super как и this но только super возвращает ссылку на родительский объект,
            // а this на текущий
        }
    
}
