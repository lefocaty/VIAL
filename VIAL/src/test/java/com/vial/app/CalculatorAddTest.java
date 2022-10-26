package com.vial.app;



import org.junit.Test;

public class CalculatorAddTest {


    private CalculatorAdd calc;
    @Before
    public void setup (){
        this.calc = new CalculatorAdd();
    }
    @After
    public void close(){

    }

    @Test
    public void add(){
        int sum = this.calc.add(10+3);
        assertTrue("10 + 3 ==" + sum, sum == 13);
    }
};
