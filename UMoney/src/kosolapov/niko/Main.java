package kosolapov.niko;


import kosolapov.niko.TrainsgetClassExample.CargoTraingetClass;
import kosolapov.niko.TrainsgetClassExample.PassengerTraingetClass;
import kosolapov.niko.TrainsinstanceofExample.CargoTrain;
import kosolapov.niko.TrainsinstanceofExample.PassengerTrain;

public class Main {

    public static void main(String[] args) {
        /* 1) Conception's test with hierarchy.
           2) Conception's test ignoring hierarchy.
         */

                                                         //1)

        System.out.println("Conception's test with hierarchy:");

        //Reflexivity
        PassengerTrain testPassengersTrain = new PassengerTrain("Moscow - Kazan" , 10 , 850 , 357 , 23);
        System.out.println(testPassengersTrain.equals(testPassengersTrain));

        //Symmetry
        CargoTrain testCargoTrain = new CargoTrain("Astana - Almaty" , 13 , 1205 , 5000 , 293);
        System.out.println(testPassengersTrain.equals(testCargoTrain));
        System.out.println(testCargoTrain.equals(testPassengersTrain));

        //Transitivity
        CargoTrain testCargoTrain1 = new CargoTrain("Saransk - St.Petersburg" , 14 , 670 , 8000 , 29093);
        System.out.println(testPassengersTrain.equals(testCargoTrain));
        System.out.println(testCargoTrain.equals(testCargoTrain1));
        System.out.println(testPassengersTrain.equals(testCargoTrain1));

        //Consistency
        System.out.println(testPassengersTrain.equals(testCargoTrain));
        testCargoTrain.setID(23);
        System.out.println(testPassengersTrain.equals(testCargoTrain));

        //Check for null
        System.out.println(testCargoTrain.equals(null));

                                                         //2)

        System.out.println("Conception's test ignoring hierarchy:");

        PassengerTraingetClass testPassengersTrainG = new PassengerTraingetClass("Moscow - Kazan" , 10 , 850 , 357 , 23);
        System.out.println(testPassengersTrainG.equals(testPassengersTrainG));

        //Symmetry
        CargoTraingetClass testCargoTrainG = new CargoTraingetClass("Astana - Almaty" , 13 , 1205 , 5000 , 293);
        System.out.println(testPassengersTrain.equals(testCargoTrainG));
        System.out.println(testCargoTrainG.equals(testPassengersTrain));

        //Transitivity
        CargoTraingetClass testCargoTrainG1 = new CargoTraingetClass("Saransk - St.Petersburg" , 14 , 670 , 8000 , 29093);
        System.out.println(testPassengersTrainG.equals(testCargoTrainG));
        System.out.println(testCargoTrainG.equals(testCargoTrainG1));
        System.out.println(testPassengersTrainG.equals(testCargoTrain1));

        //Consistency
        System.out.println(testPassengersTrainG.equals(testCargoTrainG));
        testCargoTrain.setID(23);
        System.out.println(testPassengersTrainG.equals(testCargoTrainG));

        //Check for null
        System.out.println(testCargoTrainG.equals(null));
    }
}