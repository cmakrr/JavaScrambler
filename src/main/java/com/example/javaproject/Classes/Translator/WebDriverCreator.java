package com.example.javaproject.Classes.Translator;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {

    protected WebDriverCreator(String webDriverPath){
        setWebDriverPath(webDriverPath);
    }

    protected abstract void setWebDriverPath(String webDriverPath);

    public abstract WebDriver createWebDriver();
}
