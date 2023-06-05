import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Motor geelyEmgrand = new Motor(1.5, "Бензин", 103);//экземпляр класса
        Car car = new Car("Geely", "Dark grey", 2022);
        String wheelR = new WheelR("слева").toString();
        String wheelL = new WheelL("справа").toString();

        System.out.println(
                "Марка авто: " + car.name +
                        "\nЦвет: " + car.color +
                        "\nГод выпуска: " + car.yearOfcar +
                        "\nОбъём: " + geelyEmgrand.enginCapasity +
                        "\nЛошадиных сил: " + geelyEmgrand.horsePover +
                        "\nТип топлива: " + geelyEmgrand.typeEngin
        );

        WheelR.spin();
        WheelL.spin2();

        while (true) {
            System.out.print("С какой стороны происходит крепление правого колеса? (слева, справа): ");
            Scanner scanner = new Scanner(System.in);
            String  choise = scanner.nextLine();
            if (Objects.equals(choise, "слева")) {
                wheelR = choise;
                String wheel2 = wheelL;
                if (choise == choise){
                    wheel2 = "справа";
                }
                System.out.println("Верно! Свойство объекту 'Правое колесо' присвоено: " +
                        wheelR + "\nСоответственно левое справа! Свойство объекту 'Левое колесо' присвоено: " + wheel2);
                break;
            } else if (Objects.equals(choise, "справа")){
                System.out.println("Не верно! Попробуйте ещё:");
            }else {
                System.out.println("Ну и чё ты ввёл??? Давай-ка ещё раз!");
            }
        }


    }
}
