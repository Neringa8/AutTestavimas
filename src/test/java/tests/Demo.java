package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {

    @Test
    public void testIfNumber4IsEven() {

        //DUOMENYS
        int input = 5;
        int actualRemainder;
        int expectedRemaider = 0;

        // TESTO VEIKSMAI
        actualRemainder = input % 2;

        //PALYGINIMAS
        Assert.assertEquals(actualRemainder, expectedRemaider);
    }

    @Test
    public void testIfTimeIs19Hour() {
        //duomenys
        int expectedHour = 19;
        LocalDateTime actualDateTime = LocalDateTime.now();

        //veiksmai-
        int actualHour = actualDateTime.getHour();

        //palyginimas
        Assert.assertEquals(actualHour, expectedHour, "expected" + expectedHour + ", actual: " + actualHour);
       // Assert.assertTrue(actualHour == expectedHour, "expected" + expectedHour + ", actual: " + actualHour);
    }

    @Test
    public void testGreenIf995DividesBy3WithoutRemainder() {
        int input = 995;
        int actualRemainder;
        int expectedRemainder = 0;
        actualRemainder = input % 3;

        Assert.assertEquals(actualRemainder, expectedRemainder);
    }

    @Test
    public void testIfSiandienTreciadienis() {
        // LocalDate actualDate = LocalDate.now();
        DayOfWeek expectedDay = DayOfWeek.WEDNESDAY;
        LocalDate actualDate = LocalDate.now();
        DayOfWeek actualDay = actualDate.getDayOfWeek();

        Assert.assertEquals(actualDay, expectedDay);
    }

    @Test
    public void testGreenAfterItWaits5s() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
//kiek yra lyginiu sk. nuo 1 iki 10
    @Test
    public void testCountOfEvenNumbersBetween1And10(){
        int actualEvenNumberCounter = 0; //pradedam skaiciuoti nuo 0
        int expectEvenNumberCounter = 4;
        for (int i=1; i <=10; i++){
            if(i % 2 == 0){
                actualEvenNumberCounter++;
            }
        }
       Assert.assertEquals(actualEvenNumberCounter, 4);
    }

}
