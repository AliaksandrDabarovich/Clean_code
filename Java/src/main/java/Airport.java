import Planes.ExperimentalPlane;
import models.ClassificationLevel;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends Plane> allPlanesList;


    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlaneList = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof PassengerPlane) {
                passengerPlaneList.add((PassengerPlane) plane);
            }
        }
        return passengerPlaneList;
    }

    public List<MilitaryPlane> getMilitaryPlane() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<MilitaryType> getMilitaryTypesOfPlanes(List<MilitaryPlane> militaryPlanes, MilitaryType militaryType) {
        List<MilitaryType> militaryTypeList= new ArrayList<>();
        for (MilitaryPlane militaryPlane : militaryPlanes) {
            if ((militaryPlane.getType() == militaryType)) {
                militaryTypeList.add(militaryPlane.getType());
            }
        }
        return militaryTypeList;
    }


    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(militaryPlanes.get(i));
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(militaryPlanes.get(i));
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> ExperimentalPlanes = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof ExperimentalPlane) {
                ExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return ExperimentalPlanes;
    }

    public boolean getUnclassifiedExperimentalPlanes(List<ExperimentalPlane> experimentalPlanes) {
        boolena getUnclassifiedExperimentalPlanes = false;
        for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
            if(experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED){
                classificationBoolean = true;
                break;
            }

        }
        return classificationBoolean;
    }

    public Airport sortByMaximumDistance() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane plane, Plane planeForCompare) {
                return plane.getMaximumFlightDistance() - planeForCompare.getMaximumFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaximumSpeed() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane plane, Plane planeForCompare) {
                return plane.getMaximumSpeed() - planeForCompare.getMaximumSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaximumLoadCapacity() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane plane, Plane planeForCompare) {
                return plane.getMaximumLoadCapacity() - planeForCompare.getMaximumLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return allPlanesList;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + allPlanesList.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.allPlanesList = planes;
    }

}
