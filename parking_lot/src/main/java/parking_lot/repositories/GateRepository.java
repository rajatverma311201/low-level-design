package parking_lot.repositories;

import parking_lot.gates.Gate;

import java.util.List;

public class GateRepository {
    List<Gate> gates;

    public GateRepository() {
    }

    public GateRepository(List<Gate> gates) {
        this.gates = gates;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
    }

    public void addGate(Gate gate) {
        gates.add(gate);
    }

    public void removeGate(Gate gate) {
        gates.remove(gate);
    }

    public void removeGate

    public void clearGates() {
        gates.clear();
    }

}
