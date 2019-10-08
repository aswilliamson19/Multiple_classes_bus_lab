import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Waverley Station");
        person = new Person();
    }

    @Test
    public void getBusStopName() {
        assertEquals("Waverley Station", busStop.getName());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson(person);
        assertEquals(1, busStop.queueCount());
    }

}
