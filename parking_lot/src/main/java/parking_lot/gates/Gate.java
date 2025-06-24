package parking_lot.gates;

public abstract class Gate {
    int id;
    GateType type;
    boolean active;
    boolean isOccupied;


    public Gate(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public GateType getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(GateType type) {
        this.type = type;
    }
}
