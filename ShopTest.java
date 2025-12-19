import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

    // test    public void setOS(String newOS) 
    @Test
    public void testsetOS() {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        myComputer.setOS("Windows 10"); 
        assertEquals("Windows 10", myComputer.operatingSystem); 

    }

    // test    public ResaleShop() 
    @Test
    public void testResaleShop() {
        ResaleShop shop = new ResaleShop();
        assertNotNull(shop.inventory);
        assertEquals(0, shop.inventory.size());
    }

    // test     public void buy(Computer newComputer) throws Exception 
    @Test
    public void testbuy() throws Exception {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        shop.buy(myComputer); 
        assertTrue(shop.inventory.contains(myComputer));
        assertEquals(1, shop.inventory.size());    
    }

    // test     public void sell(Computer comp) throws Exception 
    @Test
    public void testsell() throws Exception {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        shop.buy(myComputer);
        shop.sell(myComputer);  
        assertEquals(0, shop.inventory.size()); 
        assertFalse(shop.inventory.contains(myComputer));
    }

    // test     public void refurbish(Computer comp, String newOS) throws Exception 
    @Test
    public void testrefurbish() throws Exception {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        shop.buy(myComputer);
        shop.refurbish(myComputer, "MacOS");
        
        assertEquals("MacOS", myComputer.operatingSystem);
        assertNotEquals(1000, myComputer.price);
    }    

    // test    memory parameter
    @Test
    public void testComputerMemory() {
        Computer myComputer = new Computer("2025 MacBook Air", "Intel", 512, 32, "MacOS", 2025, 1000);
        assertEquals(32, myComputer.memory);  
    }

    // test    price parameter  
    @Test
    public void testComputerPrice() {
        Computer myComputer = new Computer("2025 MacBook Air", "Intel", 512, 32, "MacOS", 2025, 1000);
        assertEquals(1000, myComputer.price); 
    }

    // test sell when computer is not in inventory
    @Test(expected = Exception.class)
    public void testSellComputerNotInInventory() throws Exception {
        Computer myComputer = new Computer("2025 MacBook Air", "Intel", 512, 32, "MacOS", 2025, 1000);
        ResaleShop shop = new ResaleShop();
        shop.sell(myComputer); 
    }

    // test refurbsih
    @Test
    public void testRefurbishWithNoneString() throws Exception {
        Computer myComputer = new Computer("2025 MacBook Air", "Intel", 512, 32, "MacOS", 2025, 1000);
        ResaleShop shop = new ResaleShop();
        shop.inventory.clear();
        shop.inventory.add(myComputer);
        shop.refurbish(myComputer, new String("None")); 
        assertEquals("MacOS", myComputer.operatingSystem);
    }

    // test buy()
    @Test
    public void testBuyAddsCorrectComputer() throws Exception {
        Computer myComputer = new Computer("2025 MacBook Air", "Intel", 512, 32, "MacOS", 2025, 1000);
        ResaleShop shop = new ResaleShop();
        shop.inventory.clear();
        shop.buy(myComputer);
        assertEquals("MacOS", shop.inventory.get(0).description);
    }
}
