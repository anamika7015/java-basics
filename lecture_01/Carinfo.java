package lecture_01;
class car{
    String model;
    String fuel_type;
    public car(String a, String b){
        this.model = a;
        this.fuel_type = b;

}
    void showinfo(){
        System.out.println("car_model "+this.model);
        System.out.println("car fuel_type "+this.fuel_type);
    }
}

public class Carinfo {
    public static void main(String[] args) {
        car a1 = new car("tesla","electric");
        a1.showinfo();
        car a2 = new car("maruti","petrol");
        a2.showinfo();
        
    }
}
