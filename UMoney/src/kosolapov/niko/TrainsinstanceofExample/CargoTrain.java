package kosolapov.niko.TrainsinstanceofExample;

public class CargoTrain extends Train{
    private float cargoWeight;

    public CargoTrain(){}

    public CargoTrain(String route, int wagons , int wayLength , float cargoWeight , int ID){
        super(route, wagons, wayLength , ID);
        this.setCargoWeight(cargoWeight);
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(float cargoWeight) {
        if(cargoWeight > 0 && cargoWeight <= 12000) {
            this.cargoWeight = cargoWeight;
        }else {
            System.out.println("Incorrect cargo's weight");
        }
    }
}
