package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AssertionsClass {
    private final WebDriver driver;
    private final ElementsClass elementsClass;
    private final WaitersClass waiters;
    private final ActionClass action;

    public AssertionsClass(WebDriver driver) {
        this.driver = driver;
        elementsClass = new ElementsClass(driver);
        waiters = new WaitersClass(driver);
        action = new ActionClass(driver);
    }

    public void equalsOfInts(int actual, int expected){
        Assert.assertEquals(actual, expected, "Я ожидал получить " + expected + ", а получил " + actual);
    }
}
