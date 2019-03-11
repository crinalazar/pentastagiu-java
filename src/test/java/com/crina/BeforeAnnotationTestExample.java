package com.crina;

import org.junit.*;

public class BeforeAnnotationTestExample {
@Test
    public void testNothing() {
        String expected = "aaa";
        String result = "aaa";
        Assert.assertEquals("should have expected result",expected,result);
    }

    @Test
    @Ignore
    public void testSomething() {
        String expected = "aba";
        String result = "aaa";
        Assert.assertEquals("should have expected result",expected,result);
    }
@Before
    public void before(){
    System.out.println("before");
    }
@After
    public void after() {
    System.out.println("after");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }
}
