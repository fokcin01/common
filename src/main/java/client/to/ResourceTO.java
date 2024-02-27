package client.to;

import org.example.model.Resource;
import org.modelmapper.ModelMapper;

public class ResourceTO {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public ResourceTO(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ResourceTO() {
    }

    public static Resource toEntity(ResourceTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Resource.class);
    }

    public static ResourceTO toDto(Resource entity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, ResourceTO.class);
    }

    @Override
    public String toString() {
        return "ResourceTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
