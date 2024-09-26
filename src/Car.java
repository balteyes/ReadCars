public class Car {
    String name;
    String color;
    String classType;

    public Car(String name, String color, String classType) {
        this.name = name;
        this.color = color;
        this.classType = classType;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", classType='" + classType + '\'' +
                '}';
    }
    public void makeNoise(){
        System.out.println("Дрынь-дрынь-дрынь");
    }



}
