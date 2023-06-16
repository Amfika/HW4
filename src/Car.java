import java.util.Scanner;

public class Car{
    public String spinWR;
    String name;
    String color;
    int yearOfcar;
    Motor[] characters;

    public Car(String name, String color, int yearOfcar){
        this.name = name;
        this.color = color;
        this.yearOfcar = yearOfcar;
        this.characters = characters;
    }

    public static void choise() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("С какой стороны происходит крепление правого колеса? (слева, справа): ");
                String choisefromC = scanner.nextLine();
                if (choisefromC.equals("слева")) {
                    WheelR.spinWR = choisefromC;
                    WheelL.spinWL = "справа";
                    System.out.println("Верно! Свойство объекту 'Правое колесо' присвоено: " +
                            WheelR.spinWR + "\nСоответственно левое справа! Свойство объекту 'Левое колесо' присвоено: " +
                            WheelL.spinWL);
                    break;

                } else {
                    System.out.println("Ну и чё ты ввёл??? Давай-ка ещё раз!");
                }
            } catch (Exception e) {
                System.out.println("Поймали");
            }
        }
    }

    public static void spinWeels(){
        System.out.println("Происходит прокрутка колёс: ");
    }


}
