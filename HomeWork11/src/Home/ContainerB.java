package Home;

import java.util.Collection;
import java.util.List;

public class ContainerB {
    List<Model> modelListB;


    public ContainerB(List<Model> modelListB) {
        this.modelListB = modelListB;
    }

    public List<Model> getModelListB() {
        return modelListB;
    }

    public void setModelListB(List<Model> modelListB) {
        this.modelListB = modelListB;
    }

    @Override
    public String toString() {
        return "ContainerB{" +
                "modelListB=" + modelListB +
                '}';
    }


}
