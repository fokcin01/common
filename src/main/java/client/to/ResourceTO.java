package client.to;

public class ResourceTO extends AbstractTo {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ResourceTO(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public ResourceTO() {
    }

    @Override
    public String toString() {
        return "ResourceTO{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
