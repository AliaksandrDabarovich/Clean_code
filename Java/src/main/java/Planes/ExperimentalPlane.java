package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private ExperimentalTypes experimentalPlaneType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String planeModel, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, ExperimentalTypes experimentalPlaneType, ClassificationLevel classificationLevel) {
        super(planeModel, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.experimentalPlaneType = experimentalPlaneType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {

        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }



    @Override
    public boolean equals(Object object) {

        return super.equals(object);
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + planeModel + '\'' +
                '}';
    }
}
