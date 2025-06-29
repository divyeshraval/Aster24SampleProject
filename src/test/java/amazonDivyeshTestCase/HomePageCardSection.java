package amazonDivyeshTestCase;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HomePageCardSection {

	@Test
	public void making_HomePage_Appliance_For_Your_Home_Card_Dynamically_Checking_All_four_Cards() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		for (int i = 0; i < 4; i++) {
			List<WebElement> options = driver.findElements(By.cssSelector("div#desktop-grid-1 span.a-size-small"));
			String cardText = options.get(i).getText().toLowerCase();

			options.get(i).click();
			String categoryText = driver
					.findElement(By.cssSelector("span[class=\"a-size-base a-color-base a-text-bold\"]")).getText();

			if (categoryText.toLowerCase().contains(cardText.toLowerCase())) {
				System.out.println("U are on the right page for " + cardText);
			} else {
				System.out.println("You are on wrong page for " + cardText);
			}
			driver.navigate().back();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.close();
	}

	@Test
	public void call_To_Action_link_SeeMore_working_functionality_from_Appliance_for_Your_home_ProductsCategoriesCard_section() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.cssSelector("button.a-button-text")).click();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		driver.findElement(By.cssSelector(
				"a[aria-label=\"Appliances for your home | Up to 55% off - See more\"] span.a-truncate-cut")).click();
		driver.close();
	}

	@Test
	public void call_To_Action_Link_ExploreAll_Functionality_from_Revamp_your_Home_In_Style_ProductsCategoriesCards_Section() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("div#desktop-grid-2 span.a-truncate-cut")).click();
		if (driver.findElement(By.cssSelector("a[aria-label=\"Decor\"] span.sl-sobe-carousel-sub-card-title")).getText()
				.toLowerCase().contains("decor")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
		driver.close();
	}

	@Test
	public static void call_To_Action_Link_SeeAllDeals_Functionality_From_PlayStation_Five_Slim() {
		RemoteWebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#desktop-grid-3 span.a-truncate-cut")).click();
		if(driver.findElement(By.cssSelector("ul[aria-labelledby=\"n-title\"] h2")).getText().toLowerCase().contains("video games")) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		driver.close();
	}

	@Test
	public static void making_HomePage_Product_Category_Cards_From_PlayStation_Five_Slim_Accessories_Card_Dynamically_Checking_All_four_Cards() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		for (int i = 0; i < 4; i++) {
			List<WebElement> categoryCards = driver
					.findElements(By.cssSelector("div#desktop-grid-3 span.a-size-small"));
			String cardsText = categoryCards.get(i).getText().toLowerCase();
			categoryCards.get(i).click();

			String innerCardText = driver
					.findElement(By.cssSelector("a[href=\"/b/ref=dp_bc_2?ie=UTF8&node=20904621031\"]")).getText();
			if (innerCardText.toLowerCase().contains(cardsText.toLowerCase())) {
				System.out.println("You are on Right Page " + cardsText);
			} else {
				System.out.println("You are on Wrong Page " + cardsText);
			}
			driver.navigate().back();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.close();
	}

	@Test
	public void making_HomePage_Revamp_Your_Home_In_Style_Card_Dynamically_Checking_All_four_Cards() {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		for (int i = 0; i < 4; i++) {
			List<WebElement> options = driver.findElements(By.cssSelector("div#desktop-grid-2 span.a-size-small"));
			String cardText = options.get(i).getText().toLowerCase();
			options.get(i).click();

			String categoryText = driver.findElement(By.cssSelector("span.a-list-item span:nth-child(2)")).getText();

			if (categoryText.toLowerCase().contains(cardText.toLowerCase())) {
				System.out.println("You Are on Right Page " + cardText);
			} else {
				System.out.println("You are on Wrong Page " + cardText);
			}
			driver.navigate().back();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.close();
	}

}
