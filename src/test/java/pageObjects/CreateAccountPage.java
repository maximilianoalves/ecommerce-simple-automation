package pageObjects;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@Data
@NoArgsConstructor
public class CreateAccountPage extends BasePage {

    public String IDGender = "id_gender1",
            IDFirstName = "customer_firstname",
            IDLastName = "customer_lastname",
            IDPassword = "passwd",
            IDDaysBirthday = "days",
            IDMonthsBirthday = "months",
            IDYearsBirthday = "years",
            IDAddressFirstName = "firstname",
            IDAddressLastName = "lastname",
            IDAddress = "address1",
            IDAddressCity = "city",
            IDAddressState = "id_state",
            IDAddressZipCode = "postcode",
            IDAddressMobilePhone = "phone_mobile",
            IDBtnRegister = "submitAccount";

    public WebElement radioGender() { return driver.findElement(By.id(this.getIDGender())); }
    public WebElement inputFirstName() { return driver.findElement(By.id(this.getIDFirstName())); }
    public WebElement inputLastName() { return driver.findElement(By.id(this.getIDLastName())); }
    public WebElement inputPassword() { return driver.findElement(By.id(this.getIDPassword())); }
    public WebElement selectDaysBirthday() { return driver.findElement(By.id(this.getIDDaysBirthday())); }
    public WebElement selectMonthsBirthday() { return driver.findElement(By.id(this.getIDMonthsBirthday())); }
    public WebElement selectYearsBirthday() { return driver.findElement(By.id(this.getIDYearsBirthday())); }
    public WebElement inputAddressFirstName() { return driver.findElement(By.id(this.getIDAddressFirstName())); }
    public WebElement inputAddressLastName() { return driver.findElement(By.id(this.getIDAddressLastName())); }
    public WebElement inputAdress() { return driver.findElement(By.id(this.getIDAddress())); }
    public WebElement inputAddressCity() { return driver.findElement(By.id(this.getIDAddressCity())); }
    public WebElement selectAddressState() { return driver.findElement(By.id(this.getIDAddressState())); }
    public WebElement inputAddressZipCode() { return driver.findElement(By.id(this.getIDAddressZipCode())); }
    public WebElement inputAddressMobilePhone() { return driver.findElement(By.id(this.getIDAddressMobilePhone())); }
    public WebElement btnRegister() { return driver.findElement(By.id(this.getIDBtnRegister())); }

    public void fastFillInputForm() {
        if (waitElement("id", this.getIDGender())) {
            radioGender().click();
        }
        inputFirstName().sendKeys(faker.name().firstName());
        inputLastName().sendKeys(" " + faker.name().lastName());
        inputPassword().sendKeys("teste123");
        fillSelectDaysBirthday("14");
        fillSelectMonthsBirthday("12");
        fillSelectYearsBirthday("1991");
        inputAddressFirstName().sendKeys(faker.name().firstName());
        inputAddressLastName().sendKeys(" " + faker.name().lastName());
        inputAdress().sendKeys(faker.address().streetName());
        inputAddressCity().sendKeys(faker.address().cityName());
        fillSelectState("19");
        inputAddressZipCode().sendKeys("04017");
        inputAddressMobilePhone().sendKeys(faker.phoneNumber().cellPhone());
        //btn register
        btnRegister().click();
    }

    public void fillSelectDaysBirthday(String day){
        Select days = new Select(this.selectDaysBirthday());
        days.selectByValue(day);
    }

    public void fillSelectMonthsBirthday(String month) {
        Select months = new Select(this.selectMonthsBirthday());
        months.selectByValue(month);
    }

    public void fillSelectYearsBirthday(String year) {
        Select years = new Select(this.selectYearsBirthday());
        years.selectByValue(year);
    }

    public void fillSelectState(String state) {
        Select states = new Select(this.selectAddressState());
        states.selectByValue(state);
    }
}