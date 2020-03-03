public class TEST3{
    public static void main(String args[]){
        String name = "James";
        //following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
    }
}

class Vehicle{}
public class Car extends Vehicle {
    public static void main(String args[]){
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println( result );
    }
}