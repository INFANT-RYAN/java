public class ClassObj1 {
    String make,model;
    int year;
    void setmake(String make){
        this.make=make;
    }
    void setmodel(String model){
        this.model=model;
    }
    void setYear(int year){
        this.year=year;
    }
    public static void main(String[] args) {
        ClassObj1 Car = new ClassObj1();
        Car.setmake("honda");
        Car.setYear(2024);
        Car.setmodel("model1");
        System.out.println("Make: " + Car.make);
        System.out.println("Year: " + Car.year);
        System.out.println("Model: " + Car.model);
    }
}
class Car{
    

}