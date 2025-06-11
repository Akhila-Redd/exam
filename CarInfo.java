package cars24;

public class CarInfo {
    private String carId;
    private String carName;
    private String carType;
    private String city;

    public CarInfo(String carId, String carName, String carType, String city) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.city = city;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String checkAvailability() {
        String name = carName.toLowerCase();
        String type = carType.toLowerCase();
        String cityName = city.toLowerCase();

        if (!(name.equals("nissan") || name.equals("ford"))) {
            return "Invalid Details";
        }

        if (!(type.equals("sedan") || type.equals("suv") || type.equals("muv"))) {
            return "Invalid Details";
        }

        if (!(cityName.equals("newyork") || cityName.equals("denver") || cityName.equals("losangels"))) {
            return "Invalid Details";
        }

        // Car mapping
        if (name.equals("nissan")) {
            switch (type) {
                case "sedan": return "Availablecarandpriceis:Kicksand$8400.0";
                case "suv": return "Availablecarandpriceis:Magniteand$10800.0";
                case "muv": return "Availablecarandpriceis:Terranoand$14400.0";
            }
        } else if (name.equals("ford")) {
            switch (type) {
                case "sedan": return "Availablecarandpriceis:Figoand$4802.0";
                case "suv": return "Availablecarandpriceis:Eco Sportand$9605.0";
                case "muv": return "Availablecarandpriceis:Endeavourand$21600.0";
            }
        }

        return "Invalid Details";
    }
}
