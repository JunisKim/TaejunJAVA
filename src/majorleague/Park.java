package majorleague;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class Park {
    private String parkKey;
    private String parkName;
    private String parkAlias;
    private String City;
    private String State;
    private String Country;

    public Park(String parkKey, String parkName, String parkAlias
            , String City, String State, String Country ) {
        this.parkKey = parkKey;
        this.parkName = parkName;
        this.parkAlias = parkAlias;
        this.City = City;
        this.State = State;
        this.Country = Country;
    }

    public String getParkKey() {
        return parkKey;
    }

    public void setParkKey(String parkKey) {
        this.parkKey = parkKey;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkAlias() {
        return parkAlias;
    }

    public void setParkAlias(String parkAlias) {
        this.parkAlias = parkAlias;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

}
