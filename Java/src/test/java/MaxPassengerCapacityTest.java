import Planes.PassengerPlane;

public class MaxPassengerCapacityTest extends BaseTest{
    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {

        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }
}
