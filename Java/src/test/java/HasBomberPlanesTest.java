import Planes.MilitaryPlane;
import models.MilitaryType;

import java.util.List;

public class HasBomberPlanesTest extends BaseTest {
    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {

        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        List <MilitaryType> bomberMilitaryTypeList = airport.getMilitaryTypesOfPlanes(bomberMilitaryPlanes, MilitaryType.BOMBER);
        Assert.assertThat(bomberMilitaryTypeList, hasItems(MilitaryType.BOMBER));
    }
}
