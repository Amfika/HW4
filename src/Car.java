import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

    public Car(String spinWR){
        this.spinWR = spinWR;
    }

    public static void spinWeels(){
        System.out.println("Происходит прокрутка колёс: ");
    }


}
