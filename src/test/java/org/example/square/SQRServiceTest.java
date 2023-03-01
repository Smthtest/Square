package org.example.square;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
@Test
       public void test(){
       SQRService service = new SQRService();
       int numbers;
       int expected = 6;
       int start = 200;
       int finish = 400;
       int actual = service.calcSqr(start, finish);


              Assertions.assertEquals(actual, expected);




}
}
