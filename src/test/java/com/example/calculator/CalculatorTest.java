package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void test_양수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);
        //      System.out.println("result=" + result);
        //       if (result == 9) {
        //           System.out.println("성공");
        //       }else {
 //           System.out.println("실패");
 //       }
        assertEquals("add 함수의 결과는 9이어야 합니다.",9,result);
    }
    @Test
    public void test_음수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(-5, -4);

        assertEquals("add 함수의 결과는 -9이어야 합니다.",-9,result);
    }

    @Test
    public void test_양수덧셈2() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);

        assertNotEquals(0,result);
    }

    @Test
    public void test_정수나눗셈() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void test_실수나눗셈() {
        Calculator calc = new Calculator();
        double result = calc.divide(10.0, 4.0);
        assertEquals(2.5,result,0.0f);
    }

    @Test(expected = ArithmeticException.class)
    public void test_0으로나누기() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 0);
        assertEquals(0, result);

    }
}
