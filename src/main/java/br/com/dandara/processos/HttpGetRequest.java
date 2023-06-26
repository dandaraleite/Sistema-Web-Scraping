package br.com.dandara.processos;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpGetRequest  {
        public String getPage(String pid) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/dandara/Downloads/chromedriver_linux64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://patentscope.wipo.int/search/pt/detail.jsf?docId=" + pid + "&redirectedID=true");
        Thread.sleep(15000);
        String page = driver.getPageSource();

        System.out.println(page);
        driver.quit();

        return page;
    }
}