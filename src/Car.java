public class Car {

    private String brand;
    private int year;
    private int numberOfWheels;
    private int numberOfDoors;
    private boolean cab;
    private int gearNumber;
    private boolean isPedalPushedIn;


    public Car(String brand, int year, int Wheels, int Doors, boolean cab) {
        this.brand = brand;
        this.year = year;
        this.numberOfWheels = Wheels;
        this.gearNumber = 0;
        this.isPedalPushedIn = false;
        this.numberOfDoors = Doors;
        this.cab = cab;



    }

    public void printSpeedInfo(){
        if(this.gearNumber == 0 || !this.isPedalPushedIn){
            System.out.println("Stationary");
        }
        else if(this.gearNumber == -1 && this.isPedalPushedIn){
            System.out.println("Reversing");
        }
        else{
            System.out.println("Car is moving in gear " + this.gearNumber);
        }

    }

    public String getBrand() {
        return this.brand;


    }

    public int getYear() {
        return this.year;

    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;


    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;


    }

    public int getGearNumber(){
        return this.gearNumber;
    }


    public boolean getCab(){
        return this.cab;


    }

    public boolean getPedalPushedIn(){
        return this.getPedalPushedIn();


    }

    public void getCarInfo(){
        System.out.print("Brand: " +  this.brand + "\n");
        System.out.print("Made in year: " + this.year + "\n");
        System.out.print("number of wheels: " + this.numberOfWheels + "\n");
        System.out.print("number of doors my niigg: " + this.numberOfDoors + "\n");
        if (this.getCab()){
            System.out.print("nigga i gots a rooof\n");
        }
        else {
            System.out.print("nigga i can't afford a roof" + "\n");
        }
        System.out.print("I am in gear: " + this.gearNumber + "\n");
        this.printSpeedInfo();
        System.out.println();
    }
    public void gearUp(){
        this.gearNumber += 1;
    }

    public void gearDown(){
        this.gearNumber -= 1;
    }

    public void pushGas(){
        this.isPedalPushedIn = true;

    }

    public void setReverse(){

    }


}
