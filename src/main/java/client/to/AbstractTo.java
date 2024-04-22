package client.to;

import java.io.Serializable;

public abstract class AbstractTo implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AbstractTo() {
    }

    public AbstractTo(Integer id) {
        this.id = id;
    }
}
