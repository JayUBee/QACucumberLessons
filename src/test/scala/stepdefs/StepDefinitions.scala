package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

class StepDefinitions extends ScalaDsl with EN {

  val driver: WebDriver = new ChromeDriver()
  Given("""^the user is on Login Page$"""){ () =>

    driver.get("https://parabank.parasoft.com/parabank/index.html")
  }

  When("""^the user enters valid username and password$"""){ () =>

    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("john")
    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("demo")
  }

  And("""the user clicks on login button"""){ () =>

    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click()
  }

  Then("""the user should be logged in successfully"""){ () =>

    val headerActual = driver.findElement(By.tagName("h1")).getText
    val headerExpected = "Accounts Overview"
    if (headerActual == headerExpected){
      println("Login Successfully!")
      driver.quit()
    }
  }


}