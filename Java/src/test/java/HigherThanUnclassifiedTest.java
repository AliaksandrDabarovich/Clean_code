import Planes.ExperimentalPlane;

import java.util.List;

public class HigherThanUnclassifiedTest extends BaseTest {
    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){

        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        Assert.assertFalse(airport.getUnclassifiedExperimentalPlanes(experimentalPlanes));
    }
}
