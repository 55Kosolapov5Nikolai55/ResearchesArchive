package kosolapov.niko.TrainsgetClassExample;

public class PassengerTraingetClass extends TraingetClass{
    private int passengers;

    public PassengerTraingetClass(){}

    public PassengerTraingetClass(String route , int wagons , int wayLength , int passengers , int ID){
        super(route, wagons , wayLength , ID);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if(passengers > 0 && passengers <= 450) {
            this.passengers = passengers;
        }else {
            System.out.println("Incorrect passengers' quantity!");
        }
    }
}
