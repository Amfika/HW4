public class WheelL extends Car{
    public static String spinWL;
    public WheelL(String name, String color, int yearOfcar) { //конструктор наследуемый
        super(name, color, yearOfcar);
    }
    public static void spin2(){
        System.out.println("Крутится левое колесо!");
    }
}

