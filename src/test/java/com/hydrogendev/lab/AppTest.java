package com.hydrogendev.lab;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(JUnitParamsRunner.class)
public class AppTest {

    App app = new App();

    @Test
    public void testName() throws Exception {

    }
    @Test
    public void testFibo() throws Exception {
        assertThat(app.fibo(5),is(5));
        assertThat(app.fibo(13),is(233));
    }
}
