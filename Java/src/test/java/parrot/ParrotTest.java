package parrot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = ParrotBuilder.build(0,0, false).european();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot =   ParrotBuilder.build(1,0, false).african();
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = ParrotBuilder.build(2,0, false).african();
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = ParrotBuilder.build(0,0, false).african();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = ParrotBuilder.build(0,1.5, true).norwegianBlue();
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = ParrotBuilder.build(0,1.5, false).norwegianBlue();
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = ParrotBuilder.build(0,4, false).norwegianBlue();
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
}
