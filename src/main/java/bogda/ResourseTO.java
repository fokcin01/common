package bogda;

public class ResourseTO{
    private String name;
    private int price;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public ResourseTO(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
}