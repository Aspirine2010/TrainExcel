public class Emloyee {
    private String model;
    private String price;
    private String info;
    private  String date;

    public Emloyee(String model, String price, String info, String date) {
        this.model = model;
        this.price = price;
        this.info = info;
        this.date = date;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }

    public String getDate() {
        return date;
    }
}
