package com.github.erodriguezguitest.uitest.core;

import org.awaitility.Duration;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;


@RunWith(Arquillian.class)
public abstract class BaseUITest {
    private static Logger log = LoggerFactory.getLogger(BaseUITest.class);

    @Drone
    private WebDriver browser;

    @Before
    public void before() {
        browser.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @After
    public void after() throws Exception {
        browser.manage().getCookies().clear();
    }

    @Deployment(testable = false)
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}