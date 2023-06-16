public class WheelR extends Car{

    public static String spinWR;
    public WheelR(String name, String color, int yearOfcar) { //конструктор родителя
        super(name, color, yearOfcar);
    }
    public static void spin(){
        spinWeels();
        System.out.println("Крутится правое колесо!");
    }
}

