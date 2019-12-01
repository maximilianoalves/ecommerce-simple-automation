# Simples estrutura de automação para ecommerce

## Ferramentas utilizadas:
- [VSCode](https://code.visualstudio.com/ "VSCode") / [IntelliJ CE](https://www.jetbrains.com/idea/download/ "IntelliJ CE")
- [Junit](https://mvnrepository.com/artifact/junit/junit/4.12 "Junit")
- [Javafaker](https://github.com/DiUS/java-faker "Javafaker")
- [TestNG](http://testng.org/ "TestNG")
- [Selenium JAVA](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java "Selenium JAVA")
- [Lombok](https://projectlombok.org/ "Lombok")
- [Allure report](https://docs.qameta.io/allure/ "Allure report")

## Recursos utilizados no projeto
- **Selenium:**
    - WebElement
    - click
    - ExpectedConditions
    - findElement(s)
    - getText
    - sendKeys
- **Java:**
    - Faker
    - Junit 4.12

## Estrutura de pastas

```
📦ecommerce-simple-automation
 ┣ 📂src
 ┃ ┣ 📂test
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┣ 📂pageObjects
 ┃ ┃ ┃ ┃ ┣ 📜AddressCheckoutPage.java
 ┃ ┃ ┃ ┃ ┣ 📜BasePage.java
 ┃ ┃ ┃ ┃ ┣ 📜CartPage.java
 ┃ ┃ ┃ ┃ ┣ 📜CategoryPage.java
 ┃ ┃ ┃ ┃ ┣ 📜HomePage.java
 ┃ ┃ ┃ ┃ ┣ 📜LoginPage.java
 ┃ ┃ ┃ ┃ ┣ 📜MyAccountPage.java
 ┃ ┃ ┃ ┃ ┣ 📜OrderCompletePage.java
 ┃ ┃ ┃ ┃ ┣ 📜PaymentConfirmOrderPage.java
 ┃ ┃ ┃ ┃ ┣ 📜PaymentTypePage.java
 ┃ ┃ ┃ ┃ ┣ 📜ProductDetailPage.java
 ┃ ┃ ┃ ┃ ┗ 📜ShippingPage.java
 ┃ ┃ ┃ ┣ 📂tests
 ┃ ┃ ┃ ┃ ┣ 📜BaseTest.java
 ┃ ┃ ┃ ┃ ┗ 📜CommerceFlowTest.java
 ┃ ┃ ┃ ┣ 📂utils
 ┃ ┃ ┃ ┃ ┣ 📜Browser.java
 ┃ ┃ ┃ ┃ ┗ 📜Utils.java
 ┃ ┃ ┃ ┗ 📜.DS_Store
 ┃ ┃ ┣ 📂resources
 ┃ ┃ ┃ ┗ 📜allure.properties
 ┃ ┃ ┗ 📜.DS_Store
 ┃ ┗ 📜.DS_Store
 ┣ 📜.gitignore
 ┣ 📜README.md
 ┣ 📜pom.xml
 ┣ 📜testng.xml
 ┗ 📜treinamentoweb.iml
```

## Tutorial, Instalação e execução

utilizao webdriver-manager do npm

primeiro webdriver-manager update
depois webdriver-manager start

Exec:
`mvn clean test`  
Report:
`mvn allure:serve`