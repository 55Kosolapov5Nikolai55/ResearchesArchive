package kosolapov.niko.TrainsinstanceofExample;


import java.util.Objects;

public abstract class Train {
    private String route;
    private int wagons , wayLength , ID;

    public Train() {}

    public Train(String route, int wagons , int wayLength , int ID) {
        this.setRoute(route);
        this.setWagons(wagons);
        this.setWayLength(wayLength);
        this.setID(ID);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        if (route.length() > 0 && route.length() <= 50) {
            this.route = route;
        } else {
            System.out.println("Incorrect name of route!");
        }
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        if (wagons > 0 && wagons <= 30) {
            this.wagons = wagons;
        }else {
            System.out.println("Incorrect wagons' quantity!");
        }
    }

    public int getWayLength() {
        return wayLength;
    }

    public void setWayLength(int wayLength) {
        if(wayLength > 0 && wayLength <= 4500) {
            this.wayLength = wayLength;
        }else {
            System.out.println("Incorrect length of way!");
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID != 0) {
            this.ID = ID;
        }else {
            System.out.println("Incorrect ID!");
        }
    }


    @Override
        public boolean equals(Object o){
        if(this == o)return true;
        if(!(o instanceof Train))return false;
        Train checkTrain = (Train) o;
        return Objects.equals(ID, checkTrain.getID());
        }

        @Override
    public int hashCode() {
        return Objects.hash(ID);
        }
    }