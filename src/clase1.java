import org.openqa.selenium.By;
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
		
		WebElement InputSex;
		WebElement InputGender; 
		
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
		//uso de desplegables (fecha de nacimiento)
		Select Drpdia = new Select (Driver.findElementByName("birthday_day"));
		Drpdia.selectByVisibleText("4");
		Select Drpmes = new Select (Driver.findElementByName("birthday_month"));
		Drpmes.selectByVisibleText("dic");
		Select Drpaño = new Select (Driver.findElementByName("birthday_year"));
		Drpaño.selectByVisibleText("1994");
		//para selecion de botones radio (selecion de sexo opcion 3= personaliado)
		InputSex= Driver.findElementByXPath("//input[@value='-1']");
		InputSex.click();
		//seleccion de pronombre
		Select Iproname = new Select (Driver.findElementByName("preferred_pronoun"));
		Iproname.selectByVisibleText("Neutro: \"Salúdalo(a) por su cumpleaños\"");
		
		InputGender= Driver.findElementByName("custom_gender");
		InputGender.sendKeys("happy path XD");
		
		
		
		
		
		//cerrar navegador
		try {	
				Thread.sleep(6000);
			}catch(Exception e) {
			}
		Driver.quit();


	}

 
	
}
