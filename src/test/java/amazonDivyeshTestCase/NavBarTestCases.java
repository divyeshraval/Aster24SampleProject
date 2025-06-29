package amazonDivyeshTestCase;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavBarTestCases {
	/**
	 * This Method is for Invoking browser with given URL
	 */
	RemoteWebDriver driver;

	public static RemoteWebDriver invokebrowser() throws InterruptedException {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		return driver;
	}

	@Test
	public void allManuSlideBar() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		// iiska xpath --> //a[@id="nav-hamburger-menu"] jha id tag aaya wha # lga doo
		driver.findElement(By.cssSelector("a#nav-hamburger-menu")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		// iiska xpath --> //div[@id="hmenu-customer-name"]
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#hmenu-customer-name"))));
	}

	@Test
	public void verifyMXPlayerIconNavigate() throws InterruptedException {
		driver = invokebrowser();

		// iiska xpath --> //a[contains(text(),'MX Player')] Descendant matlb 1 parent
		// ka grandChild, uuske place pr space dal do
		driver.findElement(By.cssSelector("li a.nav-a  ")).click();

		Assert.assertTrue(driver.getCurrentUrl().contains("minitv"));
		driver.close();
	}

	@Test
	public void sell_Link_redirecting_valid_page() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			// normal xpath will be--> //button[@class="a-button-text"] but in
			// cssSelector--> class is equal to dot
			// and remove items like double-slash//, square-bracket[], and double-quots""
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-slot-id=\"nav_cs_1\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("nav_cs_sell_T3"));
		driver.close();
	}

	@Test
	public void bestseller_link_functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_bestsellers\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("bestsellers"));
		driver.close();
	}

	@Test
	public void mobile_link_functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_mobiles\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("mobiles"));
		driver.close();
	}

	@Test
	public void prime_link_functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-slot-id=\"nav-link-amazonprime\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("primelink"));
		driver.close();
	}

	@Test
	public void customerService_LInk_Functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_help\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("customer"));
		driver.close();
	}

	@Test
	public void fashion_LInk_Functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_fashion\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("fashion"));
		driver.close();
	}

	@Test
	public void newRelease_LInk_Functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_newreleases\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("newreleases"));
		driver.close();
	}

	@Test
	public void amazonPay_link_functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_apay\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("apay"));
		driver.close();
	}

	@Test
	public void electronics_link_functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_electronics\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("electronics"));
		driver.close();
	}

	@Test
	public void homeAndKitchen_link_functionality() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_home\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Home-Kitchen"));
		driver.close();
	}

	@Test
	public void computers_link_functionality() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_pc\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("computers"));
		driver.close();
	}

	@Test
	public void carAndMoterbike_link_functionality() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_automotive\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Car-Motorbike-Store"));
		driver.close();
	}

	@Test
	public void books_link_functionality() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_books\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Books"));
		driver.close();
	}

	@Test
	public void prime_link_hoverEffect() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement primeLink = driver.findElement(By.cssSelector("a[data-csa-c-slot-id=\"nav-link-amazonprime\"]"));
		act.moveToElement(primeLink);
		act.perform();
	}

	@Test
	public void todays_deal_Link_functionality() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_gb\"]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("deals"));
		driver.close();
	}

}
