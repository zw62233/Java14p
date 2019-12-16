public class Animal {
    int color;
    int numberOfLegs;

    public void sream(){
        System.out.println("吱吱");
    }

    Animal(){
        color = 0;
        numberOfLegs = 1;
    }
    Animal(int color,int num){
        this.color = color;
        numberOfLegs = num;
    }
}
