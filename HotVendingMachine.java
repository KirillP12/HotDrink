

import java.util.ArrayList;
import java.util.List;

// import mending.machine.HotDrink;

public class HotVendingMachine {

    private List<HotDrink> hotDrinks; // зачем это ?????

    public HotVendingMachine(){ // я это сделал, потому что, мне нужен метод, в методе есть переменная, которой я присвоил класс ArrayList()
        hotDrinks = new ArrayList<>(); // теперь он сможет  записывать в себя hotDrink
    }

    public HotDrink getByNameHot(String nameHotDrinks){  // это мой класс, у которого есть свой метод getByNameHot,  
        for (HotDrink hotDrinks: hotDrinks){ // поле метода реализовано циклом, перебором переменной в ArrayList, который присвоен переменной hotDrinks
            if (hotDrinks.getName().equals(nameHotDrinks)){ // getName работает для hotDrinks, потому что он является дочерним или нет??????
                return hotDrinks;
            }// всё это я реализовал для поиска моего напитка
        }
        return null;

    }

    public void addHotDrink(HotDrink hotDrink){
        hotDrinks.add(hotDrink); // решено +
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список напитков:\n");
        for (HotDrink hotDrink : hotDrinks){// решено +
            stringBuilder.append(hotDrink);
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }


}