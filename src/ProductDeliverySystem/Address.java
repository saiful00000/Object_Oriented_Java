package ProductDeliverySystem;

public class Address {

    private String area;
    private String sector;
    private String roadNumber;
    private String houseNumber;

    public Address(String area,String sector, String roadNumber, String houseNumber) {
        this.area = area;
        this.sector = sector;
        this.roadNumber = roadNumber;
        this.houseNumber = houseNumber;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setRoadNumber (String roadNumber) {
        this.roadNumber = roadNumber;
    }

    public String getRoadNumber() {
        return roadNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
