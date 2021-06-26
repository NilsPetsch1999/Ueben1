package at.petsch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {


    @Test
    public void test_calculateUptime_shouldBeCalculatedCorrectly(){
        //Arrange
        UptimeController controller = new UptimeController();

        //Act

        //Assert
        Assertions.assertEquals("43178,40", controller.calculateUptime(99.95));


    }
}
