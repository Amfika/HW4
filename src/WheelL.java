public class WheelL extends WheelR{

    public String spinWL;

    public WheelL(String spinWL){
        super(String.valueOf(spinWL));
    }

    public WheelL(String name, String color, int yearOfcar) { //конструктор наследуемый
        super(name, color, yearOfcar);
    }

    public static void spin2(){
        //spinWeels();
        System.out.println("Крутится левое колесо!");
    }
}

