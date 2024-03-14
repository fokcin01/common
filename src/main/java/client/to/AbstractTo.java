package client.to;

import java.io.Serializable;

public abstract class AbstractTo implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AbstractTo() {
    }

    public AbstractTo(int id) {
        this.id = id;
    }
}
