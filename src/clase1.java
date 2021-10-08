import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clase1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\MIKE 300\\Descargas\\software\\ArkusNexus\\QA\\driverChrome94\\chromedriver.exe");
		//creando un objeto
		//clase,tipo de objeto
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");

		try {
		//intenta hacer esto y si falla?	
			Thread.sleep(1000);
			//hacer esto otro
		}catch(Exception e) {
		}
		//creamos 3 objetos, ayuda a no volver a inicializar la busqueda
		WebElement InputEmail;
		WebElement InputPassword;
		WebElement ButtonLogin;
		WebElement ButtonRegistrer;
		
		InputEmail= Driver.findElementByName("email");
		InputPassword= Driver.findElementByName("pass");
		ButtonLogin= Driver.findElementByName("login");
		//vamos a interactuar con los 3 elementos
		InputEmail.sendKeys("gread!");
		InputPassword.sendKeys("uyy-Kieto");
		String txtEmail = InputEmail.getAttribute("value");
		String txtPassword = InputPassword.getAttribute("value");
		//imprimimos
		System.out.println("id: "+txtEmail);
		System.out.println("contraseña: "+txtPassword);
		ButtonLogin.click();
		
		
		try {
				Thread.sleep(3000);
			}catch(Exception e) {
			}
		Driver.navigate().back();
		
		ButtonRegistrer= Driver.findElementByLinkText("Crear cuenta nueva");
		ButtonRegistrer.click();
		try {	
		Thread.sleep(3000);
	}catch(Exception e) {
	}

		
		//iniciamos con el registro
		Driver.findElementByName("firstname").sendKeys("darth");
		Driver.findElementByName("lastname").sendKeys("vader");
		Driver.findElementByName("reg_email__").sendKeys("+52 0000000011");
		Driver.findElementByName("reg_passwd__").sendKeys("zzz");
		//uso de desplegables
		Select Drpdia = new Select (Driver.findElementByName("birthday_day"));
		Drpdia.selectByVisibleText("4");
		Select Drpmes = new Select (Driver.findElementByName("birthday_month"));
		Drpmes.selectByVisibleText("dic");
		Select Drpaño = new Select (Driver.findElementByName("birthday_year"));
		Drpaño.selectByVisibleText("1994");
		
		Driver.findElementByLinkText("Personalizado");
		
		
		
		
		
		
		//try {	
				//Thread.sleep(3000);
			//}catch(Exception e) {
			//}
		//Driver.quit();


	}

 
	
}



//todo  donde su id = 'esto'
//  *  [@id         = "email"]
//Driver.findElementByXPath("//*[@id= 'email']")
