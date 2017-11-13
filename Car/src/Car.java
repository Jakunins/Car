abstract class Car {
    private String name;
    public void setName(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "name = " + name;
    }

    /**@Override**/
    public boolean equals(Car a) {
        return a.name.equals(this.name);

    }




    public void move(){
        System.out.println("Абстрактый класс CAR");
    }


}
