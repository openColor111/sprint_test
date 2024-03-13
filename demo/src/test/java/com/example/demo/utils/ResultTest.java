package com.example.demo.utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ResultTest {
    @Test
    public void buildResultTest(){
        Result r = new Result();
        r.setData(null);
        r.setCode(200);
        r.setMsg("ok");
        Assert.assertEquals(r.getMsg(),"ok");
    }


}
