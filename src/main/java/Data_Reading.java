import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;

public class Data_Reading {



    @DataProvider
    public static Object[][] ReadVariant() throws IOException
    {
        FileInputStream fileInputStream= new FileInputStream("file_location"); //Excel sheet file location get mentioned here
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


        Object Data[][]= new Object[1][2]; // pass my  count data in array
            System.out.println("Hello thsi is the first change in my GIT project ");

        return Data;
    }
}





