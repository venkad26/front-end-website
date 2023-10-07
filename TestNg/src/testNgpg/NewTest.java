package testNgpg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {
  @Test
 

  public class Project2 {
  	
  	public WebDriver driver;

  	public void main(String[] args) throws InterruptedException {
  		System.setProperty("webdriver.chrome.driver", "C:/Users/Home/Downloads/chromedriver-win64/chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.manage().deleteAllCookies();

  		driver.get("https://adactinhotelapp.com/index.php");
  		driver.manage().window().maximize();

  		Thread.sleep(3000);
  		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
  		username.sendKeys("Vengadmanikandan");
  		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
  		password.sendKeys("Venki@2002");
  		Thread.sleep(5000);

  		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
  		login.click();

  		Thread.sleep(5000);
  		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
  		location.click();
  		Select s = new Select(location);
  		s.selectByVisibleText("Sydney");
  		Thread.sleep(4000);
  		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
  		hotels.click();
  		Select s2 = new Select(hotels);
  		s2.selectByVisibleText("Hotel Sunshine");
  		Thread.sleep(2000);

  		WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
  		room_type.click();
  		Select s3 = new Select(room_type);
  		s3.selectByValue("Super Deluxe");

  		WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
  		room_nos.click();
  		Select s4 = new Select(room_nos);
  		s4.selectByVisibleText("1 - One");
  		WebElement datepick_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
  		datepick_in.sendKeys("08/07/2022");
  		WebElement datepick_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
  		datepick_out.sendKeys("09/07/2022");
  		WebElement adult_room = driver.findElement(By.xpath("//select[@id='adult_room']"));
  		adult_room.click();
  		Select s5 = new Select(adult_room);
  		s5.selectByVisibleText("1 - One");

  		Thread.sleep(5000);
  		WebElement Submit = driver.findElement(By.xpath("//input[@id='Submit']"));
  		Submit.click();
  		Thread.sleep(10000);
  		WebElement radiobutton_0 = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
  		radiobutton_0.click();
  		Thread.sleep(4000);
  		WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
  		continue_btn.click();

  		WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
  		first_name.sendKeys("Venkadesan");
  		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
  		last_name.sendKeys("Manikandan");
  		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
  		address.sendKeys("Chennai, India");

  		WebElement cc_num = driver.findElement(By.xpath("//input[@id='cc_num']"));
  		cc_num.sendKeys("1356789123456792");
  		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
  		cc_type.click();
  		Select s6 = new Select(cc_type);
  		s6.selectByVisibleText("VISA");
  		WebElement cc_exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
  		cc_exp_month.click();
  		Select s7 = new Select(cc_exp_month);
  		s7.selectByVisibleText("July");
  		WebElement cc_exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
  		cc_exp_year.click();
  		Select s8 = new Select(cc_exp_year);
  		s8.selectByVisibleText("2022");
  		WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
  		cc_cvv.sendKeys("135");
  		Thread.sleep(5000);
  		WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
  		book_now.click();
  		Thread.sleep(5000);

  		WebElement my_itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
  		my_itinerary.click();
  		Thread.sleep(5000);

  		WebElement order_id = driver.findElement(By.xpath("//input[@id='order_id_text']"));
  		order_id.sendKeys("VLJ8RC0R0B");
  		WebElement search_hotel = driver.findElement(By.xpath("//input[@id='search_hotel_id']"));
  		search_hotel.click();

  		WebElement check_box = driver.findElement(By.xpath("//input[@name='ids[]']"));
  		check_box.click();

  		Thread.sleep(5000);

  		WebElement search_btn = driver.findElement(By.xpath("//input[@id='search_hotel']"));
  		search_btn.click();

  		WebElement location_btn = driver.findElement(By.xpath("//select[@id='location']"));
  		location_btn.click();
  		Select r = new Select(location_btn);
  		r.selectByVisibleText("Melbourne");

  		WebElement hotel_btn = driver.findElement(By.xpath("//select[@id='hotels']"));
  		hotel_btn.click();
  		Select r2 = new Select(hotel_btn);
  		r2.selectByVisibleText("Hotel Hervey");

  		WebElement rooms_btn = driver.findElement(By.xpath("//select[@id='room_nos']"));
  		rooms_btn.click();
  		Select r3 = new Select(rooms_btn);
  		r3.selectByVisibleText("3 - Three");

  		WebElement date_Btn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
  		date_Btn.sendKeys("14/07/2022");

  		WebElement date_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
  		date_out.sendKeys("16/07/2022");

  		WebElement adult_room_btn = driver.findElement(By.xpath("//select[@id='adult_room']"));
  		adult_room_btn.click();
  		Select r4 = new Select(adult_room_btn);
  		r4.selectByVisibleText("2 - Two");

  	WebElement child_room_btn = driver.findElement(By.xpath("//select[@id='child_room']"));
  	child_room_btn.click();
  	Select r5 = new Select(child_room_btn);
  	r5.selectByVisibleText("1 - One");
  	
  	WebElement submit_btn = driver.findElement(By.xpath("//input[@id='Submit']"));
  	submit_btn.click();
  	Thread.sleep(3000);
  	WebElement rdio_btn = driver.findElement(By.xpath("//input[@id='radiobutton_4']"));
  	rdio_btn.click();
  	
  	WebElement contnue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
  	contnue_btn.click();
  	
  	WebElement frst_name = driver.findElement(By.xpath("//input[@id='first_name']"));
  	frst_name.sendKeys("venkad");
  	
  	WebElement lst_name = driver.findElement(By.xpath("//input[@id='last_name']"));
  	lst_name.sendKeys("abi");
  	
  	WebElement adress = driver.findElement(By.xpath("//textarea[@id='address']"));
  	adress.sendKeys("Chennai, Tamil Nadu, India");
  	
  	WebElement credit = driver.findElement(By.xpath("//input[@id='cc_num']"));
  	credit.sendKeys("1356789123456792");
  	
  	WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
  	Select r1 = new Select(card);
  	r1.selectByVisibleText("American Express");
  	
  	WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
  	Select h1 = new Select(month);
  	h1.selectByVisibleText("July");
  	
  	WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
  	Select h2 = new Select(year);
  	h2.selectByVisibleText("2022");
  	
  	WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
  	cvv.sendKeys("234");
  	
  	WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
  	book.click();
  	
  	WebElement my_itiny = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
  	my_itiny.click();
  	Thread.sleep(5000);
  	
  	}

  }


  public void f() {
  }
}
