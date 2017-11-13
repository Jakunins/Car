public class TestCar {
    public static void main(String[] args) {
        Car bus = new Bus();
        Car truck = new Truck();



        bus.setName("SETRA");
        truck.setName("VOLVO");
        System.out.println(bus.toString());
        System.out.println(truck.toString());


        if (bus.equals(truck)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (bus.equals(bus)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



        bus.move();
        truck.move();
    }

}
