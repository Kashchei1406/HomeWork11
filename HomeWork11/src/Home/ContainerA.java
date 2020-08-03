package Home;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContainerA {
    List<Model> modelListA = new ArrayList<>();
    ContainerB containerB;

    public ContainerA(List<Model> modelListA, ContainerB containerB) {
        this.modelListA = modelListA;
        this.containerB = containerB;
    }

    public List<Model> getModelListA() {
        return modelListA;
    }

    public void setModelListA(List<Model> modelListA) {
        this.modelListA = modelListA;
    }

    public ContainerB getContainerB() {
        return containerB;
    }

    public void setContainerB(ContainerB containerB) {
        this.containerB = containerB;
    }

    @Override
    public String toString() {
        return "ContainerA{" +
                "modelListA=" + modelListA +
                ", containerB=" + containerB +
                '}';
    }
}
