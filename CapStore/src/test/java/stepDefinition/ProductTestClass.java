package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import productBean.productfactory;

public class ProductTestClass {
	private WebDriver driver;
	private productfactory product;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

@Given("^User is on 'Add Product' page$")
public void user_is_on_Add_Product_page() throws Throwable {
	driver.get("D:\\BDD workspace\\CapStore\\target\\addProduct.html");
	product = new productfactory(driver);
}

@When("^User does not fill the Product Name$")
public void user_does_not_fill_the_Product_Name() throws Throwable {
	product.setPname("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Name'$")
public void displays_Please_fill_the_Product_Name() throws Throwable {
   
  
	String expectedMessage="Please fill the Product Name";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Correct Merchant Id$")
public void user_does_not_fill_the_Correct_Merchant_Id() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Merchant Id'$")
public void displays_Please_fill_the_Merchant_Id() throws Throwable {
   
  
	String expectedMessage="Please fill the Merchant ID";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Product Company$")
public void user_does_not_fill_the_Product_Company() throws Throwable {
   
   // throw new PendingException();
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Company'$")
public void displays_Please_fill_the_Product_Company() throws Throwable {
   
  
	String expectedMessage="Please fill the product's company Name";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not upload the Product Photo$")
public void user_does_not_upload_the_Product_Photo() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("");
	product.setBtnSubmit();

}

@Then("^displays 'Please upload the Photo'$")
public void displays_Please_upload_the_Photo() throws Throwable {
   
  
	String expectedMessage="Please add Photo link";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Product Description$")
public void user_does_not_fill_the_Product_Description() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Description'$")
public void displays_Please_fill_the_Product_Description() throws Throwable {
   
  
	String expectedMessage="Please fill description of product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Product Quantity$")
public void user_does_not_fill_the_Product_Quantity() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Quantity'$")
public void displays_Please_fill_the_Product_Quantity() throws Throwable {
   
  
	String expectedMessage="Please add the quantity of the product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Product Category$")
public void user_does_not_fill_the_Product_Category() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Category'$")
public void displays_Please_fill_the_Product_Category() throws Throwable {
   
  
	String expectedMessage="Please fill the category product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Product Sub-Category$")
public void user_does_not_fill_the_Product_Sub_Category() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("Electronics");
	product.setPsubcat("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Sub-Category'$")
public void displays_Please_fill_the_Product_Sub_Category() throws Throwable {
   
  
	String expectedMessage="Please fill the sub-category product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Product Tag$")
public void user_does_not_fill_the_Product_Tag() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("Electronics");
	product.setPsubcat("phone");
	product.setPtag("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Product Tag'$")
public void displays_Please_fill_the_Product_Tag() throws Throwable {
   
  
	String expectedMessage="Please add the tag of the product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Sold Quantities$")
public void user_does_not_fill_the_Sold_Quantities() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("Electronics");
	product.setPsubcat("phone");
	product.setPtag("blue color");
	product.setPsoldquant("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Sold Quantities'$")
public void displays_Please_fill_the_Sold_Quantities() throws Throwable {
   
  
	String expectedMessage="Please add the sold quantity of the product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User does not fill the Price$")
public void user_does_not_fill_the_Price() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("Electronics");
	product.setPsubcat("phone");
	product.setPtag("blue color");
	product.setPsoldquant("60");
	product.setPprice("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Price'$")
public void displays_Please_fill_the_Price() throws Throwable {
   
  
	String expectedMessage="Please fill the price of the product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^User should fill the date$")
public void user_should_fill_the_date() throws Throwable {
   
   // throw new PendingException();
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("Electronics");
	product.setPsubcat("phone");
	product.setPtag("blue color");
	product.setPsoldquant("60");
	product.setPprice("45000");
	product.setPdate("");
	product.setBtnSubmit();
}

@Then("^displays 'Please fill the Release Date'$")
public void displays_Please_fill_the_Release_Date() throws Throwable {
   
  
	String expectedMessage="Please fill the release date of the product";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@Given("^user is on 'Add Product' page$")
public void user_is_on_Add_Product_page1() throws Throwable {
   
  
	driver.get("D:\\BDD workspace\\CapStore\\target\\addProduct.html");
	product = new productfactory(driver);
}

@When("^user enters vaild product details and clicks on 'Submit' button$")
public void user_enters_vaild_product_details_and_clicks_on_Submit_button() throws Throwable {
   
  
	product.setPname("Mobile");
	product.setId("21");
	product.setPcompany("Samsung");
	product.setPphoto("sam");
	product.setPdesc("samsung");
	product.setPquant("100");
	product.setPcat("Electronics");
	product.setPsubcat("phone");
	product.setPtag("blue color");
	product.setPsoldquant("60");
	product.setPprice("45000");
	product.setPdate("12-08-2015");
	product.setBtnSubmit();
}

@Then("^display 'Product Added successfully !!!'$")
public void display_Product_Added_successfully() throws Throwable {
	String expectedMessage="added succesfully";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

@Then("^User can again fill the details$")
public void user_can_again_fill_the_details() throws Throwable {
   driver.get("D:\\BDD workspace\\CapStore\\target\\addProduct.html");
}

@Given("^user is on 'Show Product' page$")
public void user_is_on_Show_Product_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.get("D:\\BDD workspace\\CapStore\\target\\productlist.html");
}

@Then("^display all the products in the list!!\\.$")
public void display_all_the_products_in_the_list() throws Throwable {
	System.out.println("Products Displayed ");
	}

}
