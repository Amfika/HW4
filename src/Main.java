import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Motor geelyEmgrand = new Motor(1.5, "Бензин", 103);//экземпляр класса
        Car car = new Car("Geely", "Dark grey", 2022);

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
        Car.choise();

    }
}
