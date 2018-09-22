import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Rough {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("This is samars project");
		System.out.println(System.getProperty("user.dir"));
		Properties conf = new Properties();
		FileInputStream fis = new FileInputStream("E:\\eclipse-photon\\TestProject\\src\\test\\resources\\properties\\Config.properties");
		conf.load(fis);
		
		System.out.println(conf.getProperty("browser"));

	}

}
