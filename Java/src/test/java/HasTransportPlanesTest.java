import Planes.ExperimentalPlane;
import models.ClassificationLevel;
import models.ExperimentalTypes;
import models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.Test;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HasTransportPlanesTest extends BaseTest{

    @Test
    public void testHasAtLeastOneTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        List <MilitaryType> transportMilitaryTypeList = airport.getMilitaryTypesOfPlanes(transportMilitaryPlanes, MilitaryType.TRANSPORT);
        Assert.assertThat(transportMilitaryTypeList, hasItems(MilitaryType.TRANSPORT));
    }



}
