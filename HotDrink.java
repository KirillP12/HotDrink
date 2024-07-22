

public class HotDrink extends Product{
    
    private int temperature; //  1 сначало поле
    private int value;

    public HotDrink(String name, double price, int temperature, int value){ // 2 потом конструктор
        super(name, price);
        this.temperature = temperature;
        this.value = value;
    }

    public int getValue(){ // 3 потом методы
        return value;
    }

    public int getTemperature(){
        return temperature;
    }

    @Override // аннотация это комметнарий для компилятора, новая реализация для существуещего метода
        public String toString() {
            return super.toString() + "temperature : " + temperature + "value: " + value;
            // return super.toString(); // super как и this но только super возвращает ссылку на родительский объект,
            // а this на текущий

    }
}