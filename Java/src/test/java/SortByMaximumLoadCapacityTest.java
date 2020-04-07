import Planes.Plane;
import java.util.List;

public class SortByMaximumLoadCapacityTest extends BaseTest {
    @Test
    public void testSortByMaximumLoadCapacity() {

        Airport airportForComparator =  new Airport(planes);
        airport.sortByMaximumLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        List<? extends Plane> planesSortedByMaxLoadCapacityComparator = airportForComparator.getPlanes();
        LoadCapacityComparator loadCapacityComparator = new LoadCapacityComparator();
        planesSortedByMaxLoadCapacityComparator.sort(loadCapacityComparator);
        Assert.assertEquals(planesSortedByMaxLoadCapacity, planesSortedByMaxLoadCapacityComparator);
    }
}
