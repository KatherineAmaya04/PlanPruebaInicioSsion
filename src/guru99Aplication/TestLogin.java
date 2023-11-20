package guru99Aplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogin {
	ChromeDriver driver;
	String url = "http://127.0.0.1:8000/index";
	@Test(priority = -100)
	public void invocarNavegador() {
		//Cambiar esta ruta por la ruta donde tienes el chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KatherineSanchez\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//instancia
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@Test(priority = 1)
	public void verificarLoginAseisNew() {
		//para identificar elementos como el id, Selenium provee una interfaz llamada WebElement
		WebElement userEmail = driver.findElement(By.name("email")); //locator 
		WebElement userPassword = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		//Credenciales de un administrador
    	userEmail.sendKeys("cm18064@ues.edu.sv");
		userPassword.sendKeys("Minerva.23");
		//CREDENCIALES ESTUDIANTE
//		userEmail.sendKeys("ga19014@ues.edu.sv");
//		userPassword.sendKeys("Minerva.23");
		//Credenciales de un docente
//		userEmail.sendKeys("docente2@ues.edu.sv");
//		userPassword.sendKeys("Minerva.23");
		loginButton.click();	
	}
	
//	@Test(priority = 2)
//	public void addCustomer() {
//		WebElement addCustomerLink = driver.findElement(By.linkText("New Customer"));
//		addCustomerLink.click();
//		
//		driver.findElement(By.xpath("//input[@value='m']")).click();
//		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Avenida inclusion");
//		driver.findElement(By.name("name")).sendKeys("Danys");
//		driver.findElement(By.name("city")).sendKeys("San francisco gotera");
//		driver.findElement(By.name("dob")).sendKeys("00112987");
//		driver.findElement(By.name("state")).sendKeys("San carlos");
//		
//		driver.findElement(By.name("pinno")).sendKeys("123456");
//		driver.findElement(By.name("telephoneno")).sendKeys("77918927");
//		driver.findElement(By.name("emailid")).sendKeys("magiye1491@rdluxe.com");
//		driver.findElement(By.name("password")).sendKeys("elcun");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}

}
