import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exampleWrite();
       exampleRead();


    }
public static List<Car> makeCars(){
    List<Car> carList = new ArrayList<>();
    carList.add(new Car("Audi", "white", "offRoad"));
    carList.add(new Car("BMW", "black", "coupe"));
    carList.add(new Car("Mercedes", "red", "hatchback"));
    carList.add(new Car("Volkswagen", "green", "sedan"));
    return carList;
}
private static void exampleWrite(){
        List<Car> cars = makeCars();
        writeCarListToTxt(cars, "output.txt");
}


    public static void writeCarListToTxt(List<Car> cars, String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            for (Car car1 : cars)
                fileWriter.write(car1.toString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("что-то не так с записью в файл");
            System.out.println(e.getMessage());
        }
    }

    public static List<Car> readCars(String filename){
        List<Car> carList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
                        while (scanner.hasNext()) {
                String a = scanner.next();
                String b = scanner.next();
                String c = scanner.next();

                Car ccc = new Car(a, b, c);
                carList.add(ccc);
            }
        } catch (IOException e) {
            System.out.println("что-то не так с записью в файл");
            System.out.println(e.getMessage());;
        }
        return carList;
    }

    public static void printCars(List<Car> cars){
        for (Car ccc: cars)
            System.out.println(ccc);
    }


    private static void exampleRead(){
        List<Car> cars = readCars("output.txt");
        printCars(cars);
        System.out.println(cars);


    }


    }


