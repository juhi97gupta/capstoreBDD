package productBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productfactory {
	WebDriver driver;
	
	@FindBy(name="Pname")
	@CacheLookup
	WebElement Pname;
	
	@FindBy(name="id")
	@CacheLookup
	WebElement id;
	
	@FindBy(name="Pcompany")
	@CacheLookup
	WebElement Pcompany;
	
	@FindBy(name="Pphoto")
	@CacheLookup
	WebElement Pphoto;
	
	@FindBy(name="Pdesc")
	@CacheLookup
	WebElement Pdesc;
	
	@FindBy(name="Pquant")
	@CacheLookup
	WebElement Pquant;
	
	@FindBy(name="Pcat")
	@CacheLookup
	WebElement Pcat;
	
	@FindBy(name="Psubcat")
	@CacheLookup
	WebElement Psubcat;
	
	@FindBy(name="Ptag")
	@CacheLookup
	WebElement Ptag;
	
	@FindBy(name="Psoldquant")
	@CacheLookup
	WebElement Psoldquant;
	
	@FindBy(name="Pprice")
	@CacheLookup
	WebElement Pprice;
	
	@FindBy(name="Pdate")
	@CacheLookup
	WebElement Pdate;
	
	@FindBy(id="btnSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(id="btnReset")
	@CacheLookup
	WebElement btnReset;
	
	@FindBy(id="btnshow")
	@CacheLookup
	WebElement btnshow;

	
	public productfactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,  this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname.sendKeys(pname); 
	}

	public WebElement getId() {
		return id;
	}

	public void setId(String id) {
		this.id.sendKeys(id); 
	}

	public WebElement getPcompany() {
		return Pcompany;
	}

	public void setPcompany(String pcompany) {
		Pcompany.sendKeys(pcompany); 
	}

	public WebElement getPphoto() {
		return Pphoto;
	}

	public void setPphoto(String pphoto) {
		Pphoto.sendKeys(pphoto); 
	}

	public WebElement getPdesc() {
		return Pdesc;
	}

	public void setPdesc(String pdesc) {
		Pdesc.sendKeys(pdesc); 
	}

	public WebElement getPquant() {
		return Pquant;
	}

	public void setPquant(String pquant) {
		Pquant.sendKeys(pquant) ;
	}

	public WebElement getPcat() {
		return Pcat;
	}

	public void setPcat(String pcat) {
		Pcat.sendKeys(pcat);
	}

	public WebElement getPsubcat() {
		return Psubcat;
	}

	public void setPsubcat(String psubcat) {
		Psubcat.sendKeys(psubcat);
	}

	public WebElement getPtag() {
		return Ptag;
	}

	public void setPtag(String ptag) {
		Ptag.sendKeys(ptag); 
	}

	public WebElement getPsoldquant() {
		return Psoldquant;
	}

	public void setPsoldquant(String psoldquant) {
		Psoldquant.sendKeys(psoldquant) ;
	}

	public WebElement getPprice() {
		return Pprice;
	}

	public void setPprice(String pprice) {
		Pprice.sendKeys(pprice);
	}

	public WebElement getPdate() {
		return Pdate;
	}

	public void setPdate(String pdate) {
		Pdate.sendKeys(pdate); 
	}

	public void setBtnSubmit() {
		this.btnSubmit.click();
	}

	public void setBtnReset() {
		this.btnReset.click();
	}
	public void setBtnshow() {
		this.btnshow.click();
	}
	
}
